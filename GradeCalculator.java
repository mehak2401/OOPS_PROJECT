import java.util.Scanner;

/**
 * Program: GradeCalculator
 * Level 2 Practice
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your numerical score (0-100): ");
        double testScore = input.nextDouble();

        if (testScore >= 90) {
            System.out.println("Grade: A");
        } else if (testScore >= 80) {
            System.out.println("Grade: B");
        } else if (testScore >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        input.close();
    }
}
