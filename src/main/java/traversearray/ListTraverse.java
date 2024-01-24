package traversearray;

    import java.util.ArrayList;

    public class ListTraverse {
        public static void main(String[] args) {
            // Creating an ArrayList of Strings
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("food");
            stringList.add("good");
            stringList.add("did");
            stringList.add("done");

            // Using a regular for loop
            System.out.println("Traversing using a regular for loop:");
            for (int i = 0; i < stringList.size(); i++) {
                String element = stringList.get(i);
                System.out.println(element);
            }

            // Using an enhanced for loop
            System.out.println("\nTraversing using an enhanced for loop:");
            for (String element : stringList) {
                System.out.println(element);
            }
        }
    }



