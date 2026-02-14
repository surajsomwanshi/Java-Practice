package Java8StreamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class averageOfEvenNo {
    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(1,2,4,8,5,6,7,3,9);

       OptionalDouble evenSum = arr.stream()
                .filter(n -> n % 2 == 0)
                        .mapToInt(Integer::intValue)
                                .average();

        System.out.println("Average of even Numbers:"+ evenSum);

        //sorting in java
      List<Integer> sortList= arr.stream()
                .sorted().toList();

        System.out.println(sortList);


    }
}
