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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        
        if(isSame(root,subRoot)) return true;
        
        return isSubtree(root.right,subRoot)||isSubtree(root.left,subRoot);
    }
    public boolean isSame(TreeNode x, TreeNode y){
        if(x == null && y == null) return true;
        if(x == null || y == null) return false;
        
        if(x.val==y.val)return isSame(x.left,y.left)&&isSame(x.right,y.right);
        
        return false;
    }
}