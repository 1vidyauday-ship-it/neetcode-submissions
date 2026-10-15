class Solution {
    public int helper(int[] nums){
    int sum1 =0, sum2 =0;
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(sum1 + nums[i], sum2);
            sum1 = sum2;
            sum2 = temp;
        }
        return sum2;
    }
    public int rob(int[] nums) {
    
        int sum1 = helper(Arrays.copyOfRange(nums, 1, nums.length));
        int sum2 = helper(Arrays.copyOfRange(nums, 0, nums.length-1));
        return Math.max(nums[0], Math.max(sum1, sum2));
    }
}
