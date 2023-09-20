import java.util.Random;
import java.util.Scanner;

public class CWH_20_Ex2_RockPaperScissorGame {
    public static void main(String[] args) {

        // Create the game of Rock, Paper, Scissor

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Rules: \n\tRock = 0, Paper = 1 and Scissor = 2");

        // User input
        System.out.print("Enter your choice: ");
        int userInput = sc.nextInt();

        // Computer input
        int comInput = r.nextInt(3);

        // conditions
        if (userInput == comInput){
            System.out.println("The Match Is Tie!");

        }

        else if (userInput==0 && comInput==2 || userInput==1 && comInput==0 || userInput==2 && comInput==1) {
            System.out.println("Congratulation You Won");
        }

        else if (userInput<0 || userInput>2) {
            System.out.println("You Have Entered Wrong Number");
        }

        else {
            System.out.println("Sorry, You lose! Better Luck Next Time");
        }

        switch (userInput){
            case 0 -> System.out.println("Your Choice Is: \"Rock\"");
            case 1 -> System.out.println("Your Choice Is: \"Paper\"");
            case 2 -> System.out.println("Your Choice Is: \"Scissor\"");
        }

        switch (comInput){
            case 0 -> System.out.println("Computer Choice Is: \"Rock\"");
            case 1 -> System.out.println("Computer Choice Is: \"Paper\"");
            case 2 -> System.out.println("Computer Choice Is: \"Scissor\"");
        }
        System.out.print("Thank You For Playing \nPlay Again...");



    }
}
