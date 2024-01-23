package classstring.string;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramCheckerTest {

    @Test
    public void testAreAnagrams() {
        assertTrue(AnagramChecker.checkAnagrams("Listen", "Silent"));
        assertFalse(AnagramChecker.checkAnagrams("Hello", "World"));
        assertFalse(AnagramChecker.checkAnagrams("Java", "Python"));
        assertTrue(AnagramChecker.checkAnagrams("Astronomer", "Moon starer"));
    }
}









