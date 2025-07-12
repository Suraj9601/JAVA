/*
           Syntax :

           access modifier return_type name () {
               //body
               return statement;
           }
*/

import java.util.Scanner;

public class Method {

    // Define the method outside main
     static void Sum() {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter the First number: ");
        num1 = input.nextInt();

        System.out.print("Enter the Second number: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.println("Sum is " + sum);
    }

    public static void main(String[] args) {
        // Call the method here
        Sum();
    }
}


