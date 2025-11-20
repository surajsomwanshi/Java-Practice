package Java8Features;

import java.util.function.Supplier;

public class SupplierExp {
    public static void main(String[] args) {
        Supplier<Double> num = () -> Math.random() * 1000 + 9999;
        System.out.println(num.get());
    }
}
