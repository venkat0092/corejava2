package functionsinterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringRotationTest {

    @Test
    public void testAreRotations() {
        // Test case with the strings "hello" and "lohel"
        String str1 = "hello";
        String str2 = "lohel";

        // Call the method to be tested
        boolean result = StringRotation.areRotations(str1, str2);

        // Expected result is true since "lohel" is a rotation of "hello"
        assertTrue(result);
    }



    @Test
    public void testDifferentLengths() {
        // Test case with strings of different lengths
        String str1 = "hello";
        String str2 = "lohello";

        // Call the method to be tested
        boolean result = StringRotation.areRotations(str1, str2);

        // Expected result is false since strings have different lengths
        assertFalse(result);
    }
}
