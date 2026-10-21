import java.util.ArrayList;
class Solution {
    public int[] numberGame(int[] nums) {
        for (int i = 0; i<nums.length; i = i + 2){
            int val = 0;
            if (nums[i] < nums[i+1]){
                val = nums[i+1];
                nums[i] = nums[i+1];
                nums[i] = val;
            }
        }
        return nums;
        
    }
}