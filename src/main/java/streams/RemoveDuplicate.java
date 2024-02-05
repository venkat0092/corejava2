package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(2, 4, 6, 8, 4, 10, 6, 12, 14, 2);

        List<Integer> distinctNumbers = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original List: " + numbersWithDuplicates);
        System.out.println("List without Duplicates: " + distinctNumbers);
    }
}

