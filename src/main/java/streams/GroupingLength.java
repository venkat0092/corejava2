package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "apple", "banana", "pear", "kiwi");

        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Grouped by Length: " + groupedByLength);
    }
}

