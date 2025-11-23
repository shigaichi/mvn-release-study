package io.github.shigaichi;

/**
 * ライブラリ利用者の視点での最小動作例。
 *
 * <p>以下のコマンドで確認できます:
 * <pre>
 * mvn -q -DskipTests package
 * java -cp target/mvn-release-study-1.0-SNAPSHOT.jar:target/test-classes io.github.shigaichi.UsageExample
 * </pre>
 */
public final class UsageExample {

    private UsageExample() {
    }

    public static void main(String[] args) {
        GreetingService service = new GreetingService();
        System.out.println(service.greet("利用者サンプル"));
    }
}
