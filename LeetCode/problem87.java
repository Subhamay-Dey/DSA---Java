package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class problem87 {

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
    int[] preOrder;
    int[] inOrder;
    Map<Integer, Integer> hm = new HashMap<>();
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrder = preorder;
        inOrder = inorder;
        int n = preorder.length;
        
        for(int i = 0; i < n; i++) {
            hm.put(inorder[i], i);
        }
        TreeNode root = dfs(0, n-1);
        return root;
    }
    private TreeNode dfs(int s, int e) {
        if(s > e) return null;

        int curVal = preOrder[index++];
        TreeNode cur = new TreeNode(curVal);

        int mid = hm.get(curVal);

        cur.left = dfs(s, mid - 1);

        cur.right = dfs(mid + 1, e);

        return cur;
    }
}
}
