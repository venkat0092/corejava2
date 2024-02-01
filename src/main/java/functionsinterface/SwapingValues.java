package functionsinterface;

public class SwapingValues {
    public static void main(String[] args) {
        int[] values = {5, 10};

        System.out.println("Before swapping:");
        System.out.println("a = " + values[0]);
        System.out.println("b = " + values[1]);

        // Swap the values without using a third variable
        swapValues(values);

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + values[0]);
        System.out.println("b = " + values[1]);
    }

    public static void swapValues(int[] values) {
        int a = values[0];
        int b = values[1];

        a = a + b;
        b = a - b;
        a = a - b;

        values[0] = a;
        values[1] = b;
    }
}
