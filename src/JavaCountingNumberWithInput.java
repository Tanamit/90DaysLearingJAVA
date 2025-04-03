import java.util.Scanner;

public class JavaCountingNumberWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.println("\nUsing for loop:");
        for (int i = 1; i <= number; i++) {
            System.out.println("Number " + i);
        }

        System.out.println("\nUsing while loop:");
        int i = 1;
        while (i <= number) {
            System.out.println("Number" + i);
            i++;
        }

        System.out.println("\nUsing do-while loop:");
        int j = 1;
        do {
            System.out.println("Number " + j);
            j++;
        } while (j <= number);

    }
}
