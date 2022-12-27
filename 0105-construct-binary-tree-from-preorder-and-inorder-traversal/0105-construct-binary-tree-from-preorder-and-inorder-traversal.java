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
    Map<Integer,Integer> map;
    int index;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int index = 0;
        map = new HashMap<>();
        
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        return subtree(preorder, 0, preorder.length-1);
    }
    
    public TreeNode subtree(int[] preorder, int left, int right){
        if(left > right) return null;
        
        int rootVal = preorder[index++];
        TreeNode root = new TreeNode(rootVal);
        
        root.left = subtree(preorder, left, map.get(rootVal)-1);
        root.right = subtree(preorder, map.get(rootVal)+1, right);
        
        return root;
    }
}