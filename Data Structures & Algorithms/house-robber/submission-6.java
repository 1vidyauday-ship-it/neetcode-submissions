class Solution {
    public int rob(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int i = nums.length-1; i >=0;i--) {
            int temp = Math.max(nums[i]  + sum1, sum2);
            sum1 = sum2;
            sum2 = temp;

        }
        return sum2;
    }
}
