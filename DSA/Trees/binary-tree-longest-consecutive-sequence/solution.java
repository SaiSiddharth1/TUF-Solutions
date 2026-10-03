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
    private int max = 0;
    public int longestConsecutive(TreeNode root) {
        // Your code goes here
        max = 1;
        solve(root,1);
        return max;
    }
    void solve(TreeNode root,int c){
        if(root == null) return;
        max = Math.max(c,max);
        if(root.left != null && root.left.val - 1 == root.val)
            solve(root.left,c + 1);
        else solve(root.left,1);   
        if(root.right != null && root.right.val - 1 == root.val)
            solve(root.right,c + 1);
        else solve(root.right,1);    
    }
}