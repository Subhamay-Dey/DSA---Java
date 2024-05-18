class Solution {
    public int search(int[] nums, int target) {
        int low = 0; 
        int high = nums.length -1;

        while(low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low] == target ? low : -1;
    }
}