class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
       

        for (char task: tasks) {
            freq[task - 'A']++;
        }

        for (int i = 0; i < 26 ;i++) {
            if (freq[i] > 0)
            maxHeap.add(freq[i]);
        }
        System.out.println(maxHeap);

        int time = 0;
         Queue<int[]> que = new LinkedList<>();
        while(!maxHeap.isEmpty() || !que.isEmpty()) {
            time++;
            if (maxHeap.isEmpty()) {
                time = que.peek()[1];
            } else {
                int ct  = maxHeap.poll()-1;
                if (ct > 0) {
                    que.add(new int[] {ct, time+n});
                }
            }
            if (!que.isEmpty() && que.peek()[1] == time)
                maxHeap.add(que.poll()[0]);
        }


        return time;

    }
}
