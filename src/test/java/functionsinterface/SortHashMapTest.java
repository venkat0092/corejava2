package functionsinterface;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortHashMapTest {

    @Test
    public void testSortHashMapByKeys() {
        // Test case with the original HashMap {3=Three, 1=One, 4=Four, 2=Two}
        HashMap<Integer, String> originalHashMap = new HashMap<>();
        originalHashMap.put(3, "Three");
        originalHashMap.put(1, "One");
        originalHashMap.put(4, "Four");
        originalHashMap.put(2, "Two");

        // Call the sorting method
        Map<Integer, String> sortedMap = new TreeMap<>(originalHashMap);

        // Expected result after sorting by keys
        Map<Integer, String> expectedSortedMap = new TreeMap<>(originalHashMap);

        // Compare the actual result with the expected result
        assertEquals(expectedSortedMap, sortedMap);
    }
}
