package loopsandconditions.reversedigits;

public class FibonacciSeries {
    static void printFibonacciSeries(int N) {
        int firstOne = 0, secondOne = 1;

        System.out.print("Fibonacci Series up to " + N + " terms: ");

        for (int i = 0; i < N; i++) {
            System.out.print(firstOne + " ");

            int lastOne = firstOne + secondOne;
            firstOne = secondOne;
            secondOne = lastOne;
        }
    }


    public static void main(String[] args) {
        printFibonacciSeries(10);
    }
}
