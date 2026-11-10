class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Integer.MIN_VALUE;

        for (int p : piles) {
            r = Math.max(r, p);
        }

        while ( l <=r) {
            int mid = (l + r)/2;
            if (canEatBananas(piles, h, mid)) {
                r = mid -1;
                //System.out.println(" high " + r);
            } else {
                  //System.out.println(" low " + r);
                l = mid +1;
            }
        }
        if (r == 0) {
            return piles.length;
        }
        return l;
        
    }

    boolean canEatBananas(int[] piles, int h, int k) {
        int count = 0;
        for (int i = 0; i < piles.length ;i++) {   
            count = count + piles[i]/k;
            if (piles[i] % k != 0) count = count +1;
        }
       // System.out.println(count);
        return count <= h;
    }
}
