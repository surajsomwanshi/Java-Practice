package InterviewPreparation;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class wordsFreq {
    public static void main(String[] args) {
        String str = "I am suraj suraj";

        Map<String, Long> freq = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(
                        c->c,
                        Collectors.counting()
                ));
        System.out.println(freq);

    }
}
