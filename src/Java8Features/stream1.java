package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream1 {

    //find out the distinct numbers from given list
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 6, 2, 3);
        //numbers.stream().distinct().forEach(System.out::println);

        //sort the given list
        //numbers.stream().sorted().forEach(System.out::println);

        //Filter the data // Java 8 Program to find Odd Numbers from a List
        List<Integer> oddNum = numbers.stream().filter(o -> o % 2 != 0).collect(Collectors.toList());

        System.out.println(oddNum);


    }


}
