package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNum {
    //to print even numbers from the list
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 8, 11, 22, 33, 99);

        List<Integer> evenNum = numbers.stream().filter(o -> o % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNum);

    }
}
