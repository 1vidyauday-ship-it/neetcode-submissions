class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] prefix = new int[l];
        int[] suffix = new int[l];
        int ltor =1;
        int rtol = 1;
        prefix[0] = nums[0];
        suffix[l-1] = nums[l-1];

        for (int i = 1; i < l ;i++) {
            prefix[i] = prefix[i-1] * nums[i];
        }
        for (int i = l-2; i >= 0 ;i--) {
            suffix[i] = suffix[i+1] * nums[i];
        }
        nums[0] = suffix[1];
        nums[l-1] = prefix[l-2];
        for (int i = 1; i < l-1; i++) {
            nums[i] = prefix[i-1] * suffix[i+1];
        }
        return nums;
    }
}  
