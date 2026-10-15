class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        HashSet<Character> set = new HashSet<>();
        int siz = 0;

        for (; r < s.length(); r++) {
            if (!set.add(s.charAt(r))) {
                while (l <= r && set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(r));
            siz = Math.max(siz, set.size());
        }
        return siz;
    }
}