package functionsinterface;

import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        // Print original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Reverse the ArrayList
        Collections.reverse(arrayList);

        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList: " + arrayList);
    }


}

