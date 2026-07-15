import java.util.Scanner;
import java.util.Random;

public class numGuessGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int min;
        int max;

        System.out.println("Enter the lower limit for your guessing range: ");
        min = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the upper limit for your guessing range: ");
        max= scanner.nextInt();

        int randomNumber = random.nextInt(min, max+1);
        int guess;
        int attempts = 0;
        System.out.println("Number Guessing Game!!");
        System.out.printf("You are guessing a number between %d - %d\n", min, max);

        do{
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again!");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again!");
            }
            else if(guess == randomNumber){
                System.out.println("CORRECT!!!!");
                System.out.printf("The number of attempts you took are: %d\n", attempts);
            }
        }while(guess != randomNumber);
        scanner.close();
    }
}
