import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age >= 18)
            System.out.println("Eligible to vote.");
        else
            System.out.println("Not eligible to vote.");

        scanner.close();
    }
}
