import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;


        System.out.println("Enter your first number: ");
        num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter your operator(+,-,*,/,^): ");
        operator = scanner.nextLine().charAt(0);

        System.out.println("Enter your second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not possible");
                    return;
                }

            }
            case '^' -> {
                result = Math.pow(num1, num2);
                return;
            }
            default -> System.out.println("Enter a valid operator");
        }
        System.out.println(result);
        scanner.close();
    }
}
