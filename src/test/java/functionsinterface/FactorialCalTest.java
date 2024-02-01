package functionsinterface;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class FactorialCalTest {

        @Test
        public void testCalculateFactorialWithPositiveNumber() {
            // Test case with a positive number
            int number = 5;
            long expectedFactorial = 120;

            long actualFactorial = FactorialCal.calculateFactorial(number);

            assertEquals(expectedFactorial, actualFactorial);
        }
        @Test
        public void testCalculateFactorialWithNegativeNumber() {
            // Test case with a negative number
            int number = -5;
            long expectedFactorial = -1; // Indicating an error condition

            long actualFactorial = FactorialCal.calculateFactorial(number);

            assertEquals(expectedFactorial, actualFactorial);
        }
    }









