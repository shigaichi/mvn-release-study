package io.github.shigaichi;

/**
 * 簡単なエントリポイント。リリース後の動作確認に使う。
 */
public final class App {

    private App() {
    }

    public static void main(String[] args) {
        GreetingService greetingService = new GreetingService();
        String name = args.length > 0 ? args[0] : "ライブラリ利用者";
        System.out.println(greetingService.greet(name));
    }
}
