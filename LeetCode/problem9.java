package LeetCode;

public class problem9 {
class Solution {
    public int scoreOfString(String s) {
        
        char[] a = s.toCharArray();
        
        int total = 0;
         
        for(int i = 0; i < a.length - 1; i++) {
            total += Math.abs(a[i] - a[i+1]);
        }
        return total;
    }
}
}
