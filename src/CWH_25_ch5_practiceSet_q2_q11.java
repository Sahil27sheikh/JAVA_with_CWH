import java.util.Scanner;
public class CWH_25_ch5_practiceSet_q2_q11 {
    public static void main(String[] args) {

        // Question 11
        // Write the java programme to sum first "n" even numbers using for loops.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter the number: ");
        int number= sc.nextInt();
        for ( int item=0; item<number; item++ ){
            sum = sum + (2*item);

        }
        System.out.print("Sum of the even numbers are is: ");
        System.out.println(sum);
        /* even numbers is 0, 2 ,4, 6, 8, 10..... */


        // Question 2
        // Repeat the question 2 with while loop.
        int summing = 0;
        int i = 0;

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        while (i<num){
            summing = summing + (2*i);
            i++;
        }
        System.out.print("Sum of the even numbers are is: ");
        System.out.println(summing);

    }
}
