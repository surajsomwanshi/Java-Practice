package Java_DSA;

import java.util.Scanner;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int n =10;
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while (count<=n){
//            int temp = b;
//            b = b+a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);

        int n = 10;
        Stream.iterate(new int[] {0,1},f-> new int[]{f[1],f[0]+f[1]}).limit(n).forEach(f->System.out.println(f[0]));

    }
}
