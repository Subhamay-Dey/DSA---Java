package LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class problem52 {

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null) return result;
        q.offer(root);

        while(!q.isEmpty()) {
            int levelNum = q.size();
            List<Integer> sublist = new LinkedList<Integer>();

            for(int i = 0; i < levelNum; i++) {
                if(q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if(q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                sublist.add(q.poll().val);
            }
            result.add(sublist);
        }
        return result;
    }
}
}
