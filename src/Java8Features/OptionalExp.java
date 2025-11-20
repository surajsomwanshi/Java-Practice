package Java8Features;

import java.util.Optional;

public class OptionalExp {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("Ram");

        if (name.isPresent()) {
            System.out.println("Hello," + name.get());
        } else {
            System.out.println("Hello, stranger");
        }

        String greeting = name.orElse("Guest");
        System.out.println("welcome, " + greeting);
    }
}
