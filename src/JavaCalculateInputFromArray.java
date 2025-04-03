import java.util.Scanner;

public class JavaCalculateInputFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Student: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];

        for(int i =0; i < numStudents; i++) {
            System.out.println("Enter score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        System.out.println("\nAll scores:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + scores[i]);
        }

        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        double average = (double) total / scores.length;
        System.out.println("Total score: " + total);
        System.out.println("Average score: " + average);
    }
}
