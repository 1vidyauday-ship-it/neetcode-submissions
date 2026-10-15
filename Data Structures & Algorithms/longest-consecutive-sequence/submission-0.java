class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int lngest = 0;

        for (int i : nums) {
            hs.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!hs.contains(nums[i]-1)) {
                int  l = 1;
                while (hs.contains(nums[i]+l)) {
                    l++;
                }
                lngest = Math.max(lngest, l);
            }
        }
        return lngest;
        
    }
}
