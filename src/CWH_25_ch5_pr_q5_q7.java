import java.util.Scanner;
public class CWH_25_ch5_pr_q5_q7 {
    public static void main(String[] args) {
        // Question 5
        // write the java of the find the factorial of the given number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long a = sc.nextLong();
        long ftr = 1L;
        for (long item=1L; item<=a; item++){
            ftr *= item;
        }
        System.out.printf("The factorial of %d is %d",a,ftr);
        System.out.println();




        // Question 7
        // write the java of the find the factorial of the given number.
        System.out.print("enter the number: ");
        long n = sc.nextLong();
        long i = 1L;
        long factorial = 1L; // the value of the factorial is use 1 because of when "0" is the value the multiplication is always "0"
                             // "0" is use for sum and minus.
        while (i<=n){
            factorial *= i;
            i++;
        }
        System.out.printf("The factorial of %d is %d",n,factorial);
        // Note: this programme is able to print the factorial of the largest number is 65.
    }
}

// What is factorial?
// n = n * n-1 * n-2* n-3 * n-4 *.....
// means the factorial of the 5 is = 5! = 5*4*3*2*1
// ! is the symbol of the factorial
