import java.util.Scanner;
public class CWH_35_ch7_practiceSet_q3_q9 {
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

    static int sumNatural2(int n){
        if (n<=0){
            return 0;
        }
        int sum =0;
        for (int i=0; i<n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Question 3:
        // Write a recursive function to calculate the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sumNatural(sc.nextInt());
        System.out.println(a);


    // Question 9:
    // Write a function to calculate the sum of first n natural numbers using iterative approach.
        System.out.print("Enter the number: ");
    int b = sumNatural2(sc.nextInt());
        System.out.println(b);
}
}

