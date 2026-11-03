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
    int inx = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //first node is root
        //try find first node in inorder
        //left of inorder is left subtree
        //right of inorder is right subtree

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return dfs(preorder, 0, inorder.length-1);   
    }

   TreeNode dfs(int[] preorder,int start,int end) {
        if (start > end) return null;
        int rootval = preorder[inx++];
        TreeNode root = new TreeNode(rootval);
        int ind = map.get(rootval);
        root.left = dfs(preorder, start, ind-1);
        root.right = dfs(preorder, ind+1, end);
        return root;
   }
}

