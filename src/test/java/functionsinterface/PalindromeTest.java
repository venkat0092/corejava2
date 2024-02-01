package functionsinterface;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        // Test a palindrome number
        assertTrue(Palindrome.isPalindrome(1221));

        // Test a non-palindrome number
        assertFalse(Palindrome.isPalindrome(1234));

        // Test a single-digit number (considered a palindrome)
        assertTrue(Palindrome.isPalindrome(7));

        // Test the number 0
        assertTrue(Palindrome.isPalindrome(0));

        // Test a negative number (not a palindrome)
        assertFalse(Palindrome.isPalindrome(5890));
    }
}

