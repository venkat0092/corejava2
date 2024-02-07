package streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streams.EvenNumbers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class EvenNumbersTest {
    @Test
    public void evenOutTest1(){
        List<Integer> input=new ArrayList<Integer>(Arrays.asList(1,4,2,5,6,7,13,45,67));
        List<Integer> actual_output=EvenNumbers.calculateEvenNumbers(input);
        List<Integer> expected_output=new ArrayList<Integer>(Arrays.asList(2,10,14,26,90,134));

        Assertions.assertArrayEquals(expected_output.toArray(), actual_output.toArray());
    }
}
