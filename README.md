![readome-image](https://github.com/asdf03/miniBoard-kotlin-vue/assets/120952058/137900a0-779e-4857-a9e3-c5594006205f)

# ミニ掲示板

このプロジェクトは、ユーザーがメッセージを投稿できるシンプルな掲示板アプリケーションです。バックエンドにはKotlinを使用し、フロントエンドにはVue.jsを採用しています。

## 特徴

- シンプルで操作しやすい掲示板インターフェイス
- メッセージの投稿、表示、削除が可能
- リアルタイムでのメッセージ更新（WebSocketを利用）

## 使用技術

- バックエンド: Kotlin, Spring Boot
- フロントエンド: Vue.js, WebSocket

## インストールと実行

以下は、このプロジェクトをローカル環境で実行する手段です。

1. リポジトリをクローンします。

git clone <リポジトリのURL>

2. バックエンドの設定

cd backend
// バックエンドの依存関係をインストール
./gradlew build
// アプリケーションを起動
java -jar build/libs/backend.jar

3. フロントエンドの設定

cd frontend
// フロントエンドの依存関係をインストール
npm install
// アプリケーションを起動
npm run serve

4. ブラウザでアプリケーションにアクセス: [http://localhost:8080](http://localhost:8080)

## 貢献方法

1. フォークしてください。
2. 新しいフィーチャーブランチを作成して下さい (`git checkout -b feature/awesome-feature`).
3. 変更をコミットしてください (`git commit -m 'Add some awesome feature'`).
4. ブランチにプッシュしてください (`git push origin feature/awesome-feature`).
5. プルリクエストを作成してください。

## ライセンス

このプロジェクトは MIT ライセンスのもとで公開されています。詳細については [LICENSE.md](LICENSE.md) をご覧ください。

### ライセンスの概要

1. 商用利用: このソフトウェアは商用利用が可能です。
2. 修正と再配布: ソフトウェアの修正版を含め、自由に再配布できます。
3. 著作権表示: ソフトウェアの全てのコピーまたは重要な部分に、オリジナルの著作権表示とMITライセンスの通知を含める必要があります。
4. 免責事項: ソフトウェアは「現状のまま」提供され、何らの保証もありません。使用によって生じた損害について、開発者は責任を負いません。