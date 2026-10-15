class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i =0; i < nums.length; i++) {
            List<Integer> l = map.getOrDefault(nums[i], new ArrayList<>());
            l.add(i);
            map.put(nums[i], l);
        }
        System.out.println(map);

        for (int i = 0; i< nums.length-1; i++) {
            int w = target-nums[i];
            if (map.containsKey(w)) {
                List l = map.get(w);
                if (nums[i] != w) {
                    return new int[]{i, (int)l.get(0)};
                }
                
                for (int ind = 0; ind < l.size(); ind++) {
                    int ind2 = (int)l.get(ind);
                    if (ind2 != i) {
                        return new int[]{i, ind2};
                    }
                }
            }
        }

        return new int[]{0,0};
        
    }
}
