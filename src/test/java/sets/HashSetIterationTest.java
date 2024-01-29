package sets;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HashSetIterationTest {

    @Test
    public void testHashSetIteration() {
        // Create a HashSet and add 10 strings to it.
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Grape");
        stringSet.add("Kiwi");
        stringSet.add("Mango");
        stringSet.add("Orange");
        stringSet.add("Peach");
        stringSet.add("Pear");

        // Iterate HashSet using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            assertTrue(stringSet.contains(element), "Element " + element + " not found in HashSet");
        }

        // Iterate HashSet using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : stringSet) {
            assertTrue(stringSet.contains(fruit), "Element " + fruit + " not found in HashSet");
        }
    }
}







