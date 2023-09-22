import java.util.Scanner;
public class CWH_25_ch5_practiceSet {
    public static void main(String[] args) {
        /*
        Question 1
        Write the java programme to print the following pattern
        * * * *
        * * *
        * *
        *
        */
        int n = 4;
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int number = sc.nextInt();
        for (int item=number; item>0; item--){
            for (int k=0; k<item; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
