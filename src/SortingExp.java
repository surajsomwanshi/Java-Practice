import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExp {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,3,56,8,89);

        numbers.stream().sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        List<Integer> sortList = numbers.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortList);

    }
}
