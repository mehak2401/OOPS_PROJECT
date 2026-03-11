public class OOPSBannerApp {

    // UC7: Static Inner Class for Encapsulation
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getRow(int rowIndex) {
            // Using padding logic from UC6 to keep alignment perfect
            return String.format("%-12s", pattern[rowIndex]);
        }
    }

    public static void main(String[] args) {
        // Initialize our "Database" of character patterns
        CharacterPattern charO = new CharacterPattern('O', new String[]{
            "  *** ", " *   * ", " *   * ", " *   * ", " *   * ", " *   * ", "  *** "
        });

        CharacterPattern charP = new CharacterPattern('P', new String[]{
            " **** ", " *  * ", " *  * ", " **** ", " * ", " * ", " * "
        });

        CharacterPattern charS = new CharacterPattern('S', new String[]{
            "  **** ", " * ", " * ", "  *** ", "     *", "     *", " **** "
        });

        // Use a StringBuilder for efficient string manipulation
        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            String gap = "  ";
            
            sb.append(charO.getRow(i)).append(gap);
            sb.append(charO.getRow(i)).append(gap);
            sb.append(charP.getRow(i)).append(gap);
            sb.append(charS.getRow(i));

            System.out.println(sb.toString());
        }
    }
}