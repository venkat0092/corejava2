package streams;

import java.util.Arrays;
import java.util.List;
public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("violet", "blue", "yellow", "red", "white");

        strings.stream()
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .forEach(System.out::println);
    }
}

