# 機能設計文書

## 1. 概要

この文書では、掲示板Webアプリケーションの主要な機能とその動作について説明します。このアプリケーションはKotlinとVue.jsを使用して構築されており、リアルタイムでのメッセージ更新をサポートしています。

## 2. 主要な機能

### 2.1 ユーザー管理

#### ユーザー登録
ユーザーはアプリケーションに登録してアカウントを作成できます。登録にはユーザー名、メールアドレス、パスワードが必要です。

#### ログイン
登録済みのユーザーはメールアドレスとパスワードを使用してログインできます。ログイン成功時には認証トークンが発行されます。

#### プロフィール編集
ログイン済みのユーザーは自身のプロフィールを編集できます。

### 2.2 メッセージ管理

#### メッセージ投稿
ログイン済みのユーザーは新しいメッセージを投稿できます。

#### メッセージ一覧表示
全てのユーザー（ログインしていないユーザーも含む）は投稿されたメッセージの一覧を表示できます。

#### メッセージ削除
ログイン済みのユーザーは自分が投稿したメッセージを削除できます。

### 2.3 リアルタイム通信

#### メッセージのリアルタイム更新
WebSocketを使用して、メッセージがリアルタイムで更新されるようにします。

## 3. 画面遷移

画面遷移については、別の文書[screen-transition-diagram.md](screen-transition-diagram.md)を参照してください。
