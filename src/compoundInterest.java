import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.println("Enter the principle amount:");
        principle = scanner.nextDouble();

        System.out.println("Enter the rate of interest(in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter the no.s of times compounded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.println("Enter the no of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow((1 + (rate/timeCompounded)), timeCompounded * years);

        System.out.printf("The amount after %d years is: $%.2f", years, amount);

    }
}
