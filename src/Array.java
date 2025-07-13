
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Array Syntax
        // datatype[] variable_name = new datatype[size];

        Scanner input = new Scanner(System.in);
        // integer array
        int[] arr = new int[5];
        System.out.println("Enter Five Integer : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // String Array
        System.out.println("Enter Five String : ");
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
