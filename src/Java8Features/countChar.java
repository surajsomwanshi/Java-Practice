package Java8Features;

import java.util.LinkedHashMap;
import java.util.Map;

public class countChar {
    public static void main(String[] args) {
        String str = "swiss";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // print count of each character
        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
