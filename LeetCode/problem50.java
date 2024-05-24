package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class problem50 {

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
    List<Integer> newList = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) {
            return newList;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);

        newList.add(root.val);

        return newList;
    }
}
}
