package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfSquare {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

//        int sumOfSquares = numbers.stream()
//                .mapToInt(n -> n * n)
//                .sum();
        int sumOfSquares=returnSumOfSquares(numbers);

        System.out.println("Sum of Squares: " + sumOfSquares);
    }

    public static int returnSumOfSquares(ArrayList<Integer> input) {
        int sum=input.stream()
                .mapToInt(s -> s*s)
                .sum();
        return sum;
    }
}

