package labs.Codingbat;

public class groupSum5{

    public static boolean group_Sum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] % 5 == 0) {
            if (start + 1 != nums.length && nums[start + 1] == 1) {
                return group_Sum5(start + 2, nums, target - nums[start]);
            }else {
                return group_Sum5(start + 1, nums, target - nums[start]);
            }
        }
        return (group_Sum5(start + 1, nums, target - nums[start]) || group_Sum5(start + 1, nums, target));
    }
}
//T(n) = T(n-1) + c1
//T(n) = c1n + c
//O(c1n + c)
//O(n)
