package Java8Features;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class firstPattern {

//    *
//    **
//    ***
//    ****
//    *****
    //print above pattern

    public static void main(String[] args) {

//        for(int i = 1; i<=5;i++){
//            for (int j=1;j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //IntStream.rangeClosed(1,5).forEach(i-> System.out.println("*".repeat(i)));

//         List<List<Integer>> num1= Arrays.asList(
//                 Arrays.asList(1,2,4,6),
//                 Arrays.asList(4,6,9)
//         );
//
//        List<Integer> combined=  num1.stream().flatMap(List::stream)
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(combined);
         // print even numbers
//        List<Integer>numbers =  nums.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(numbers);
//        print odd nums
//        List<Integer> oddNums = nums.stream().filter(n->n%2!=0).collect(Collectors.toList());
//        System.out.println(oddNums);

        //Reverse a string
//        String str = "Suraj";
//        String reverse = "";
//
//        for (int i = str.length()-1; i >=0 ; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//
//        System.out.println(reverse);

     //print a numbers from string
//        String str="2a3b4c5d";
//        str.chars()
//                .filter(Character::isDigit)
//                .forEach(ch-> System.out.println((char) ch));

//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (Character.isDigit(ch)){
//                System.out.println(ch + " ");
//            }
//        }


        

    }
}
