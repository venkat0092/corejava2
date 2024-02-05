package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfString{
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Avocado", "Grapes");

        List<String> filteredFruits = filterStrings(fruits, s -> !s.startsWith("A"));

        System.out.println("Filtered Fruits: " + filteredFruits);
    }

    public static List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
        return strings.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
