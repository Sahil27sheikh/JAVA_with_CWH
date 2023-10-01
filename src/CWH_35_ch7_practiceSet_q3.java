import java.util.Scanner;
public class CWH_35_ch7_practiceSet_q3 {
    // Question 3:
    // sum (n) = sum(n-1) + n
    // Example:
    // sum (3) = 3 +sum(2)
    // sum (3) = 3 + 2 +sum(1)
    // sum (3) = 3 + 2 + 1
    static int sumNatural(int n){
        // Base condition
        if (n==1){
            return 1;
        }
        else {
            return n + sumNatural(n - 1);
        }
    }
    public static void main(String[] args) {
        // Question 3:
        // Write a recursive function to calculate the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sumNatural(sc.nextInt());
        System.out.println(a);
    }
}
