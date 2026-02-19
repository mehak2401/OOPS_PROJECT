/**
 * OOPSBannerApp - Use Case 4
 * Defining a separate class to store character patterns.
 * @author DELL
 * @version 4.0
 */

// This class acts as a template for our banner data
class BannerPattern {
    public static void drawO() {
        System.out.println("  *** \n * * \n * * \n  *** ");
    }

    public static void drawP() {
        System.out.println(" **** \n * * \n **** \n * ");
    }

    public static void drawS() {
        System.out.println("  **** \n * \n  *** \n     * \n **** ");
    }
}

public class OOPSBannerApp {
    public static void main(String[] args) {
        // Now we call the methods from the BannerPattern class
        BannerPattern.drawO();
        BannerPattern.drawO();
        BannerPattern.drawP();
        BannerPattern.drawS();
    }
}