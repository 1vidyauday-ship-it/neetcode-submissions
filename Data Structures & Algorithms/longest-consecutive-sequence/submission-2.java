class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int max = 0;
        int count = 1;
        if (nums.length ==0) return 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] +1) {
                count++;
            }
            else if (nums[i] == nums[i-1]) {
                //count++;
            }
            else {
                max = Math.max(count, max);
                count = 1;
            }
        }
        max = Math.max(count, max);
        return max;
    }
}
