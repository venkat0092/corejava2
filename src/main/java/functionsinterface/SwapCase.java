package functionsinterface;
public class SwapCase {

    public static void main(String[] args) {
        // Example string
        String inputString = "Hello World";

        // Print the original string
        System.out.println("Original String: " + inputString);

        // Replace lower-case with upper-case and vice versa
        String swappedString = swapCase(inputString);

        // Print the string after swapping cases
        System.out.println("String after Swapping Cases: " + swappedString);
    }

    public static String swapCase(String input) {
        char[] charArray = input.toCharArray();

        // Iterate through each character and swap case
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if (Character.isUpperCase(currentChar)) {
                charArray[i] = Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                charArray[i] = Character.toUpperCase(currentChar);
            }
        }

        return new String(charArray);
    }
}

