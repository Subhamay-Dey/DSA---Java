package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class problem49 {

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
    List<Integer> outputList = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root == null) {
            return outputList;
        }
        outputList.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return outputList;
    }
}
}
