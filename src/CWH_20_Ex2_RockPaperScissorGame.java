import java.util.Random;
import java.util.Scanner;

public class CWH_20_Ex2_RockPaperScissorGame {
    public static void main(String[] args) {

        // Create the game of Rock, Paper, Scissor

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("r = Rock, p = Paper and s = Scissor");

        // User input
        System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
        String userInput = sc.nextLine().toLowerCase();

        // Computer input
        int comInput = r.nextInt(3);
        String compInput = "";


    }
}
