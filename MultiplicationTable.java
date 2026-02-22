import java.util.Scanner;

/**
 * Program: MultiplicationTable
 * Level 3 Practice - Loops
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to see its multiplication table: ");
        int num = input.nextInt();

        System.out.println("Table of " + num + ":");
        // Using a for loop to iterate from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
        }
        input.close();
    }
}
