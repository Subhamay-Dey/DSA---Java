class Solution {
    public int removeDuplicates(int[] nums) {

        // int k = 1;

        // for(int i = 0; i < nums.length - 1; i++) {
        //     if(nums[i] != nums[i+1]) {
        //         k++;
        //     }
        // }
        // return k;

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}