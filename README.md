# mvn-release-study

Maven Central への公開を練習するための Java ライブラリです。`GreetingService` がシンプルなあいさつ文を返し、`App` は CLI の最小エントリポイントになっています。

## 前提
- Java 21
- Apache Maven (3.9 以降を想定)

## よく使うコマンド
```bash
# コンパイル
mvn clean compile

# テスト実行（JUnit Jupiter）
mvn test

# パッケージ生成（署名・ソース/Javadoc 同梱）
mvn package
```

## 実行例
jar のバージョンは `pom.xml` の `<version>` に合わせて読み替えてください（現在は `0.0.4-SNAPSHOT`）。
```bash
# エントリポイント（引数がない場合は「ライブラリ利用者」に挨拶）
java -cp target/mvn-release-study-0.0.4-SNAPSHOT.jar io.github.shigaichi.App サンプル

# テスト用 UsageExample（ターゲット出力とテストクラスをクラスパスに追加）
java -cp target/mvn-release-study-0.0.4-SNAPSHOT.jar:target/test-classes io.github.shigaichi.UsageExample
```

## プロジェクト構成
- `src/main/java/io/github/shigaichi` … 本体コード（`App`, `GreetingService`）
- `src/test/java/io/github/shigaichi` … JUnit テストと動作例
- `pom.xml` … 依存関係や配布設定（GPG 署名、central-publishing プラグインなど）
- `target/` … ビルド成果物（コミットしない）

## リリース/設定メモ
- Sonatype Central の公開に必要なクレデンシャルや GPG キーは各自の環境設定（例: `~/.m2/settings.xml`）で管理し、リポジトリには含めません。
- 署名・ソース・Javadoc jar は `mvn package` で自動生成されます。公開前に一度 `mvn clean package` で再確認してください。
