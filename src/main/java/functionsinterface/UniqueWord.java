package functionsinterface;

import java.util.HashMap;
import java.util.Map;

public class UniqueWord {
    public static void main(String[] args) {
        String inputString = "Java is a programming language. Java is widely used for building applications.";

        System.out.println("Original String:\n" + inputString);
        System.out.println("Number of Unique Words: " + countUniqueWords(inputString));
    }

    public static int countUniqueWords(String input) {
        String[] words = input.split("\\s+");
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        return (int) wordFrequencyMap.entrySet().stream().filter(entry -> entry.getValue() == 1).count();
    }
}

