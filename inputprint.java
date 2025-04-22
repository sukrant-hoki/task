import java.util.Scanner;
public class inputprint {
    public static void main(String[]args){
        Scanner op = new Scanner(System.in);
        System.out.print("enter first number");
        int first=op.nextInt();
        System.out.print("Enter second number");
        int second= op.nextInt();
        System.out.println("the sum of two numbers are:"+(first+second));
        System.out.println("the difference of two numbers are:"+(first-second));
        System.out.println("the product of two numbers are"+(first*second));
        System.out.println("the quotient of two numbers are"+(first%second));




    }
    
}

