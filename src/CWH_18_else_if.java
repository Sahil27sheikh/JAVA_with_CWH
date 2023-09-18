import java.util.Scanner;
public class CWH_18_else_if {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        if (age>56){
            System.out.println("you are experienced!");
        } else if (age>46){
            System.out.println("You are semi-experienced!");
        } else if (age>36) {
            System.out.println("You are semi-semi Experience!");
        }
        else {
            System.out.println("you are not experienced!");
        }
    }
}
