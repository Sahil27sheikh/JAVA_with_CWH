import java.util.Scanner;
public class CWH_25_ch5_pr_q9 {
    // sum of the multiplication table of "n" numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        System.out.print("Enter the number: ");
        long a = sc.nextInt();
        System.out.println("Your Multiplication Table Of Number "+a);
        for (long i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",a, i, a*i);

            sum += a*i;
        }
        System.out.println();
        System.out.println("The sum of this multiplication table are: "+sum);

    }
}
