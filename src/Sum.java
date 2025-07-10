import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sum of Two numbers ");
        System.out.print("Enter First number : ");
        int a = input.nextInt();
        System.out.print("Enter Second number : ");;
        int b = input.nextInt();
        int Sum = a + b;
        System.out.println("You entered two numbers Sum is " + Sum );
    }
}
