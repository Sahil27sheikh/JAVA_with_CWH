import java.util.Scanner;
public class CWH_25_ch5_pr_q7 {
    // Repeat question 1 using while loop.
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a =sc.nextInt();
        int i =a;
        while(i>0){
            i--;
            for (int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
