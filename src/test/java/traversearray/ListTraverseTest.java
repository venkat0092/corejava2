package traversearray;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ListTraverseTest {

    @Test
    public void testListTraverse() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to be tested
        ListTraverse.main(new String[0]);

        // Reset System.out
        System.setOut(System.out);

        // Expected output
        String expectedOutput = "Traversing using a regular for loop:\n" +
                "food\ngood\ndid\ndone\n\n" +
                "Traversing using an enhanced for loop:\n" +
                "food\ngood\ndid\ndone\n";

        // Assert that the printed output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}

