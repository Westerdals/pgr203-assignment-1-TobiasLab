package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanConverterTest {
    @Test
    void shouldConvertIto1() {
        assertEquals("I", RomanConverter.toRoman(1));
    }

    @Test
    void shouldConvertIIto2() {
        assertEquals("II", RomanConverter.toRoman(2));
    }

    @Test
    void shouldConvertIIIto3() {
        assertEquals("III", RomanConverter.toRoman(3));
    }

    @Test
    void shouldConvertIVto4() {
        assertEquals("IV", RomanConverter.toRoman(4));
    }

    @Test
    void shouldConvertVto5() {
        assertEquals("V", RomanConverter.toRoman(5));
    }

    @Test
    void shouldCalculate6Through8() {
        assertEquals("VI", RomanConverter.toRoman(6));
        assertEquals("VII", RomanConverter.toRoman(7));
        assertEquals("VIII", RomanConverter.toRoman(8));
    }

    @Test
    void shouldReturnIXfor9() {
        assertEquals("IX", RomanConverter.toRoman(9));
    }

    @Test
    void shouldReturnXfor10() {
        assertEquals("X", RomanConverter.toRoman(10));
        assertEquals("XVIII", RomanConverter.toRoman(18));
    }

    @Test
    void shouldCalculateMultiplesOfTen() {
        assertEquals("XXXVII", RomanConverter.toRoman(37));
    }

}


