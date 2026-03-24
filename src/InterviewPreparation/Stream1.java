package InterviewPreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","bob","Dave","Charlie");

        List<String> longNames= names.stream()
                .filter(n-> n.length()>4)// intermediate operation
                .collect(Collectors.toList());//terminal operation


        List<String> upperNames = names.stream()
                        .filter(u->u.length() >3)
                .map(name -> name.toUpperCase())
                                .collect(Collectors.toList());
        System.out.println(longNames);
        System.out.println(upperNames);
    }
}
