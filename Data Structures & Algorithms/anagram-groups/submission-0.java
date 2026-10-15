class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            List l = map.getOrDefault(key, new ArrayList<String>());
            l.add(s);
            map.put(key, l);
            
        }

        for (Map.Entry<String, List<String>> e : map.entrySet() ) {
            res.add(e.getValue());
        }
        return res;
        
    }
}
