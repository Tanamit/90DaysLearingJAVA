import java.util.Scanner;

public class JavaSeatChartingWith2DimentionArray {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int rows = 7;
            int cols = 7;

            String[][] seats = new String[rows][cols];

            // ตั้งค่าที่นั่งเริ่มต้นเป็น "O" (ว่าง)
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    seats[i][j] = "O";
                }
            }

            boolean running = true;

            while (running) {
                // แสดงแผนผังที่นั่ง
                System.out.println("\nSeating Chart:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(seats[i][j] + " ");
                    }
                    System.out.println();
                }

                // รับ input
                System.out.print("\nEnter row (1-7) to reserve (0 to exit): ");
                int row = scanner.nextInt();
                if (row == 0) break;

                System.out.print("Enter column (1-7) to reserve: ");
                int col = scanner.nextInt();

                // ตรวจสอบว่าจองได้ไหม
                if (row < 1 || row > rows || col < 1 || col > cols) {
                    System.out.println("❌ Invalid seat number.");
                } else if (seats[row - 1][col - 1].equals("X")) {
                    System.out.println("❌ This seat is already taken.");
                } else {
                    seats[row - 1][col - 1] = "X";
                    System.out.println("✅ Seat reserved successfully.");
                }
            }

            System.out.println("\n📌 Final Seating Chart:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Thank you!");
        }
    }


