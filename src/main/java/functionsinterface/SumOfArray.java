package functionsinterface;
public class SumOfArray{

    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.print("Array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        // Calculate and print the sum of array elements
        int sum = calculateSum(array);
        System.out.println("\nSum of Array Elements: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;

        // Iterate through the array and calculate the sum
        for (int element : array) {
            sum += element;
        }

        return sum;
    }
}

