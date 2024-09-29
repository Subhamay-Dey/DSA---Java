package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class problem83 {
    class Solution {
    List<List<Integer>> res = new LinkedList<>();
    int[] arr;
    public List<List<Integer>> subsets(int[] nums) {
        arr = nums;
        dfs(new LinkedList<>(), 0);
        return res;
    }
    private void dfs(List<Integer> subset, int currentIndex) {
        res.add(new ArrayList<>(subset));
        for(int i = currentIndex; i < arr.length; i++) {
            subset.add(arr[i]);
            dfs(subset, i + 1);
            subset.remove(subset.size() - 1);
        }

    }
}
}
