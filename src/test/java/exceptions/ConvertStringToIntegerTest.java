package exceptions;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringToIntConverterTest {

    @Test
    void testConvertToInt_ValidInput() {
        assertEquals(23, ConverterStringToInteger.convertToInt("23"));
    }

    @Test
    void testConvertToInt_DecimalInput() {
        assertEquals(-1, ConverterStringToInteger.convertToInt("45.67"));
    }

    @Test
    void testConvertToInt_NonNumericInput() {
        assertEquals(-1, ConverterStringToInteger.convertToInt("test"));
    }

    @Test
    void testConvertToInt_MixedInput() {
        assertEquals(-1, ConverterStringToInteger.convertToInt("123f"));
    }
}