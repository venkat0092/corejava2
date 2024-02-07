package streams;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import streams.StringVowel;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class StringVowelTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    public void testCountAndPrintVowels() {
        String[] stringArray = {"apple", "banana", "orange", "kiwi", "grape"};
        // Redirect System.out for testing
        System.setOut(new java.io.PrintStream(outContent));

        StringVowel.countPrintVowels(stringArray);

        // Reset System.out
        System.setOut(originalOut);

        String expectedOutput = "String: apple, Vowel Count: 2" +System.lineSeparator()+
                "String: banana, Vowel Count: 3" +System.lineSeparator()+
                "String: orange, Vowel Count: 3" +System.lineSeparator()+
                "String: kiwi, Vowel Count: 2" +System.lineSeparator()+
                "String: grape, Vowel Count: 2";

        String actualOutput = outContent.toString();
        System.out.println(actualOutput);
        System.out.println(expectedOutput);

        assertEquals(expectedOutput.trim(), actualOutput.trim());
    }
}
