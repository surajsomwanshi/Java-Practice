import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,25,8,49,98);
        list.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);
//even numbers
      List<Integer> num= list.stream().filter(x -> x %2 == 0).collect(Collectors.toList());

        System.out.println(num);
    //odd numbers
     List<Integer> num2 =list.stream().filter(x-> x% 2 !=0).collect(Collectors.toList());
        System.out.println(num2);
    }
}
