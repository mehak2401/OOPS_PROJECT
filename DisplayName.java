public class DisplayName {
    public static void main(String[] args) {
        // Check if the user provided at least one argument
        if (args.length > 0) {
            // Access the first argument (index 0)
            String name = args[0];
            System.out.println("Hello " + name);
        } else {
            // Error message if no name is provided
            System.err.println("Error: Please provide a name as a command-line argument.");
            System.exit(1);
        }
    }
}