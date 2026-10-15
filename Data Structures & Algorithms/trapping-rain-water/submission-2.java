class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] ltor = new int[n];
        int[] rtol = new int[n];
        int[] ans = new int[n];
        ltor[0] = height[0];
        rtol[n-1] = height[n-1];
        int res = 0;

        for (int i = 1; i < n ; i++) {
            ltor[i] = Math.max(ltor[i-1], height[i] );
        }
        //System.out.println(Arrays.toString(ltor));
        for (int i = n-2; i >=0  ; i--) {
            rtol[i] = Math.max(rtol[i+1], height[i] );
        }
        //System.out.println(Arrays.toString(rtol));
        for (int i = 0; i < n ; i++) {
            int k  = Math.min(ltor[i], rtol[i]) - height[i];
            if (k > 0) {
                ans[i] = k;
                res = res + k;
            }
        }
        //System.out.println(Arrays.toString(ans));
        return res;
        
    }
}
