package functionsinterface;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseArrayListTest {

    @Test
    public void testReverseArrayList() {
        // Test case with the original ArrayList ["Apple", "Banana", "Orange", "Grapes", "Mango"]
        ArrayList<String> originalArrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Mango"));
        ArrayList<String> expectedReversedArrayList = new ArrayList<>(Arrays.asList("Mango", "Grapes", "Orange", "Banana", "Apple"));

        // Reverse the ArrayList
        Collections.reverse(originalArrayList);

        // Compare the actual result with the expected result
        assertEquals(expectedReversedArrayList, originalArrayList);
    }
}




