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
    int result;
    public int diameterOfBinaryTree(TreeNode root) {
        result = 0;
        path(root);
        return result;
    }
    
    public int path(TreeNode node){
        if(node == null) return 0;
        
        int left = path(node.left);
        int right = path(node.right);
        
        
        result = Math.max(result, left+right);
        
        
        return Math.max(left,right)+1;
    }
}