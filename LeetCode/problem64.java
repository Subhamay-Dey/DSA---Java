package LeetCode;

public class problem64 {
    class Solution {
        public int singleNumber(int[] nums) {
    
            int result = 0;
            for (int num : nums) {
                result ^= num;
            }
            return result;
        }
    }
}
