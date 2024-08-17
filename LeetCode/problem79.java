package LeetCode;

public class problem79 {
    class Solution {
        public int triangularSum(int[] nums) {
           return afterSum(nums, nums.length);
        }
    
        public int afterSum(int[] nums, int length) {
            if(length == 1) return nums[0];
    
            for(int i = 0; i < nums.length - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            return afterSum(nums, length - 1);
        }
    }
}
