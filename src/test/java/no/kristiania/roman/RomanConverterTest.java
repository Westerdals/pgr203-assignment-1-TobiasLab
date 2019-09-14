package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanConverterTest {
    @Test
    void shouldConvertIto1() {
        assertEquals("I", toRoman(1));
    }

    @Test
    void shouldConvertIIto2() {
        assertEquals("II", toRoman(2));
    }

    @Test
    void shouldConvertIIIto3() {
        assertEquals("III", toRoman(3));
    }

    private String toRoman(int number) {
        String result = "";
        if (number == 2) {
            result = "II";
            return result;
        } else if (number == 1) {
            result = "I";
        }
        return result;
    }
}


