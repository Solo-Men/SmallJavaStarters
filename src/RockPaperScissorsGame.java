import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        //ROCK PAPER SCISSORS GAME

        //DECLARE VARIABLES
        String again = "yes";
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors Game!");
        String[] choices = {"rock", "paper", "scissors"};
        String choiceUser;
        String choiceComp;

        do {
            //GET CHOICE FROM THE USER
            System.out.println("Enter your choice(rock, paper, scissors): ");
            choiceUser = scanner.nextLine().toLowerCase();

            if (!choiceUser.equals("rock") && !choiceUser.equals("paper") && !choiceUser.equals("scissors")) {
                System.out.println("Invalid choice!");
                continue;
            }

            //GET RANDOM CHOICE FOR THE COMPUTER
            choiceComp = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + choiceComp);

            //CHECK WIN CONDITIONS
            if (choiceUser.equals(choiceComp)) {
                System.out.println("Its a tie!");
            } else if ((choiceUser.equals("rock") && choiceComp.equals("scissors")) ||
                    (choiceUser.equals("paper") && choiceComp.equals("rock")) ||
                    (choiceUser.equals("scissors") && choiceComp.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            //ASK TO PLAY AGAIN
            System.out.println("Do you want to go again?(yes/no)");
            again = scanner.nextLine().toLowerCase();
        }while(again.equals("yes"));
        //GOODBYE MESSAGE
        System.out.println("BYE BYE!");
        scanner.close();
    }
}
