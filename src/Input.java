import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your full name : ");
        String name = input.nextLine();
        System.out.print("Please Enter your roll no : ");
        int rollNo = input.nextInt();
        System.out.print("Please Enter your marks : ");
        float marks = input.nextFloat();
        System.out.println("Your name is " + name);
        System.out.println("Your roll number is " + rollNo);
        System.out.println("Your marks is " + marks);
    }
}
