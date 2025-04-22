import java.util.Scanner;

public class numberofdaysswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Invalid month number");
        }

        scanner.close();
    }
}

