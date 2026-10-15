class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuffer st = new StringBuffer(cleaned);
        st.reverse();
        String rev = st.toString();
        //System.out.println(rev);
        if (cleaned.equalsIgnoreCase(rev)) {
            return true;
        }
        return false;
        
    }
}
