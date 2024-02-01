package functionsinterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapCaseTest {

    @Test
    public void testSwapCase() {
        // Test case with the string "Hello World"
        String inputString = "Hello World";

        // Call the method to be tested
        String result = SwapCase.swapCase(inputString);

        // Expected result after swapping cases: "hELLO wORLD"
        String expectedResult = "hELLO wORLD";

        // Compare the actual result with the expected result
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSwapCaseEmptyString() {
        // Test case with an empty string
        String emptyString = "";

        // Call the method to be tested
        String result = SwapCase.swapCase(emptyString);

        // Expected result for an empty string is an empty string
        String expectedResult = "";

        // Compare the actual result with the expected result
        assertEquals(expectedResult, result);
    }
}





