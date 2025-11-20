package Java8Features;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNum {
// Remove duplicates from integer of arrays and print it in descending order
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,4,5,8,1,2,4);

        List<Integer> result = arr.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);
    }

}
