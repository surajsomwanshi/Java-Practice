package Java_DSA.Linear_search;

public class LinearSearchExp {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans = linearSearchElement(nums,target);
        System.out.println(ans);
    }

    //search int the array:return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

    //search in the array : return the element

    static int linearSearchElement(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            //check for element at every index then return the element
            int element = arr[index];
            if(element==target){
                return element;
            }
        }
        return -1;
    }
}
