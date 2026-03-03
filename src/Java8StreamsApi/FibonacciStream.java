package Java8StreamsApi;

import java.util.stream.Stream;

public class FibonacciStream {
    public static void main(String[] args) {
        int n=10;

//        Stream.iterate(new int[]{0,1}, f -> new int[]{f[1],f[0]+f[1]})
//                .limit(n)
//                .forEach(f-> System.out.println(f[0]));

          //Fibonacci series using Stream API

        Stream.iterate(new int[]{0,1}, f->new int[]{f[1],f[0]+f[1]})
                .limit(n)
                .forEach(f-> System.out.println(f[0]));
    }
}
