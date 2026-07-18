import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class diceRoller {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
         int roll;
         int numOfDice;
         int total = 0;

        System.out.println("Enter the number of dice you wanna roll: ");
        numOfDice = scanner.nextInt();

         for(int i =  0; i < numOfDice; i++){
             roll = random.nextInt(1, 7);
             System.out.println("You rolled: " + roll);
             printDie(roll);
             total += roll;
         }
        System.out.println("Total: " + total);
    }

    static void printDie(int roll){
         String Die1 = """
                  -------
                 |       |
                 |   ●   |
                 |       |
                  -------
                 """;
         String Die2 = """
                  -------
                 | ●     |
                 |       |
                 |     ● |
                  -------
                 """;
         String Die3 = """
                  -------
                 | ●     |
                 |   ●   |
                 |     ● |
                  -------
                 """;
         String Die4 = """
                  -------
                 | ●   ● |
                 |       |
                 | ●   ● |
                  -------
                 """;
         String Die5 = """
                  -------
                 | ●   ● |
                 |   ●   |
                 | ●   ● |
                  -------
                 """;
         String Die6 = """
                  -------
                 | ●   ● |
                 | ●   ● |
                 | ●   ● |
                  -------
                 """;

         switch(roll){
             case 1 -> System.out.println(Die1);
             case 2 -> System.out.println(Die2);
             case 3 -> System.out.println(Die3);
             case 4 -> System.out.println(Die4);
             case 5 -> System.out.println(Die5);
             case 6 -> System.out.println(Die6);
         }
    }
}
