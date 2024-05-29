package LeetCode;

public class problem57 {

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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        else{
            int left = getMaxSubtreeHeight(root.left);
            int right = getMaxSubtreeHeight(root.right);
            return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int getMaxSubtreeHeight(TreeNode node) {
        if(node == null) return 0;
        else{
            return 1 + Math.max(getMaxSubtreeHeight(node.left), getMaxSubtreeHeight(node.right));
        }
    }
}
}
