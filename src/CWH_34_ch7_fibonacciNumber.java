import java.util.Scanner;
public class CWH_34_ch7_fibonacciNumber {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + n + " is: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        printFibonacci(a);
    }
    }
