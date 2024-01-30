

package hashmap;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterCountTest {

    static String getCharacterCount(String input) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character (excluding whitespace)
        for (char ch : input.replaceAll("\\s", "").toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            result.append(entry.getKey()).append("-").append(entry.getValue()).append(", ");
        }

        // Remove the trailing comma and space
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        return result.toString();
    }

    @Test
    public void testCharacterCount() {
        String input = "test string";
        String expectedOutput = "t-3, e-1, s-2, r-1, i-1, n-1, g-1";

        String actualOutput = getCharacterCount(input);

        assertEquals(expectedOutput, actualOutput);

        // Print test details and result
        System.out.println("Test Case: Character Count");
        System.out.println("Input String: " + input);
        System.out.println("Expected Output: " + expectedOutput);
        System.out.println("Actual Output: " + actualOutput);
        System.out.println("Test Passed: " + (expectedOutput.equals(actualOutput)));
    }
}

