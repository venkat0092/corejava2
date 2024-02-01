package functionsinterface;


    public class Palindrome {
        public static void main(String[] args) {
            int number = 1221;  // Replace with the desired number to check

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }

        static boolean isPalindrome(int num) {
            int originalNumber = num;
            int reversedNumber = 0;

            while (num != 0) {
                reversedNumber = reversedNumber * 10 + num % 10;
                num /= 10;
            }

            return originalNumber == reversedNumber;
        }
    }


