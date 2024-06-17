package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class problem70 {
    class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
              int[] counts = new int[51];
        for (int num : candidates) {
            counts[num]++;
        }
        // Arrays.fill(counts, 1); 
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        findAll(counts, cur, 1, target, ans);
        return ans;
    }

    private void findAll(int[] counts, List<Integer> cur, int i, int target, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int j = i; j < counts.length; j++) {
            if (j <= target && counts[j] > 0) {
                counts[j]--;
                cur.add(j);
                findAll(counts, cur, j, target - j, ans);
                cur.remove(cur.size() - 1);
                counts[j]++;
            } else if (j > target) return;
        }
    }
}
}
