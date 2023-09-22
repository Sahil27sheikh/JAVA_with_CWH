import java.util.Scanner;
public class CWH_25_ch5_pr_q3_q4 {
    public static void main(String[] args) {
         // Question 3
        // write a java programme of "n" number of multiplication table.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long a = sc.nextInt();
        System.out.println("Your Multiplication Table Of Number "+a);
        for (long i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",a, i, a*i);
        }


        // Question 4
        // write a java programme of "n" number of multiplication table in reverse order.
        System.out.print("Enter the number: ");
        long b = sc.nextInt();
        System.out.println("Your Multiplication Table Of Number "+a);
        for (long i=10; i>=1; i--) {
            System.out.printf("%d X %d = %d\n", b, i, b * i);
        }
    }
}
