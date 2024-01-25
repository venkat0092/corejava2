package traversearray;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RemoveStudentTest {

    @Test
    public void testRemoveStudent() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to be tested
        RemoveStudent.main(new String[0]);

        // Reset System.out
        System.setOut(System.out);

        // Expected output
        String expectedOutput = "John Doe, GPA: 3.5\n" +
                "Emily Brown, GPA: 3.8\n";

        // Assert that the printed output matches the expected output
        assertEquals(expectedOutput, outContent.toString());
    }
}



