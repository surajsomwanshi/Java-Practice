package Java8Features;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find first non-repeating character from the string
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";

     Character FirstNonRepeat = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
             .entrySet().stream()
             .filter(e->e.getValue()==1)
             .map(Map.Entry::getKey)
             .findFirst()
             .orElse(null);

        System.out.println("First Non-repeating character : "+FirstNonRepeat);
    }
}
