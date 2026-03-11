import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Centralized Map to store character patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // Initialize the "database" of patterns
        patternMap.put('O', new String[]{"  *** ", " *   * ", " *   * ", " *   * ", " *   * ", " *   * ", "  *** "});
        patternMap.put('P', new String[]{" ***** ", " *   * ", " *   * ", " ***** ", " * ", " * ", " * "});
        patternMap.put('S', new String[]{"  **** ", " * ", " * ", "  *** ", "     *", "     *", " **** "});
    }

    public static void main(String[] args) {
        String word = "OOPS";
        renderBanner(word);
    }

    public static void renderBanner(String word) {
        // We iterate 7 times (once for each row of the ASCII art)
        for (int row = 0; row < 7; row++) {
            StringBuilder lineResult = new StringBuilder();
            
            // Loop through each character in the input word
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                
                if (pattern != null) {
                    // Use padding to ensure perfect horizontal alignment
                    lineResult.append(String.format("%-15s", pattern[row]));
                }
            }
            // Print the fully assembled row
            System.out.println(lineResult.toString());
        }
    }
}