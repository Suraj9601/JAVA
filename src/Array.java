
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Array Syntax
        // datatype[] variable_name = new datatype[size];

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

    }
}
