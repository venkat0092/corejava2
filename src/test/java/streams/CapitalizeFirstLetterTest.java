package streams;




import org.junit.Assert;
import org.junit.Test;
import streams.CapitalizeFirstLetter;

    public class CapitalizeFirstLetterTest{

        CapitalizeFirstLetter letter = new CapitalizeFirstLetter();

        @Test
        public void testCapitalize() {
            String[] str = {"python", "java"};
            String[] compstr = {"Java", "Python"};
            String[] res = letter.capitalizeFirstLetterAlphabetically(str);
            Assert.assertArrayEquals(compstr, res);
        }

        @Test
        public void testCapitalize1() {
            String[] str = {"python", "java"};
            String[] compstr = {"Java", "python"};
            String[] res = letter.capitalizeFirstLetterAlphabetically(str);
            Assert.assertNotSame(compstr, res);
        }

        @Test
        public void testCapitalize2() {
            String[] str = {null};
            String[] compstr = {null};
            String[] res = letter.capitalizeFirstLetterAlphabetically(str);
            Assert.assertArrayEquals(compstr, res);
        }
    }

