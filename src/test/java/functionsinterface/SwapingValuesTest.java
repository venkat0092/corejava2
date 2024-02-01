package functionsinterface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapingValuesTest {

    @Test
    public void testSwapValues() {
        int[] values = {5, 10};

        SwapingValues.swapValues(values);

        int[] expected = {10, 5};

        assertArrayEquals(expected, values);
    }

    @Test
    public void testSwapValuesWithZero() {
        int[] values = {0, 10};

        SwapingValues.swapValues(values);

        int[] expected = {10, 0};

        assertArrayEquals(expected, values);
    }
}

