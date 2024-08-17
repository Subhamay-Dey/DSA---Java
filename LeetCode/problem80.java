package LeetCode;

public class problem80 {
    class Solution {
        public int numberOfSteps(int num) {
            return main(num, 0);
        }
        private static int main(int num, int steps) {
            if(num <= 0) return steps;
            if(num % 2 == 0) return main(num / 2, steps + 1);
            else return main(num - 1, steps + 1);
        }
    }
}
