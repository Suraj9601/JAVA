import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        String msg = greet();
        System.out.println(msg);
        int ans = Sum();
        System.out.println(ans);
        int ans2 = Sum2(10,20);
        System.out.println(ans2);
    }
    // return the value
    static int Sum() {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter the First number: ");
        num1 = input.nextInt();

        System.out.print("Enter the Second number: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        return sum;
    }

    static int Sum2(int a,int b) {
        int sum = a + b;
        return sum;
    }

    static String greet() {
        String greeting = "How are you";
        return greeting;
    }
}
