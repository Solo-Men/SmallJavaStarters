import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args){
        double temp;
        char unit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temp: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the unit(C/F): ");
        unit = scanner.nextLine().charAt(0);

        double newTemp = (unit == 'C' || unit == 'c') ? (temp * 9/5) + 32 : (temp - 32) * 5/9;

        System.out.printf("The temperature is: %.1f %s", newTemp, unit);

        scanner.close();
    }
}
