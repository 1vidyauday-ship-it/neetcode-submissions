class Solution {
    public int climbStairs(int n) {
        int last = 1;
        int curr = 1;
        for (int j = n-1; j >=0; j--) {
            int temp = curr;
            curr = curr+last;
            last = temp;
        }
        return last;
    }
}
