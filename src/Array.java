import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
       //1D array
//        int[] marks5 = {20, 30, 40, 50, 50};
//
//        System.out.println(marks5);
//        System.out.println(Arrays.toString(marks5));
//
//        for (int mark:marks5){
//            System.out.println(mark);
//        }

    //2D array
        int[][] matrix3={{1,2,3},{4,5,6}};
        System.out.println(matrix3);
        System.out.println(Arrays.toString(matrix3));

        System.out.println(Arrays.deepToString(matrix3));

        for(int[] num:matrix3){
            System.out.println(Arrays.deepToString(matrix3));
        }

        //compare two arrays
//        int[] num1={1,2,3};
//        int[] num2={4,5,6};
//        System.out.println(Arrays.equals(num1,num2));
//
//        int[] num3={1,2,3};
//        System.out.println(Arrays.equals(num1,num3));


    }

}
