import java.util.Random;
import java.util.Scanner;

public class CWH_20_Ex2_RockPaperScissorGame {
    public static void main(String[] args) {

        // Create the game of Rock, Paper, Scissor

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("0 = Rock, 1 = Paper and 2 = Scissor");

        // User input
        System.out.print("Enter your choice (0 = Rock, 1 = Paper, or 2 = Scissors): ");
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

        else {
            System.out.println("Sorry, You lose! Better Luck Next Time");
        }



    }
}
