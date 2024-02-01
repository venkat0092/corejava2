package functionsinterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfArrayTest {

    @Test
    public void testCalculateSum() {
        // Test case with the array {1, 2, 3, 4, 5}
        int[] array = {1, 2, 3, 4, 5};

        // Call the method to be tested
        int result = SumOfArray.calculateSum(array);

        // Expected result is the sum of elements: 1 + 2 + 3 + 4 + 5 = 15
        int expectedResult = 15;

        // Compare the actual result with the expected result
        assertEquals(expectedResult, result);
    }


    @Test
    public void testCalculateSumSingleElementArray() {
        // Test case with a single-element array {7}
        int[] singleElementArray = {7};

        // Call the method to be tested
        int result = SumOfArray.calculateSum(singleElementArray);

        // Expected result for a single-element array is the element itself, i.e., 7
        int expectedResult = 7;

        // Compare the actual result with the expected result
        assertEquals(expectedResult, result);
    }
}

