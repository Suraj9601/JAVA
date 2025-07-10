import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sum of Two numbers ");

        System.out.print("Enter First number : ");
        float num1 = input.nextFloat();

        System.out.print("Enter Second number : ");;
        float num2  = input.nextFloat();

        float Sum = num1 + num2;
        System.out.println("You entered two numbers Sum is " + Sum );
    }
}
