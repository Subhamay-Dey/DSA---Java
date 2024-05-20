public class recursion3 {

    public static void Sum(int n, int i, int sum){

        if(i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        Sum(n, i+1, sum);
    }
    public static void main(String args[]) {
        Sum(10, 1, 0);
    }
}
