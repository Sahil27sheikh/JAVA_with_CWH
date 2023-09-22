import java.util.Scanner;
public class CWH_23_forLoop {
    public static void main(String[] args) {

        for (int i = 1; i<=10; i++ ){
            System.out.println(i);
        }

        // Quick Quiz
        // Write a programme to print the first "n" odd number using for loop.
        // 2i = Even Number = 0, 2, 3, 4...
        // 2i+1 = Odd Number = 1, 3, 5, 7, 9....

        int n = 10;
        System.out.println("The Odd Numbers Are: ");
        for (int i = 0; i<n; i++){
            System.out.println(2*i+1);
        }


        // Decrementing for loop.
        for ( int b = 5; b>0; b--){
            System.out.println(b);
        }

        // Quick Quiz
        // Write a java programme to print the first "n" natural numbers in reverse order.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        for (int d = sc.nextInt(); d>0; d--){
            System.out.println(d);
        }
    }
}
