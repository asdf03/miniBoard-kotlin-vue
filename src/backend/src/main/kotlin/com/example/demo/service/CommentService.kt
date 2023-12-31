package com.demo.service

import com.demo.model.Comment
import com.demo.repository.CommentRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.Optional

@Service
class CommentService(private val commentRepository: CommentRepository) {
  
  @Transactional
  fun createComment(comment: Comment): Comment {
    return commentRepository.save(comment)
  }

  fun findAllComment(): List<Comment> {
    return commentRepository.findAll()
  }

  fun findCommentById(id: Long): Comment? {
    return commentRepository.findById(id).orElse(null)
  }

  fun findAllCommentByMessageId(messageId: Long): List<Comment> {
    return commentRepository.findAllByMessageId(messageId)
  }

  fun findAllCommentByUserId(userId: Long): List<Comment> {
    return commentRepository.findAllByUserId(userId)
  }

  @Transactional
  fun updateComment(id: Long, updatedComment: Comment): Optional<Comment> {
    return commentRepository.findById(id).map { existingComment -> 
      val updated = existingComment.copy(
        content = updatedComment.content
      )
      commentRepository.save(updated)
    }
  }

  @Transactional
  fun deleteComment(id: Long) {
    commentRepository.deleteById(id)
  }
}