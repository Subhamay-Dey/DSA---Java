public class recursion4 {
    public static int Factorial(int n){

        if(n == 1 || n == 0) {
            return 1;
        }
        int fact_num_decrease = Factorial(n-1);
        int factorial = n * fact_num_decrease;
        return factorial;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = Factorial(n);
        System.out.println(ans);
    }
}
