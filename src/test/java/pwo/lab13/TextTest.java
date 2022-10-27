package pwo.lab13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TextTest {
    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5", "xx12x12x1x"})
    void cont5DigTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})
    void cont5DigTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})
    void countDigitsTest(String str) {
        assertEquals(4, Text.countDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5", "xx12x12x1x"})
    void containsDigitsPositiveTest(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.containsDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aabbsd", " x ", "xxixggxlx"})
    void containsDigitsNegativeTest(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.containsDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"23434", "12345", "4"})
    void containsDigitsOnlyPositiveTest(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.containsDigitsOnly(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5", "xx12x12x1x"})
    void containsDigitsOnlyNegativeTest(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.containsDigitsOnly(str));
    }
}