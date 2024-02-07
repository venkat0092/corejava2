package streams;

import java.util.Arrays;

class StringVowel {
public static void countPrintVowels(String[] names) {
    Arrays.stream(names).filter(str -> {
                long vowelCount = str.toLowerCase().chars()
                        .filter(c -> "aeiou".indexOf(c) != -1)
                        .count();
                return vowelCount > 0;
            })
            .forEach(str -> System.out.println("String: " + str + ", Vowel Count: " +
                    str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count()));
}

}
