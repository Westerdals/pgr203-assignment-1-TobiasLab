package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanConverterTest {
    @Test
    void shouldReturnIfor4() {
        assertEquals("IV", toRoman(4));
    }

    @Test
    void shouldReturnVfor5() {
        assertEquals("V", toRoman(5));
    }

    @Test
    void shouldCalculate6to8() {
        assertEquals("VI", toRoman(6));
        assertEquals("VII", toRoman(7));
        assertEquals("VIII", toRoman(8));
    }

    @Test
    void shouldCalculateIXto9() {
        assertEquals("IX", toRoman(9));
    }

    @Test
    void shouldCalculateMultipleOfTen() {
        assertEquals("XXXVII", toRoman(37));
    }

    @Test
    void shouldCalculateOver10() {
        assertEquals("X", toRoman(10));
        assertEquals("XVIII", toRoman(18));
    }

    @Test
    void shouldCalculateMultipliesOfTen() {
        assertEquals("XXXVII", toRoman(37));
    }

    @Test
    void shouldCalculateSimpleDigits() {
        assertEquals("MMMDCCCLXXXVIII", toRoman(3888));
    }

    private static String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        number = toRomanDigit(number, result, 1000, "M");
        number = toRomanDigit(number, result, 500, "D");
        number = toRomanDigit(number, result, 100, "C");
        number = toRomanDigit(number, result, 50, "L");
        number = toRomanDigit(number, result, 10, "X");
        number = toRomanDigit(number, result, 9, "IX");
        number = toRomanDigit(number, result, 5, "V");
        number = toRomanDigit(number, result, 4, "IV");
        number = toRomanDigit(number, result, 1, "I");
        return result.toString();
    }

    private static int toRomanDigit(int number, StringBuilder result, int digitalValue, String digitalSymbol) {
        while (number >= digitalValue) {
            result.append(digitalSymbol);
            number -= digitalValue;
        }
        return number;
    }
}
