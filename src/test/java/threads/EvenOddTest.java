package threads;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void testEvenPrinter() {
        EvenOdd.EvenPrinter evenPrinter = new EvenOdd.EvenPrinter();
        // Run the even printer thread
        Thread evenThread = new Thread(evenPrinter);
        evenThread.start();
        // Add assertions or other mechanisms to verify the output
    }

    @Test
    void testOddPrinter() {
        EvenOdd.OddPrinter oddPrinter = new EvenOdd.OddPrinter();
        // Run the odd printer thread
        Thread oddThread = new Thread(oddPrinter);
        oddThread.start();
        // Add assertions or other mechanisms to verify the output
    }
}
