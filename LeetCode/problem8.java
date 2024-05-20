package LeetCode;

class Solution {
    public int maxSubArray(int[] nums) {
        
        // int sum = 0;

        // for(int i = 0; i < nums.length -1; i++) {
        //     for(int j = i + 1; j < nums.length; j++) {
        //         while(nums[i] != nums[j]) {
        //             if(nums[i] + nums[j] > sum) {
        //                 sum += nums[i] = nums[j];
        //             }
        //         }    
        //     }
            
        // }

        // return sum;

        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
