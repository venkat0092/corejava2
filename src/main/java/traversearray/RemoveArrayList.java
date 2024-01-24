package traversearray;

import java.util.ArrayList;

public class RemoveArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some elements to the list
        stringList.add("food");
        stringList.add("good");
        stringList.add("did");
        stringList.add("does");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + stringList);

        // Remove the last object if the list is not empty
        if (!stringList.isEmpty()) {
            stringList.remove(stringList.size() - 1);
            System.out.println("Last element removed.");
        } else {
            System.out.println("ArrayList is empty. Nothing to remove.");
        }

        // Print the updated ArrayList
        System.out.println("ArrayList after removal: " + stringList);
    }
}

