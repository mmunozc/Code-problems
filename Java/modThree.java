package labs.Codingbat;

public class modThree
{
    public boolean mod_Three(int[] nums){
        if (nums.length<3){
            return false;
        }   
        for (int i=0; i< nums.length-2;i++) {
            if ((nums[i] % 2 == 0) && (nums[i + 1] % 2 == 0) && (nums[i + 2] % 2 == 0)) {
                return true;
            } else if ((nums[i] % 2 != 0) && (nums[i + 1] % 2 != 0) && (nums[i + 2] % 2 != 0)) {
                return true;
            }
        }
        return false;
    }
}
