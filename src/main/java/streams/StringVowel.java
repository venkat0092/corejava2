package streams;

public class StringVowel {
    public static void main(String[] args) {
        String[] stringsArray = {"cat", "dog", "bird", "fish"};

        for (String str : stringsArray) {
            if (containsVowels(str)) {
                System.out.println("String: " + str);
                System.out.println("Number of Vowels: " + countVowels(str));
                System.out.println();
            }
        }
    }

    private static boolean containsVowels(String s) {
        return s.matches(".*[aeiou].*");
    }

    private static int countVowels(String s) {
        return (int)
                s.chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
}

