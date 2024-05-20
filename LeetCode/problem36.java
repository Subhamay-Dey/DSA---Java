package LeetCode;

public class problem36 {
    class Solution {
        public int removeElement(int[] nums, int val) {
    
            int valid_num = 0;
    
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] != val) {
                    nums[valid_num] = nums[i];
                    valid_num++;
                }
            }
            return valid_num;
    
        }
    }
}
