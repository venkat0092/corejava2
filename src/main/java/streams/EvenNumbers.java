package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers{

    public static List<Integer> calculateEvenNumbers(List<Integer> intrs) {
//    return Arrays.stream(numbers)
//                .filter(n -> n % 2 != 0)
//                .map(n -> n * 2)
//                .collect(Collectors.toList());
        List<Integer> p=intrs.stream().filter(n ->n%2!=0).map( n -> n*2).collect(Collectors.toList());

        System.out.println("The output is : ");
        for(Integer i:p)
        {
            System.out.println(i);
        }
        return p;


       // System.out.println("Doubled Odd Numbers: " + doubledOddNumbers);
    }
}

