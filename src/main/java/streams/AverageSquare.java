package streams;

import java.util.Arrays;

public class  AverageSquare {
    public double calculateAverageSquares(int[] numbers){

        // Filter odd numbers, square each, calculate average
        return  Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)  // Keep only odd numbers
                .mapToDouble(n -> n * n)  // Square each odd number
                .average()  // Calculate the average
                .orElse(0.0);  // Default value if no odd numbers are present


    }

}



