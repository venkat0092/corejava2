package classstring.string;
import org.junit.Test;
import static org.junit.Assert.*;


public class VowelCounterTest {
    @Test
    public void countVowels(){
        String inputString = "find a vowel";
        int expectedVowelCount = 4;

        int actualVowelCount = VowelCounter.countVowels(inputString);

        assertEquals(expectedVowelCount, actualVowelCount);
    }
    @Test
    public void testCountVowelsEmptyString() {
        String inputString = "";
        int expectedVowelCount = 0;

        int actualVowelCount = VowelCounter.countVowels(inputString);

        assertEquals(expectedVowelCount, actualVowelCount);
    }


    }


