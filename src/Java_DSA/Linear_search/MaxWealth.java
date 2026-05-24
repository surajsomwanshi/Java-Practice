package Java_DSA.Linear_search;

public class MaxWealth {
    public static void main(String[] args) {
          int[][] arr= {
                  {1,2,4},
                  {2,3,4}
          };
     int num=maximumWealth(arr);
     System.out.println(num);
    }

    public static int maximumWealth(int[][] accounts){
        //person = rol
        //account = col
        int ans = Integer.MIN_VALUE;
        int sum=0;
        for (int[] ints : accounts) {
            //when you start a new col, take a new sum for that row
            for (int anInt : ints) {
                sum += anInt;
            }
            //now we have sum of accounts of person
            //check with overall ans
            if (sum > ans) {
                ans = sum;
            }

        }
        return sum;
    }
}
