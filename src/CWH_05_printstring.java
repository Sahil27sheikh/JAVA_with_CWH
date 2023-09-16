import java.util.Scanner;

public class CWH_05_printstring {

    public static void main(String[] args) {
        System.out.println("Taking input form the user");
        Scanner sahil = new Scanner(System.in);   // System.in is use for keyboard input.

 //        System.out.print("Enter your full name: ");
//        String str = sahil.next();
//        System.out.println(str);

        System.out.print("Enter your full name: ");
        String m = sahil.nextLine();
        System.out.print(m);
    }
}


//         for get the input form user in the form of string the-
//        .next(); i print only the one word because of the .next(); is read only one word at that time
//        .nextLine(); is use. .nextLine(); is read the full line and print the full line.