package Java8StreamsApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str="swiss";

        //using for loop
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.println(ch);
                break;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch)== str.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }
        }

        //using java stream
        Character result =
           str.chars()
                   .mapToObj(c->(char)c)
                   .collect(Collectors.groupingBy(
                      e->e,
                      LinkedHashMap::new,
                      Collectors.counting()
                   ))
                   .entrySet().stream()
                   .filter(e->e.getValue()==1)
                   .map(Map.Entry::getKey)
                   .findFirst()
                   .orElse(null);
        System.out.println(result);
    }
}
