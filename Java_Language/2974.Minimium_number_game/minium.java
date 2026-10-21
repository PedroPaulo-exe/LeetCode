class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i+=2){
            int box = nums[i+1];
            nums[i+1] = nums[i];
            nums[i] = box;
        }
        return nums;
    }
}