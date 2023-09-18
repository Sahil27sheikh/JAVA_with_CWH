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


        // Enhance Switch method of switch.
        // in this method break class is not important.
        // -> is use after case.

        switch ("cricket") {
            case "cricket" -> System.out.println("you are going to become a cricketer!");
            // break is use to break the class. if you are not use break it execute all the cases after then include it.
            case "football" -> System.out.println("you are going to become a footballer!");
            case "Hockey" -> System.out.println("you are going to become a hockey champion!");
            default -> System.out.println("enjoy your life");
        }
        // Output: you are going to become a cricketer!


        // Another Example:
        System.out.println("Another Example:");
        switch ("football") {
            case "cricket" ->System.out.println("you are going to become a cricketer!");

            case "football" -> {
                    System.out.println("you are going to become a footballer!");
                    System.out.println("you are going to become a footballer!");
                    System.out.println("you are going to become a footballer!");
            }

            case "Hockey" -> System.out.println("you are going to become a hockey champion!");

            default -> System.out.println("enjoy your life");
        }
        // Output: you are going to become a cricketer!

    }
}
