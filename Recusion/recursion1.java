public class recursion1 {
    public static void printNumb(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }

    public static void main(String args[]) {
        int n = 6;
        printNumb(n);
    }
}