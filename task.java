 import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPerfect = false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfect = true;
                break;
            }
        }

        if (isPerfect)
            System.out.println("Perfect square");
        else
            System.out.println("Not a perfect square");

        scanner.close();
    }
}

