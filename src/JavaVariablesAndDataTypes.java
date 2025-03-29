import java.util.Scanner;

public class JavaVariablesAndDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        if(isAdult(age)) {
            System.out.println("You're over 18 years old.");
        }
    }

    public static boolean isAdult(int age) {
        return age > 18;
    }
}


