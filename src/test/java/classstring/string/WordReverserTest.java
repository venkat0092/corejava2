package classstring.string;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class WordReverserTest {
    @Test
    public void testReverseWords() {
        String inputSentence = "Java J2EE Reverse Me";
        String expectedReversedSentence = "avaJ EE2J esreveR eM";

        String reversedSentence = WordReverser.reverseWords(inputSentence);

        assertEquals(expectedReversedSentence, reversedSentence);
    }
    @Test
    public void testReverseWord(){
        String inputSentence = "Reverse";
        String expectedReversedSentence = "esreveR";
        String reversedSentence = WordReverser.reverseWords(inputSentence);
        assertEquals(expectedReversedSentence,reversedSentence);

    }

}
