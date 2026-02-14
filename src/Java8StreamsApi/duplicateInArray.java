package Java8StreamsApi;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class duplicateInArray {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,2,5,3,6};

        Arrays.stream(arr)
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

    }
}
