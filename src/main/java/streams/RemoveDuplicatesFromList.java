package  streams;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static List<Integer> removeDuplicatesFromList(List<Integer> li){
        return li.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    /*public static void main(String[] args){
        List<Integer> li = List.of(1,2,3,2,1,3,4,5,4,3,2);
        List<Integer> li1 = RemoveDuplicatesFromList.removeDuplicatesFromList(li);
        li1.forEach(s -> System.out.println(s));
    }*/
}



