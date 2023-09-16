import java.util.Scanner;
// it is use to import the Scanner in java.

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input form the user");
        Scanner sahil = new Scanner(System.in);   // System.in is use for keybord input.

        System.out.print("Enter the number 1: ");
        int a = sahil.nextInt();   // nextInt() is use to take the "integer" input form user.

        System.out.print("Enter the number 2: ");
        int b = sahil.nextInt();

        System.out.print("Enter the number 3: ");
        long c = sahil.nextLong();  // nextLong() is use for take the "long" input form user.

        System.out.print("Enter the number 4: ");
        double d = sahil.nextDouble(); // nextFloat() is use for take the "float" input form user.



//        int sum = a+b;
//        long sum = a+b+c;
        double sum = a+b+c+d;  // double is use because of one double is present in scanner.
        System.out.print("The sum of these three number are: " +sum);
//        System.out.println(sum); we can also get the like this
    }
}


