package functionsinterface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueWordTest {

    @Test
    public void testCountUniqueWords() {
        String inputString = "Java is a programming language. Java is widely used for building applications.";

        int uniqueWordCount = UniqueWord.countUniqueWords(inputString);

        // Expected unique word count
        int expectedUniqueWordCount = 9;

        // Compare the actual count with the expected count
        assertEquals(expectedUniqueWordCount, uniqueWordCount);
    }



    @Test
    public void testCountUniqueWordsWithRepeatedWords() {
        String inputString = "Java Java Java is is is a programming programming language language.";

        int uniqueWordCount = UniqueWord.countUniqueWords(inputString);

        // Expected unique word count considering repeated words
        int expectedUniqueWordCount = 3;

        // Compare the actual count with the expected count
        assertEquals(expectedUniqueWordCount, uniqueWordCount);
    }
}

