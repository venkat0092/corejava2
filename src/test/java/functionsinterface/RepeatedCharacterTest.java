package functionsinterface;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedCharacterTest {

    @Test
    public void testFindAndPrintRepeatedCharacters() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test case with the example string "programming"
        String inputString = "programming";
        String expectedOutput = "Repeated Character: r\n" +
                "Repeated Character: m\n" +
                "Repeated Character: g\n";

        // Call the method to be tested
        RepeatedCharacter.findAndPrintRepeatedCharacters(inputString);

        // Restore original System.out
        System.setOut(System.out);

        // Compare the actual printed output with the expected output
        assertEquals(expectedOutput, outputStream.toString());
    }
}


