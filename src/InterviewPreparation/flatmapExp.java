package InterviewPreparation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmapExp {
    public static void main(String[] args) {
        List<List<String>> names = Arrays.asList(
                Arrays.asList("Alice","cooper"),
                Arrays.asList("bob","tore"),
                Arrays.asList("Eve")
        );

    List<String> allNames= names.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(allNames);
    }
}
