import java.util.Scanner;

public class JavaSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Start");
                break;
            case 2:
                System.out.println("Settings");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
