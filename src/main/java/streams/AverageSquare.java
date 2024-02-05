package streams;

import java.util.Arrays;

public class  AverageSquare {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Filter odd numbers, square each, calculate average
        double average = Arrays.stream(numbersArray)
                .filter(n -> n % 2 != 0)  // Keep only odd numbers
                .mapToDouble(n -> n * n)  // Square each odd number
                .average()  // Calculate the average
                .orElse(0.0);  // Default value if no odd numbers are present

        System.out.println("Average of squares of odd numbers: " + average);
    }

}



