package LeetCode;

public class problem6 {
class Solution {
    public boolean isPowerOfTwo(int n) {
    

    if ( n <= 0) {
            return false;
        }

        long i = 1;

        while (i < n){
            i = i * 2;
        }

         return i == n ? true : false;
         
        // if (n <= 0) {
        //     return false;
        // }
        // for(int i = 0; ; i++){

        //     double power = Math.pow(2,i);
        //     if(power == n) {
        //         return true;
        //     } else if(power > n){
        //         return false;
        //     }
        // }


    }
}
}