package InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exp1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,2,15,7,4,6,8,9,10,0);

        List<Integer> evenNum = numbers.stream()
                .filter(n-> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> oddNum = numbers.stream()
                        .filter(num-> num %2!=0)
                                .sorted()
                                        .collect(Collectors.toList());
        System.out.println(evenNum);
        System.out.println(oddNum);
    }
}
