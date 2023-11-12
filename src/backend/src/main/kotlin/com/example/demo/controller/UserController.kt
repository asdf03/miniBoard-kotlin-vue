package com.demo.controller

import com.demo.model.User
import com.demo.service.UserService
import com.demo.controller.dto.LoginRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

  @PostMapping
  fun createUser(@RequestBody user: User): ResponseEntity<User> {
    val createdUser = userService.createUser(user)
    return ResponseEntity.ok(createdUser)
  }

  @GetMapping
  fun getAllUsers(): ResponseEntity<List<User>> {
    val users = userService.findAllUsers()
    return ResponseEntity.ok(users)
  }

  @GetMapping("/{id}")
  fun getUserById(@PathVariable id: Long): ResponseEntity<User> {
    val user = userService.findUserById(id)
    return ResponseEntity.ok(user)
  }

  @PutMapping("/{id}")
  fun updateUser(@PathVariable id: Long, @RequestBody updatedUser: User): ResponseEntity<User>{
    val updateUser = userService.findUserById(id, updatedUser)
    return ResponseEntity.ok(user)
  }

  @DeleteMapping("/{id}")
  fun deleteUser(@PathVariable id: Long): ResponseEntity<Void> {
    userService.deleteUser(id)
    return ResponseEntity.ok().build()
  }

  @PostMapping("/login")
  fun login(@RequestBody loginRequest: LoginRequest): ResponseEntity<User> {
    val user = userService.authenticate(loginRequest.email, loginRequest.password)
    return if (user != null) {
      ResponseEntity.ok(user)
    } else {
      ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
    }
  }
}