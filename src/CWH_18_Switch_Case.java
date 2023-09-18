import java.util.Scanner;
public class CWH_18_Switch_Case {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt(); // you can use any data type in this.

        switch (age){
            case 18:
                System.out.println("you are going to become a adult!");
                break; // break is use to break the class. if you are not use break it execute all the cases after then include it.
            case 23:
                System.out.println("you are going to join a job!");
                break;
            case 60:
                System.out.println("you are going to get retired!");
                break;
            default:
                System.out.println("enjoy your life");
        }

    }
}
