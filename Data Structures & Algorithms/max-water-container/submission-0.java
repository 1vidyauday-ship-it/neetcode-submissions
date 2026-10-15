class Solution {
    public int maxArea(int[] heights) {
        int ltp = 0;
        int rtp = heights.length-1;

        int sum = 0;

        while (ltp < rtp) {
            int ht = Math.min(heights[ltp], heights[rtp]);
            int lsum = (rtp - ltp) * ht;
            sum = Math.max(lsum, sum);
            if (heights[ltp] < heights[rtp]) {
                ltp++;
            } else {
                rtp--;
            }
        }
        return sum;
    }
}
