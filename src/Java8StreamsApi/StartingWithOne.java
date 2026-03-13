package Java8StreamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingWithOne {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,18,10,25,34,1);

        List<Integer> oneList= list.stream()
                .filter(n-> n.toString().startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(oneList);
    }
}
