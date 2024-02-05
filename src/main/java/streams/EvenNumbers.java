package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 8, 5, 12, 7, 10);

        List<Integer> doubledOddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Doubled Odd Numbers: " + doubledOddNumbers);
    }
}

