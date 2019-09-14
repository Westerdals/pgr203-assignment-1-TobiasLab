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

    private String toRoman(int number) {
        return "I";
    }
}


