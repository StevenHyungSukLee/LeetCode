/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int x = 0;
        int y = 0;
        
        if(p.val < q.val){
            x = p.val;
            y = q.val;
        }else{
            x = q.val;
            y = p.val;
        }
        
        if(x == root.val || y == root.val || (x < root.val && y > root.val)){
            return root;
        }else if(x<root.val && y < root.val){
            return lowestCommonAncestor(root.left, p,q);
        }else{
            return lowestCommonAncestor(root.right, p , q);
        }
        
        
    }
}