class Solution {
    public int characterReplacement(String s, int k) {
        int lptr = 0;
        int rptr = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxfreq  = 0;
        int res = 0;

        while (rptr < s.length()) {
            char ch = s.charAt(rptr);
            int kt = map.getOrDefault(ch, 0);
            map.put(ch, kt+1);
            if (map.get(ch) > maxfreq) {
                maxfreq = map.get(ch);
            }
           // System.out.println(map);
            if (rptr-lptr+1 - maxfreq <= k) 
                res = Math.max(rptr-lptr+1, res);
           else {
            if(lptr <= rptr) {
                map.put(s.charAt(lptr), map.get(s.charAt(lptr))-1);
                if (s.charAt(lptr) == s.charAt(rptr)) {
                        maxfreq--;
                    }
                lptr++;
            } 
           }
            
           
            //System.out.println("res:" + res);
            rptr++;
        }
        return res;
        
    }
}
