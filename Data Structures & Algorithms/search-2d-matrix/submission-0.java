class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binSearch(matrix, target);
        
        
    }

    public boolean binSearch(int[][] nums, int target) {
        int m = nums.length;
        int n = nums[0].length;
        int l = 0;
        int r = m * n - 1;

        while (l <= r) {
            int mid = (l+r)/2;
            int row = mid/n;
            int col = mid%n;

            if (nums[row][col] == target) return true;
            else if (nums[row][col] < target) l = mid +1;
            else r = mid-1;
        }
        return false;
    }
}
