public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Combining declaration and initialization for cleaner code
        String[] banner = {
            String.join("", "  ***", " ", "*** ", "**** ", "**** "),
            String.join("", " *", "   *", " *", "   *", " *", "    *"),
            String.join("", " *", "   *", " *", "   *", " *", "    *"),
            String.join("", " *", "   *", " *", "   *", "**** ", "**** "),
            String.join("", " *", "   *", " *", "   *", " *", "     "),
            String.join("", " *", "   *", " *", "   *", " *", "     "),
            String.join("", "  ***", " ", "*** ", "*", "    **** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
