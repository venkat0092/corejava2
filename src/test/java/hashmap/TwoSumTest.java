package hashmap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        int[] input1 = {10, 20, 30, 40, 50, 60};
        int target1 = 100;
        int[] expected1 = {3, 5};
        printResult(input1, target1, expected1);

        // Add more test cases as needed
        int[] input2 = {1, 2, 3, 4, 5};
        int target2 = 9;
        int[] expected2 = {3, 4};
        printResult(input2, target2, expected2);

        int[] input3 = {2, 7, 11, 15};
        int target3 = 9;
        int[] expected3 = {0, 1};
        printResult(input3, target3, expected3);
    }

    // Function to find indices of two numbers that add up to the target sum using HashMap
    private int[] findTwoSumIndices(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[]{};
    }

    // Function to print the result
    private void printResult(int[] input, int target, int[] expected) {
        int[] result = findTwoSumIndices(input, target);
        System.out.println("Input Array: " + Arrays.toString(input));
        System.out.println("Target Sum: " + target);
        System.out.println("Expected Result: " + Arrays.toString(expected));
        System.out.println("Actual Result: " + Arrays.toString(result));
        assertArrayEquals(expected, result);
        System.out.println("Test passed!\n");
    }
}

