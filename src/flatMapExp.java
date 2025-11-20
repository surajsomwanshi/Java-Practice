import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapExp {

    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(Arrays.asList("A","B"),Arrays.asList("C","D"));
        List<String> lists =  list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(lists);
    }
}
