package streams;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MaximumElement {
//    public static void main(String[] args) {
//      List<String> colors = Arrays.asList("red", "blue", "green", "yellow", "purple");

  public static String maxStringElement(LinkedList<String> colors){
        String maxColor = colors.stream()
                .max(String::compareTo)
                .orElse(null);

        System.out.println("Maximum Color: " + maxColor);
        return maxColor;
    }
}
