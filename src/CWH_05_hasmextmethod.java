import java.util.Scanner;

public class CWH_05_hasmextmethod {
        public static void main(String[] args) {
            System.out.print("Enter the number to check your input: ");
            Scanner sahil = new Scanner(System.in);   // System.in is use for keyboard input.
            boolean b1 = sahil.hasNextInt();
            System.out.println("The number is integer: " +b1);


        }
}
// hasNext is use to check the input of the user is right are not.