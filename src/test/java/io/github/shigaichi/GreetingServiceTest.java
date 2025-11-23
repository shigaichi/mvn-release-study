package io.github.shigaichi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreetingServiceTest {

    private final GreetingService greetingService = new GreetingService();

    @Test
    @DisplayName("名前を指定すると「こんにちは, <name>!」を返す")
    void greetReturnsMessageWithName() {
        assertEquals("こんにちは, テストユーザー!", greetingService.greet("テストユーザー"));
    }

    @Test
    @DisplayName("空文字やnullの場合はゲスト扱いする")
    void greetFallsBackToGuest() {
        assertEquals("こんにちは, ゲスト!", greetingService.greet(""));
        assertEquals("こんにちは, ゲスト!", greetingService.greet(null));
    }
}
