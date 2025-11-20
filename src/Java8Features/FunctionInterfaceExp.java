package Java8Features;

import java.util.function.Function;

public class FunctionInterfaceExp {
    public static void main(String[] args) {
        Function<Integer, Double> num = a -> a / 2.0;
        System.out.println(num.apply(10));
    }
}
