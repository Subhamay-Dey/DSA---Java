package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class problem77 {
    class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        f(nums, result, 0);
        return result;
    }

    private void f(int[] nums, List<List<Integer>> result, int index) {
        if(index == nums.length) {
            List<Integer> perm = new ArrayList<>();
            for(int el: nums) {
                perm.add(el);
            }
        result.add(perm);
        return;
        } 
        for(int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            f(nums, result, index + 1);
            swap(nums, i, index);
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
}
