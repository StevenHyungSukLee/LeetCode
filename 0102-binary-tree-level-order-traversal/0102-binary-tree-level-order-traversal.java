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
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root == null)return result;
        
        helper(root,0);
        
        return result;
    }
    
    public void helper(TreeNode root, int lev){
        
        if(result.size() == lev){
            List<Integer> list = new ArrayList<>();
            result.add(list);
        }
        
        result.get(lev).add(root.val);
        
        if(root.left != null){
            helper(root.left, lev+1);
        }
        if(root.right != null){
            helper(root.right, lev+1);
        }
        
    }
}