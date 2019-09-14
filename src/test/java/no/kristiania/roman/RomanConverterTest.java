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

    @Test
    void shouldConvertIVto4() {
        assertEquals("IV", toRoman(4));
    }

    private String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        if (number == 4) {
            result.append("IV");
            number = 0;
        }
        for (int i = 0; i < number; i++) {
            result.append("I");
        }
        return result.toString();
    }
}


