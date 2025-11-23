package io.github.shigaichi;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    @DisplayName("エントリポイントが例外なく実行できる")
    void mainRunsWithoutError() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));
        try {
            App.main(new String[] {"テスト"});
            assertTrue(buffer.toString().contains("こんにちは"));
        } finally {
            System.setOut(originalOut);
        }
    }
}
