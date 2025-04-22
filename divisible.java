import java.util.Scanner;
public class divisible{
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by both 5 and 11
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11.");
        } else {
            System.out.println(number + " is NOT divisible by both 5 and 11.");
        }

        // Close the scanner
        scanner.close();
    }
}
