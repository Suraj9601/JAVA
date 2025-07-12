import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        // Q : Take input of 2 numbers and print sum

        Scanner input = new Scanner(System.in);
        int num1,num2,sum;

        System.out.print("Enter the First number : ");
         num1 = input.nextInt();

        System.out.print("Enter Second number : ");
         num2 = input.nextInt();

         sum = num1 + num2;

        System.out.println(sum);
    }
}
