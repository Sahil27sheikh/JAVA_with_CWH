import java.util.Scanner;
public class CWH_34_ch7_methods_recursion {

        // factorial = n *n-1 *....
        // factorial (5) = 5*4*3*2*1
        // factorial (0) = 1
        // formula: factorial(n) = n * factorial(n-1)
        static long factorial(long n){
            if (n==0 || n==1){
                return 1;
            }
            else {
                return n * factorial(n-1);  // it is call itself.
            }
    }

    // using for loop
    static long factorial_iterative(long x){
            if (x==0 || x==1){
                return 1;
            }
            else {
                int product = 1;
                for (long i = 1; i <= x; i++) {
                    product *= i;
                }
                return product;
            }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
            long a = sc.nextInt();
        System.out.printf("The value of factorial %d using factorial method is %d",a, factorial(a));
        System.out.println();

        System.out.print("Enter the number: ");
        long b = sc.nextInt();
        System.out.printf("The value of factorial %d using factorial_iterative method is %d",a, factorial_iterative(b));
    }
}
