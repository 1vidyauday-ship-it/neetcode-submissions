class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       List<Pair<Integer, Integer>> list = new ArrayList<>();
       Collections.sort(list, (a,b) -> b.getKey() -  a.getKey());
       for (int i = 0; i < position.length; i++) {
        list.add(new Pair<Integer, Integer>(target-position[i], speed[i]));
       }
       Collections.sort(list, (a,b) -> a.getKey() -  b.getKey());
       //System.out.println("list: " + list);
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            double dis = list.get(i).getKey();
            double sp = list.get(i).getValue();
            double k = (double)(dis/list.get(i).getValue());
           // System.out.println("k " + k);
            if (stack.size() >= 1 && k > stack.peek()) {
                stack.add(k);
            } 
            else if (stack.size() == 0) stack.add(k);
        }
        return stack.size();
        
    }
}
