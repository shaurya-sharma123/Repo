import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rounds: ");
        int n = sc.nextInt();
        Random r = new Random();

        int win = 0, loss = 0, draws = 0;

        String[] choices = {"Rock", "Paper", "Scissor"};

        for (int i = 1; i <= n; i++) {
            String moveComp = choices[r.nextInt(3)].toLowerCase();
            System.out.println("Enter your choice: ");

            sc.nextLine();
            String userChoice = sc.nextLine().toLowerCase();

            if (userChoice.equals(moveComp)) {
                draws++;
                System.out.println("Draw");
            }

            else if (
                (moveComp.equals("rock") && userChoice.equals("scissor")) ||
                (moveComp.equals("scissor") && userChoice.equals("paper")) ||
                (userChoice.equals("rock") && moveComp.equals("paper"))
            ) {
                loss++;
                System.out.println("You lose");
            }

            else {
                win++;
                System.out.println("You win");
            }

        } 

        System.out.println("--- FINAL SUMMARY TABLE ---");

        System.out.println("Win: " + win);
        System.out.println("Loses: " + loss);
        System.out.println("Draws: " + draws);
    }
}