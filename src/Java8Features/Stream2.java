package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 4, 5, 7, 8, 456, 78);
        List<Integer> newList = list.stream().filter(n -> n % 2 == 0)
                .map(n -> n / 2)
                .distinct()
                .sorted((a, b) -> (b - a))
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
