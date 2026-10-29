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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()) {
            int s = que.size();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                TreeNode t = que.remove();
                if (i == s-1)
                     res.add(t.val);
                if (t.left !=null) que.add(t.left);
                if (t.right !=null) que.add(t.right);
            }
        }
        return res;
    }
}
