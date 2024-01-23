package classstring.string;

public class AnagramChecker {
//        public static void main(String[] args) {
//            String str1 = "dear";
////            String str2 = "read";
//
//            boolean areAnagrams = checkAnagrams(str1, str2);
//
//            if (areAnagrams) {
//                System.out.println("The two strings are anagrams.");
//            } else {
//                System.out.println("The two strings are not anagrams.");
//            }
//        }

        public static boolean checkAnagrams(String str1, String str2) {
            // Remove spaces and convert to lowercase for case-insensitive comparison
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            // Check if the lengths are different, if yes, they cannot be anagrams
            if (str1.length() != str2.length()) {
                return false;
            }

            // Count occurrences of each character in str1 and str2
            int[] charCount = new int[26]; // Assuming only lowercase alphabets

            // Count occurrences in str1
            for (char ch : str1.toCharArray()) {
                charCount[ch - 'a']++;
            }

            // Subtract occurrences in str2
            for (char ch : str2.toCharArray()) {
                charCount[ch - 'a']--;
            }

            // Check if all counts are zero
            for (int count : charCount) {
                if (count != 0) {
                    return false;
                }
            }

            return true;
        }
    }


