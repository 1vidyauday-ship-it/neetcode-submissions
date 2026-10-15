class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lptr = 0, rptr = numbers.length-1;

        
        while (lptr < rptr) {
            int sum = numbers[lptr] + numbers[rptr];
            if (sum == target) {
                return new int[]{lptr+1, rptr+1};
            }
            if (sum > target) {
                rptr--;
            }
             if (sum < target) {
                lptr++;
            }
        }

        return new int[]{-1,-1};
    }
}
