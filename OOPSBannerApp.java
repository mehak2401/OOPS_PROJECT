public class OOPSBannerApp {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(getRow(i));
        }
    }

    public static String getRow(int index) {
        // We use a small gap because the padding below handles the heavy lifting
        String gap = "  "; 
        return pad(getO()[index]) + gap + 
               pad(getO()[index]) + gap + 
               pad(getP()[index]) + gap + 
               pad(getS()[index]);
    }

    // Forces every letter to be 15 characters wide.
    // This creates a huge "buffer" of empty space on the right of every letter.
    public static String pad(String s) {
        return String.format("%-15s", s);
    }

    public static String[] getO() {
        return new String[]{"  *** ", " *   * ", " *   * ", " *   * ", " *   * ", " *   * ", "  *** "};
    }

    public static String[] getP() {
        return new String[]{" ***** ", " *   *", " *   *", " ***** ", " * ", " * ", " * "};
    }

    public static String[] getS() {
        return new String[]{"  **** ", " * ", " * ", "  *** ", "     * ", "     * ", " **** "};
    }
}