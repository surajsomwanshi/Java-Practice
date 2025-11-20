//Find all pairs in an array whose sum equals K

import java.util.HashSet;
import java.util.Set;

public class SumEqualK {
    public static void main(String[] args) {
        int[] arr={2,4,3,5,7,8,9};
        int k =10;
        Set<Integer> seen = new HashSet<>();

        for (int num: arr){
            int complement = k - num;
            if(seen.contains(complement)) {
                System.out.println("(" + num +", " + complement+ ")");
            }
            seen.add(num);
        }
    }
}
