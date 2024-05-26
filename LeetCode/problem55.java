package LeetCode;

public class problem55 {
    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int sum=numBottles;
            
            while(numBottles>=numExchange)
            {
                int drink=numBottles/numExchange;
                
                int left=numBottles%numExchange;
    
                sum=sum+drink;;
    
                numBottles=drink+left;
            }
        return sum;
        }
    }
}
