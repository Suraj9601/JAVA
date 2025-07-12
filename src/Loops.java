import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Q : Print numbers 1 to 10

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }

        // Q : print number 1 to n

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
