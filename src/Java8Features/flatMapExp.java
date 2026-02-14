package Java8Features;

import java.util.*;
import java.util.stream.Collectors;
public class flatMapExp {
        public static void main(String[] args) {

            List<List<String>> names= Arrays.asList(
                    Arrays.asList("suraj","neeraj"),
                    Arrays.asList("abc","fde"),
                    Arrays.asList("neeraj","raj")
            );

            List<String> flatList= names.stream().flatMap(List::stream).collect(Collectors.toList());
            System.out.println(flatList);
        }
    }
