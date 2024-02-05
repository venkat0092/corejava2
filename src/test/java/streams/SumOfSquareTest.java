package streams;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import streams.SumOfSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfSquareTest {

    @Test
    public void testSumOfSquare() {
        ArrayList<Integer> input=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int expected_sum=55;
        int actual_sum=SumOfSquare.returnSumOfSquares(input);

        assertEquals(expected_sum,actual_sum);
        //assertEquals("Sum of Squares: " + expectedSumOfSquares, outputStream.toString().trim());
    }
}

