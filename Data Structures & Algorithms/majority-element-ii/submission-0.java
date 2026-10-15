class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int l = nums.length;
        int onethird = l/3;
        List<Integer> al = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i =0; i< l; i++) {
            int count = map.getOrDefault(nums[i], 0);
            count = count +1;

            if (count > onethird && !al.contains(nums[i])) {
                al.add(nums[i]);
            }
            map.put(nums[i], count);
        }

        return al;
        
    }
}