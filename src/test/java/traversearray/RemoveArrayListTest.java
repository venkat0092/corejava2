package traversearray;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
public class RemoveArrayListTest{
    @Test
    public void testRemoveArrayList(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        RemoveArrayList.main(new String[0]);
        System.setOut(System.out);
        String expectedOutput = "Original ArrayList: [food, good, did, does]\n" +
                "Last element removed.\n" +
                "ArrayList after removal: [food, good, did]\n";
        assertEquals(expectedOutput,outContent.toString());


    }

}


