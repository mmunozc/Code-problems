package labs.Codingbat;

public class groupSumClump{
    public boolean group_SumClump(int start, int[] nums, int target) {
        int temp = 0;
        int i = start; 
        if(start >= nums.length){
            return target == 0;
        }
        while (i<nums.length && nums[start] == nums[i]){
            temp += nums[i];
            i++;
        }
        if(group_SumClump(i, nums, target-temp) || group_SumClump(i, nums, target)){
            return true; 
        }
        return false;
    }
}

//T(n) = T(n-1) + c1
//T(n) = c1n + c
//O(c1n + c)
//O(n)
