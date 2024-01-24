package traversearray;

import java.util.ArrayList;

public class ConvertArray {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("good");
        stringList.add("food");
        stringList.add("Did");

        // Convert ArrayList to Array
        String[] stringArray = stringList.toArray(new String[0]);

        // Print the Array elements
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}

