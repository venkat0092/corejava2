package streams;

import org.junit.jupiter.api.Test;
import streams.GroupingLength;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class GroupingLengthTest {
    @Test
    public void groupBy1()
    {
        ArrayList<String> inputList=new ArrayList<>(Arrays.asList("monkey","tiger","cheetah"));
        Map<Integer, List<String>> actualoutput=GroupingLength.groupByLength(inputList);
        Map<Integer, List<String>> expectedoutput=new HashMap<>();
        expectedoutput.put(5,Arrays.asList("tiger"));
                expectedoutput.put(6,Arrays.asList("monkey"));
        expectedoutput.put(7,Arrays.asList("cheetah"));
        assertEquals(1,actualoutput.get(5).size());
        assertEquals(1,actualoutput.get(6).size());
        assertEquals(1,actualoutput.get(7).size());



    }
}
