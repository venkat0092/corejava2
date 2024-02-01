package functionsinterface;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedDigitsTest {

    @Test
    public void testFindRepeatedDigits() {
        // Test case with the example number 122345554
        int inputNumber = 122345554;
        String expectedRepeatedDigits = "2 4 5";

        // Call the method to be tested
        String actualRepeatedDigits = RepeatedDigits.findRepeatedDigits(inputNumber);

        // Compare the actual result with the expected result
        assertEquals(expectedRepeatedDigits, actualRepeatedDigits);
    }

    @Test
    public void testFindRepeatedDigitsWithNoRepeats() {
        // Test case with a number with no repeated digits (12345)
        int inputNumber = 12345;
        String expectedRepeatedDigits = "";

        // Call the method to be tested
        String actualRepeatedDigits = RepeatedDigits.findRepeatedDigits(inputNumber);

        // Compare the actual result with the expected result
        assertEquals(expectedRepeatedDigits, actualRepeatedDigits);
    }
}


