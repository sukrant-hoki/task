import java.util.Scanner;

public class operationusingswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result = " + (num1 + num2)); break;
            case '-': System.out.println("Result = " + (num1 - num2)); break;
            case '*': System.out.println("Result = " + (num1 * num2)); break;
            case '/':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default: System.out.println("Invalid operator");
        }

        scanner.close();
    }
}

