package Java8Features;

import java.util.function.Consumer;
//Represents an operation that accepts a single input argument and returns no result.
public class ConsumerExp {
    public static void main(String[] args) {
        Consumer<String> str = a -> System.out.println(a);
        str.accept("Surya");
    }
}
