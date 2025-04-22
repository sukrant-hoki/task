import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += scanner.nextInt();
        }

        double percentage = total / 5.0;
        char grade;

        if (percentage >= 90) grade = 'A';
        else if (percentage >= 80) grade = 'B';
        else if (percentage >= 70) grade = 'C';
        else if (percentage >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        scanner.close();
    }
}

