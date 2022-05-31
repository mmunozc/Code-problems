package Talleres;

public class Taller4 {
    public static int arrayMax(int[] arr, int n){
        int max, temp;
        max = arr[n];
        if (n!=0) {
            temp = arrayMax(arr, n - 1);
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public boolean groupSum(int start, int[] nums, int target){
        if (start==nums.length){
            return target ==0;
        }
        return groupSum(start+1, nums, target - nums[start])||groupSum(start+1, nums, target);
    }
}
