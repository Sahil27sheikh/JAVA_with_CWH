import java.util.Scanner;
public class CWH_35_ch7_practiceSet_q2_q4 {

    // Question 2:
    static void starPattern1(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question 4:

    static void starPattern2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 2:
        // write the programme with use the function to print following pattern.
        /*
        *
        * *
        * * *
        * * * *
        */
        System.out.println("Question 2");
        System.out.print("Enter the number: ");
        starPattern1(sc.nextInt());


        // Question 4
        System.out.println("Question 4");
        System.out.print("Enter the number: ");
        starPattern2(sc.nextInt());
    }
}
