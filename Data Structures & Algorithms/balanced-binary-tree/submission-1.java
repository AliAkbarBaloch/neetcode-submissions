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
    int diff=0;
    public int Height(TreeNode root){
        if(root == null){return 0;}
        int HeightLeft=Height(root.left);
        int HeightRight=Height(root.right);
        diff = Math.max(diff, Math.abs(HeightLeft - HeightRight));
        return Math.max(HeightLeft,HeightRight )+1;
    }
    public boolean isBalanced(TreeNode root) {
        Height(root);
        if(diff <= 1)return true;
        else return false;
    }
}
