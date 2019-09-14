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

    @Test
    void shouldConvertVto5() {
        assertEquals("V", toRoman(5));
    }

    @Test
    void shouldCalculate6Through8() {
        assertEquals("VI", toRoman(6));
        assertEquals("VII", toRoman(7));
        assertEquals("VIII", toRoman(8));
    }

    @Test
    void shouldReturnIXfor9() {
        assertEquals("IX", toRoman(9));
    }

    @Test
    void shouldReturnXfor10() {
        assertEquals("X", toRoman(10));
        assertEquals("XVIII", toRoman(18));
    }

    @Test
    void shouldCalculateMultiplesOfTen() {
        assertEquals("XXXVII", toRoman(37));
    }

    private String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        number = toRomanDigit(number, result, 10, "X");
        if (number >= 9) {
            result.append("IX");
            number = 0;
        }
        number = toRomanDigit(number, result, 10, "X");
        if (number == 4) {
            result.append("IV");
            number = 0;
        }
        for (int i = 0; i < number; i++) {
            result.append("I");
        }
        return result.toString();
    }

    private int toRomanDigit(int number, StringBuilder result, int digitValue, String digitSymbol) {
        if (number >= digitValue) {
            result.append(digitSymbol);
            number -= digitValue;
        }
        return number;
    }
}


