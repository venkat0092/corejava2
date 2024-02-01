package functionsinterface;
import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {

    public static void main(String[] args) {
        // Example string
        String inputString = "programming";

        // Print original string
        System.out.println("Original String: " + inputString);

        // Find and print repeated characters
        findAndPrintRepeatedCharacters(inputString);
    }

    public  static void findAndPrintRepeatedCharacters(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Update the frequency in the map
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);

            // Check if the character is repeated
            if (charFrequency.get(c) == 2) {
                System.out.println("Repeated Character: " + c);
            }
        }
    }
}

