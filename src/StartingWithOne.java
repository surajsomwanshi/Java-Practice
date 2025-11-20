import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingWithOne {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,9,14);
        List<String> numbers = list.stream().map(s->s+"")
                .filter(s->s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(numbers);

        List<String> liststr = Arrays.asList("Suraj","Thor","Suresh","IronMan");
        List<String> strstartwiths = liststr.stream()
                .filter(s->s.startsWith("S"))
                .collect(Collectors.toList());

        System.out.println(strstartwiths);
    }
}
