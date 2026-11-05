/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getMaxPathSum(root);
        return res;
    }

    int getMaxPathSum(TreeNode root) {
        if (root == null) return 0;
        int left = getMaxPathSum(root.left);
        int right = getMaxPathSum(root.right);
        left = Math.max(left, 0);
        right = Math.max(right, 0);
        int path = root.val + Math.max(left, right);
        res = Math.max(res,  root.val + left + right);
        return path;
    }
}
