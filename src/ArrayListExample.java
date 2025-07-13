import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax :
        // ArrayList<wrapper_class> variable-name = new ArrayList<>(initialCapacity);
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner input = new Scanner(System.in);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
