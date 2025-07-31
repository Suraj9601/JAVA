import java.util.Scanner;
public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] rooms = new boolean[3][5]; // 3 floors, 5 rooms each
        int choice;
        do {
            System.out.println("\n--- Hotel Room Booking System ---");
            System.out.println("1. View Available and Booked Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < rooms.length; i++) {
                        System.out.print("Floor " + (i + 1) + ": ");
                        for (int j = 0; j < rooms[i].length; j++) {
                            if (rooms[i][j]) {
                                System.out.print("[Booked] ");
                            } else {
                                System.out.print("[Available] ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter floor number (1-3): ");
                    int floor = sc.nextInt();
                    System.out.print("Enter room number (1-5): ");
                    int room = sc.nextInt();
                    if (floor < 1 || floor > 3 || room < 1 || room > 5) {
                        System.out.println("Invalid floor or room number.");
                    } else if (rooms[floor - 1][room - 1]) {
                        System.out.println("Room is already booked.");
                    } else {
                        rooms[floor - 1][room - 1] = true;
                        System.out.println("Room booked successfully!");
                    }
                    break;
                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
        sc.close();
    }
}
