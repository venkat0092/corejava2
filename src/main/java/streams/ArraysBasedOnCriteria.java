//package streams;
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class SortingStrings {
//    public static void main(String[] args) {
//        String[] stringsArray = {"cat", "banana","aikiaa", "apple", "dog", "kiwi"};
//
//        Arrays.sort(stringsArray, Comparator
//                .<String, Integer>comparing(String::length)
//                .thenComparing(Comparator.reverseOrder()));
//
//        // Print the sorted strings
//        Arrays.stream(stringsArray).forEach(System.out::println);
//    }
//}
package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

public class ArraysBasedOnCriteria {
    public static String[] sortBasedOnLength(String[] array){
        String[] sortedArray = Arrays.stream(array)
                .sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new);
        return sortedArray;
        /*for(int i=0; i< sortedArray.length; i++)
            System.out.println(sortedArray[i]);*/
    }
    /*public static void main(String[] args){
        String[] array = {"banana","apple","grapes","cherry","Kiwi","Straw Berry"};
        ArraysBasedOnCriteria.sortBasedOnLength(array);
    }*/
}




