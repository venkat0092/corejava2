package functionsinterface;

public class FactorialCal {
    public static void main(String[] args) {
        int number = 5;  // Replace with the desired number

        long factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;  // indicating an error condition
        } else if (num == 0 || num == 1) {
            return 1;  // factorial of 0 and 1 is 1
        } else {
            long result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }
}

