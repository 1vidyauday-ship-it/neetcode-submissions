class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c: s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i <= s2.length()-s1.length(); i++) {
            if (checkPermutation(i, s2, s1.length(), map)) {
                return true;
            }
        }
        
        return false;
    }

    boolean checkPermutation(int st,String s, int l , Map<Character, Integer> map) {
         Map<Character, Integer> compMap = new HashMap<>();
        for (int j = st; j < st+l; j++) {
            char c = s.charAt(j);
            compMap.put(c, compMap.getOrDefault(c, 0) + 1);
         
        }
        //System.out.println("orig:" + map);
        //System.out.println("comp:" + compMap);
        return compMap.equals(map);
    }
}
