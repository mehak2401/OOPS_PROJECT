public class DisplayNameDefault {
    public static void main(String[] args) {
        String name;

        // Check if an argument was provided
        if (args.length > 0) {
            // Use the first argument provided by the user
            name = args[0];
        } else {
            // Fallback to "World" if args is empty
            name = "World";
        }

        System.out.println("Hello " + name);
    }
}