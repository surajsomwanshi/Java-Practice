package Java_DSA.Linear_search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 2;
        int ans = linearSearchInRange(nums,target,1,4);
        System.out.println(ans);
    }

// search in array based on the range like index 1 to 4
    static int linearSearchInRange(int[] arr,int target,int start, int end){
        if (target == arr.length){
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
