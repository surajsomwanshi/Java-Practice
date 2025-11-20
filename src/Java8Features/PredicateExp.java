package Java8Features;

import java.util.function.Predicate;

public class PredicateExp {
    public static void main(String[] args) {
        Predicate<Integer> salaryGreaterThanOneLac = x -> x > 100000;
        System.out.println(salaryGreaterThanOneLac.test(1200));
    }
}
