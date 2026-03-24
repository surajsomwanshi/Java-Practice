package InterviewPreparation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class methodRefExp {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        //1.className::staticMethodNAme
        numbers.forEach(System.out::println);

        //2. Instance::instanceMethodNAme
        String str = "Hello";
        Supplier<Integer> lengthStr = str::length;
        System.out.println(lengthStr.get());

        //3. ClassName:: instanceMethodNAme
        List<String> words = Arrays.asList("apple","banana","mango");
        words.sort(String::compareToIgnoreCase);

    }
}
