package functionsinterface;

import java.util.HashMap;
import java.util.Map;

public class RepeatedDigits {

    public static void main(String[] args) {
        int inputNumber = 122345554;

        System.out.println("Original Number: " + inputNumber);
        System.out.println("Repeated Digits: " + findRepeatedDigits(inputNumber));
    }

    public static String findRepeatedDigits(int number) {
        String numberString = Integer.toString(number);
        Map<Character, Integer> digitFrequency = new HashMap<>();
        StringBuilder repeatedDigits = new StringBuilder();

        for (char digit : numberString.toCharArray()) {
            digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : digitFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedDigits.append(entry.getKey()).append(" ");
            }
        }

        return repeatedDigits.toString().trim();
    }
}

