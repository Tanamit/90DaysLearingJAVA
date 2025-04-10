import java.util.Scanner;

public class JavaGradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        char grade;

        if(score >= 90){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);

        switch (grade) {
            case 'A':
                System.out.println("Magnificent");
                break;
            case 'B':
                System.out.println("Well done");
                break;
            case 'C':
                System.out.println("Not bad");
                break;
            case 'D':
                System.out.println("Keep going");
                break;
            default:
                System.out.println("Need more improvement");
        }
    }
}
