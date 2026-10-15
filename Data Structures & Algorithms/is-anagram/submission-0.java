class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sr = s.toCharArray();
        char[] tr = t.toCharArray();
        Arrays.sort(sr);
        Arrays.sort(tr);
        if (Arrays.equals(sr, tr)) return true;
        return false;

    }
}
