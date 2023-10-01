import java.util.Scanner;
public class CWH_35_ch7_practiceSet_q7_q8 {

    static void pattern1_rec (int n){
        if (n>0){
            pattern1_rec(n-1);
            for (int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Question 8
    public static void main(String[] args) {


        // Question 8:
        // Repeat question 2 using recursion.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        pattern1_rec(sc.nextInt());


    }
}
