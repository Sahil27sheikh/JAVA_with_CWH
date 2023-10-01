import java.util.Scanner;
public class CWH_35_ch7_practiceSet_q1 {

    // Question 1:
    static void multitable(long n){
        for (long i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        // Question 1:
        // Write a java programme to print the multiplication table of number "n".
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for create the multiplication table: ");
        multitable(sc.nextLong());
        System.out.println("it is your multiplication table");
    }
}
