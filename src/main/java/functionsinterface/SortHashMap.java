package functionsinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(4, "Four");
        hashMap.put(2, "Two");

        // Print original HashMap
        System.out.println("Original HashMap: " + hashMap);

        // Sort HashMap by keys using TreeMap
        Map<Integer, String> sortedMap = new TreeMap<>(hashMap);

        // Print sorted HashMap by keys
        System.out.println("Sorted HashMap by Keys: " + sortedMap);
    }
}
