import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp - Use Case 5
 * Using a Map to store patterns and a function to display the banner.
 * @author DELL
 * @version 5.0
 */
public class OOPSBannerApp {

    // A Map to store our character patterns
    private static final Map<Character, String> patterns = new HashMap<>();

    static {
        // Initialize the patterns
        patterns.put('O', "  *** \n * * \n * * \n  *** ");
        patterns.put('P', " **** \n * * \n **** \n * ");
        patterns.put('S', "  **** \n * \n  *** \n     * \n **** ");
    }

    public static void main(String[] args) {
        String word = "OOPS";
        displayBanner(word);
    }

    /**
     * Logic to look up patterns and display them
     */
    public static void displayBanner(String input) {
        for (char c : input.toUpperCase().toCharArray()) {
            if (patterns.containsKey(c)) {
                System.out.println(patterns.get(c));
                System.out.println(); // Space between letters
            }
        }
    }
}