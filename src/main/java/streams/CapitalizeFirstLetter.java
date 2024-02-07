package streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
public class CapitalizeFirstLetter {
    public String[] capitalizeFirstLetterAlphabetically(String[] strings) {
        return Arrays.stream(strings)
                .map(s -> s != null ? Character.toUpperCase(s.charAt(0)) + s.substring(1) : null)
                .sorted()
                .toArray(String[]::new);
    }
}

