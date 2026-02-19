/**
 * OOPSBannerApp - Use Case 3
 * Refactoring code to be modular using functions for each character.
 * @author DELL
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        displayOOPS();
    }

    public static void displayOOPS() {
        // Calling modular functions
        drawO();
        drawO();
        drawP();
        drawS();
    }

    public static void drawO() {
        System.out.println("  *** ");
        System.out.println(" * * ");
        System.out.println(" * * ");
        System.out.println("  *** ");
        System.out.println(); // Space between letters
    }

    public static void drawP() {
        System.out.println(" **** ");
        System.out.println(" * * ");
        System.out.println(" **** ");
        System.out.println(" * ");
        System.out.println();
    }

    public static void drawS() {
        System.out.println("  **** ");
        System.out.println(" * ");
        System.out.println("  *** ");
        System.out.println("     * ");
        System.out.println(" **** ");
        System.out.println();
    }
}