import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args){
        //WEIGHT CONVERTER

        //Declare variables
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        //welcome message
        System.out.println("Welcome to weight conversion program");
        System.out.println("1: kgs to lbs");
        System.out.println("2: lbs to kgs");
        //prompt for user choice
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();

        System.out.println("Enter your weight: ");
        weight = scanner.nextDouble();

        if(choice == 1){
            // option 1 is to convert kgs to lbs
            newWeight = weight * 2.20462;
            System.out.printf("Your weight in lbs is: %.2f lbs\n", newWeight);
        }
        else if(choice == 2){
            // option 2 is to convert lbs to kgs
            newWeight = weight/2.20462;
            System.out.printf("Your weight in kgs is: %.2f kgs\n", newWeight);
        }
        else{
            //else print not a valid choice
            System.out.println("Not a valid choice");
        }

        scanner.close();

    }
}
