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
    public boolean isValidBST(TreeNode root) {
        return valid(root,null,null);
    }
    
    public boolean valid(TreeNode root, TreeNode high, TreeNode low){
        if(root == null)return true;
        
        if((low != null && root.val <= low.val) || (high != null && root.val >= high.val)){
            return false;
        }
        
        return valid(root.left, root, low) && valid(root.right, high, root);
    }
}