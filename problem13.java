class Solution {
    public int divide(int dividend, int divisor) {
        
        // int output = 0;
        // while(divisor > 0 && dividend > 0) {
        //     output = dividend / divisor;
        // }
        // return output;

         if(dividend==-2147483648 && divisor==-1){
            return 2147483647;
        }
        else{
            return dividend/divisor;
        }
    }
}