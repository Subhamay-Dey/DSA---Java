package LeetCode;

public class problem22 {
    class Solution {
        public boolean isPalindrome(int x) {
            
            if(x < 0) {
                return false;
            }
    
            int reverse = 0;
            int temp = x;
    
            while(temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
            }
    
            return (reverse == x);
        }
    }
}
