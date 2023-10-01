public class CWH_35_ch7_practiceSet_q5 {
    static int fib(int n){
        if (n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        // Question 5:
        // Write a function to print "n th" term of fibonacci series using recursion.
        int result = fib(7);
        System.out.println(result);
    }
}
