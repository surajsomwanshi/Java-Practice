import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {

    public static int secondHighest(List<Integer> arr){
//        return Arrays.stream(arr)
//                .distinct()
//                .boxed()
//                .sorted((a,b) -> b-a)
//                .skip(1)
//                .findFirst()
//                .orElseThrow(()-> new RuntimeException("No second highest number found"));

        return arr.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(2,4,6,7,8,9,9);
        System.out.println(secondHighest(arr));
    }
}
