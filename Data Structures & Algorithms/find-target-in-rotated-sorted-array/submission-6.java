class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int res;
        if (target > nums[nums.length-1]) {
            res = binarySearch(nums, target, 0, pivot-1); 
           
        } else {
             res = binarySearch(nums, target, pivot, nums.length-1); 
        }
        //System.out.println(res);
        return res;
    }

    int findPivot(int[] nums) {
        int st = 0;
        int end = nums.length-1;
        //int mid = (st+end)/2;

        while (st < end) {
            int mid = (st+end)/2;
            if (nums[mid] > nums[end]) {
                st = mid+1;
            } else {
                end = mid;
            }
        }
         System.out.println("pivot " +  st);
        return st;
    }

    int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end)/2;
            //System.out.println("target " + target + "mid " + nums[mid]);
            if (target == nums[mid]) return mid;
            if (target < nums[mid]) {
                end = mid-1; 
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
