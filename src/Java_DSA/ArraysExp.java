package Java_DSA;

import java.util.Arrays;

public class ArraysExp {

    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3,4},
//                {5,6,7},
//                {8,9,10,11,12}
//        };
//
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }


        int[][] arr2D = new int[5][];

//        for (int row = 0; row < arr2D.length; row++) {
//            arr2D[row] = new int[row + 1]; // initializing columns
//        }
        
        for (int row = 0; row < arr2D.length; row++) {
            arr2D[row] = new int[row + 1];
            for (int col = 0; col <arr2D[row].length ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
