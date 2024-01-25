package traversearray;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

    public class ConvertArrayTest {

        @Test
        public void testConvertArray() {
            // Redirect System.out to capture printed output
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            // Call the method to be tested
            ConvertArray.main(new String[0]);

            // Reset System.out
            System.setOut(System.out);

            // Expected output
            String[] expectedArray = {"good", "food", "Did"};

            // Assert that the printed output matches the expected output
            assertArrayEquals(expectedArray, outContent.toString().trim().split("\\s+"));
        }
    }



