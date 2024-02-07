package streams;

import org.junit.jupiter.api.Test;
import streams.MaximumElement;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class MaximumElementTest {
   @Test
   public void maxStringElement1() {
       LinkedList<String> pl = new LinkedList<>(Arrays.asList("green", "purple", "yellow", "purple", "lavender", "rose pink", "sea blue"));
       String actual_output = MaximumElement.maxStringElement(pl);
       String expected_output = "yellow";
       assertEquals(actual_output, expected_output);
   }


   }
