class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];

        for (int i = 0; i < nums.length;i++) {
           int kt =  map.getOrDefault(nums[i], 0);
           map.put(nums[i], kt+1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a,b)-> b.getValue().compareTo(a.getValue()));
        //System.out.println(list);
        int ct = 0;
        for (Map.Entry<Integer, Integer> e : list) {
            res[ct] = e.getKey();
            ct++;
            if (ct == k) break;
        }
        return res;
    }
}
