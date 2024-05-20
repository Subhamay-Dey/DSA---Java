package LeetCode;

public class problem12 {
    class Solution {
        public int reverse(int x) {
    
            int reverse = 0;
    
            while (x != 0) {
                int temp = x % 10;
                x = x / 10;
                if (reverse > 0 && reverse > (Integer.MAX_VALUE - temp) / 10
                        || reverse < 0 && reverse < (Integer.MIN_VALUE - temp) / 10)
                    return 0;
                reverse = reverse * 10 + temp;
            }
            return reverse;
        }
    }
}