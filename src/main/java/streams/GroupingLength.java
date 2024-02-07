package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingLength {

      public static Map<Integer, List<String>> groupByLength(List<String> animals){

        Map<Integer, List<String>> groupedByLength = animals.stream()
                .collect(Collectors.groupingBy(String::length));
          System.out.println("Actual Output is");

        System.out.println("Grouped by Length: " + groupedByLength);
        for(Map.Entry<Integer,List<String>> entry:groupedByLength.entrySet())
        {
            System.out.println("Key: "+entry.getKey());
            System.out.println("Value :"+entry.getValue());
        }
        return groupedByLength;
    }
}

