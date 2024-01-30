package sets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateTest {

    @Test
    public void testRemoveDuplicates() {
        // Given a string
        String inputString = "programming";

        // Remove duplicate characters
        String resultString = removeDuplicates(inputString);

        // Expected result after removing duplicates
        String expectedResult = "progamin";

        // Assert that the result matches the expected result
        assertEquals(expectedResult, resultString);

        // Print the resulting string
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + resultString);
    }

    // Method to remove duplicate characters from a string
    private String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}

