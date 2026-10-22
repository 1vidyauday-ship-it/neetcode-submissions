class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> que = new ArrayDeque<>();
        int[] res = new int[nums.length-k+1];
        //int max = Integer.MIN_VALUE;

        for (int i = 0; i < k ;i++) {
            while (!que.isEmpty() && nums[i] >= nums[que.peekLast()]) {
                que.pollLast();
            } 
           
            que.offerLast(i);
            // System.out.println(que);
        }
        
        res[0] =nums[que.peekFirst()];
        int a = 1;
        for (int i = k; i < nums.length; i++) {
           int j = que.peekFirst();
            if (j == i-k) {
                 que.pollFirst();
            }
            while (!que.isEmpty() && nums[i] >= nums[que.peekLast()]) {
                que.pollLast();
            }
           
            que.offerLast(i);
           
           
            res[a] = nums[que.peekFirst()];
            a++;
        }

        return res;
    }
}