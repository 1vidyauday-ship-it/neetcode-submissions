class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int stone : stones) {
            pq.add(stone);
        }
        //System.out.println(pq);

        while (pq.size() >=2) {
            int h1 = pq.poll();
            int h2 = pq.poll();
            //System.out.println("h1: " + h1 + " h2 " + h2);
            if (Math.abs(h1 - h2) > 0) {
                pq.add(Math.abs(h1 - h2));
            }
        }
        if (pq.size() == 1) {
            return pq.peek();
        }
        return 0;
    }
}
