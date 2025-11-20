package Java8Features;

import java.util.List;

public class Stream {

    public static void main(String[] args) {

        //print elements which have size a greater than 5
        List<String> fruits = List.of("apple", "Banana", "grape");
        List<String> filtered = fruits.stream()
                .filter(s -> s.length() > 5)
                .toList();

        System.out.println("List :" + filtered);

    }
}
