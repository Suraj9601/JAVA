import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        // Print Matrix
        Scanner input = new Scanner(System.in);


        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        System.out.print("Enter matrix element : ");

        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        // output
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
    }
}
