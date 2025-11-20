import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountEachCharacter {
    public static void main(String[] args) {
        String s = "Suraj";

        Map<String,Long> map = Arrays.stream(s.split(""))

                .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));

        System.out.println(map);
    }
}
