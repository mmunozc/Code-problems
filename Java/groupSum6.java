package labs.Codingbat;

public class groupSum6{
    public boolean group_Sum6(int start, int[] nums, int target) {

        if(start >= nums.length){
            return target==0;
        } 
        if(nums[start] == 6){
            return group_Sum6 (start + 1 , nums, target-nums[start]);
        }
        return group_Sum6(start + 1, nums , target) || group_Sum6(start + 1, nums, target- nums[start]);
    }
}