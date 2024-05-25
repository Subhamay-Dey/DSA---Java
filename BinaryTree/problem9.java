package BinaryTree;

public class problem9 {

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

     public static int height(TreeNode root) {
             if (root == null) {
                 return 0;
             }
             int leftHeight = height(root.left);
             int rightHeight = height(root.right);
 
             int myHeight = Math.max(leftHeight, rightHeight) + 1;
 
             return myHeight;
         }
     public int diameterOfBinaryTree(TreeNode root) {
         if(root == null) return 0;
 
         int dia1 = diameterOfBinaryTree(root.left);
         int dia2 = diameterOfBinaryTree(root.right);
         int dia3 = height(root.left)  + height(root.right) + 1;
 
         return Math.max(dia3, Math.max(dia1, dia2));
 
     }
 }
}
