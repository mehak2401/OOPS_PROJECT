public class DisplayMultipleNames {
    public static void main(String[] args) {
        // Check if the array of arguments is empty
        if (args.length == 0) {
            // Default behavior from UC3
            System.out.println("Hello World");
        } else {
            // UC4: Loop through all provided names
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        }
    }
}