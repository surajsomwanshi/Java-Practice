package InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exp2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("charlie","bob","stephan","kooper", "davin");

        List<String> sortedNames= names.stream()
                .sorted((s1,s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}
