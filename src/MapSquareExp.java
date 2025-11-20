import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapSquareExp {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,4,7,7);

       List<Integer> squareList =  numbers.stream()
                .map(n-> n*n)
                .collect(Collectors.toList());

        System.out.println(squareList);

        //Find a maximum value from list

        int max = numbers.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);

        //Reduce a list of int to their sum

        int sum = numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println(sum);

        //Length of the sting
        List<String> words = Arrays.asList("Suraj","Thor","Hulk");
        words.forEach(word -> System.out.println(word.length()));

        //distinct elements from list of int
    List<Integer> distNum = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distNum);

     //limit and skip elements in a list
     List<Integer> limitNum = numbers.stream()
             .limit(3)
             .collect(Collectors.toList());

        System.out.println(limitNum);

    }
}
