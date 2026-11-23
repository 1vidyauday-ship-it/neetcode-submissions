class Solution {
    public int leastInterval(char[] tasks, int n) {
        System.out.println("called ");
        int[] arr = new int[26];
        for (char task : tasks) {
            arr[task - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) pq.add(arr[i]);
        }
       System.out.println("here " + pq);
        Queue<int[]> q = new LinkedList<>();
        int time = 0;
        while (!pq.isEmpty() || !q.isEmpty()) {
            time++;
            if (pq.isEmpty()) {
                time =  q.peek()[1];
            } else {
                int ct = pq.poll()-1;
                if (ct > 0)
                    q.add(new int[]{ct, time + n});
            }
            if (!q.isEmpty() && q.peek()[1] == time ) {
                pq.add(q.poll()[0]);
            }

        }
        return time;
    }
}
