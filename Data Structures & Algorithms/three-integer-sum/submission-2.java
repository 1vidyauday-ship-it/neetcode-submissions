class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 2; i++) {
            int target = -1*nums[i];
            int lptr = i+1;
            int rptr = nums.length-1;
            while (lptr < rptr) {
                if (nums[lptr] + nums[rptr] < target) {
                lptr++;  
                } 
                else if (nums[lptr] + nums[rptr] > target) {
                rptr--;  
                }
                else {
                    set.add(new ArrayList<>(List.of(nums[i], nums[lptr], nums[rptr])));
                    lptr++;
                    rptr--;
                }
            }
        }
         List<List<Integer>> list = new ArrayList<>(set);
         return list;
    }
}
