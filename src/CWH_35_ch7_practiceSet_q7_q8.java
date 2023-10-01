import java.util.Scanner;
public class CWH_35_ch7_practiceSet_q7_q8 {

    static void pattern2_rec (int n){
        if (n>0){
            pattern2_rec(n-1);  // print stars n-1 times first
            for (int i=0; i<n; i++){
                System.out.print("*");  // print stars n times at a bottom.
            }
            System.out.println();
        }
    }

    static void pattern1_rec(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");  // Print stars n times at the top.
            }
            System.out.println();

            pattern1_rec(n - 1);  // Recursively print stars n-1 times after the stars at the top.
        }
    }
    // Question 8
    public static void main(String[] args) {


        // Question 8:
        // Repeat question 2 using recursion.
        System.out.println("Question 8");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        pattern2_rec(sc.nextInt());

        // Question 7:
        // Repeat question 4 using recursion.
        System.out.println("Question 7");
        System.out.print("Enter the number: ");
        pattern1_rec(sc.nextInt());


    }
}
