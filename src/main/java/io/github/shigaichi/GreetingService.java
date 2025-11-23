package io.github.shigaichi;

/**
 * シンプルなあいさつを提供するサービス。
 */
public class GreetingService {

    /**
     * 名前付きのあいさつ文を返します。
     *
     * @param name 呼びかける相手の名前
     * @return 「こんにちは, <name>!」形式の文言
     */
    public String greet(String name) {
        String target = name == null || name.isBlank() ? "ゲスト" : name.trim();
        return "こんにちは, " + target + "!";
    }
}
