import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheitValue;
        double celsiusResult;
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheitValue = input.nextDouble();
        celsiusResult = (fahrenheitValue - 32.0) * (5.0 / 9.0);
        System.out.println(fahrenheitValue + " F is " + celsiusResult + " C.");
        input.close();
    }
}
