package streams;
import java.util.Arrays;
import java.util.Comparator;

public class SortingStrings {
    public static void main(String[] args) {
        String[] stringsArray = {"cat", "banana", "apple", "dog", "kiwi"};

        Arrays.sort(stringsArray, Comparator
                .<String, Integer>comparing(String::length)
                .thenComparing(Comparator.reverseOrder()));

        // Print the sorted strings
        Arrays.stream(stringsArray).forEach(System.out::println);
    }
}




