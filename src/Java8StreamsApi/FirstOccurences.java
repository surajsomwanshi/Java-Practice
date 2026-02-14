package Java8StreamsApi;

import java.util.stream.IntStream;

public class FirstOccurences {
    public static void main(String[] args) {
        String str = "swiss";

        char ch = 's';

        IntStream.range(0,str.length())
                .filter(i->str.charAt(i) == ch)
                .findFirst()
                .ifPresent(i->
                                System.out.println("First Occurance "+ i)
                        );
    }
}
