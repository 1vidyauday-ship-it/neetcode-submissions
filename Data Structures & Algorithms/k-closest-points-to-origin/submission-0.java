class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Double> heap = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Double, List<int[]>> map = new HashMap<>();
        int[][] ans = new int[k][2];

        for (int[] point : points) {
            double res =  Math.pow(point[0],2) + Math.pow(point[1],2);
            //if (!heap.contains(res))
            heap.add(res);
            map.computeIfAbsent(res, kt-> new ArrayList<int[]>()).add(point);

            
        }
        while (heap.size() > k) {
                double hs = heap.remove();
                // System.out.println("hs " + hs);
                map.remove(hs);             
        }
        // System.out.println("map " + map);
        //System.out.println("heap " + heap);
        int jt = 0;
        for (Map.Entry<Double, List<int[]>> e : map.entrySet()) {
            List<int[]> it = e.getValue();

            for (int i = 0; i <  it.size() ; i++) {
               // System.out.println("*** " + Arrays.toString(it.get(i)));
                ans[jt++] = it.get(i);
            }
          

        }
        

        return ans; 

    }
}
