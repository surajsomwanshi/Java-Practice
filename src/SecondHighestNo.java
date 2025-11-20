import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,35,50,75,65);

        Optional<Integer> secondLargest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        if(secondLargest.isPresent()){
            System.out.println("the second largest number :"+secondLargest);
        }else{
            System.out.println("the list does not have enough numbers");
        }
    }
}
