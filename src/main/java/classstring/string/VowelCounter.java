package classstring.string;

public class VowelCounter {

    public static int countVowels(String str) {
        str = str.toLowerCase();
        int vowelCount = 0;


        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }

        }
        return  vowelCount;
    }
}








