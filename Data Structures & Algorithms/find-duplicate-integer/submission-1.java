class Solution {
    public int findDuplicate(int[] nums) {
        //HashSet<Integer> set = new HashSet<>();
        boolean[] tr = new boolean[nums.length+1];

        for (int n : nums ) {
            if (!tr[n]) tr[n] = true;
            else return n;
        }
        return -1;
    }
}
