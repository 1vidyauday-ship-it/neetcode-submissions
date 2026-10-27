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
    public int maxDepth(TreeNode root) {
        return  getDepth(root);
    }

    int getDepth(TreeNode root) {
        if (root == null) return 0;

        int left = getDepth(root.left) +1;
        int right = getDepth(root.right) +1;
        //System.out.println(Math.max(left, right));
        return Math.max(left, right);
    }
}
