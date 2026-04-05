public class EnhancedGreeting {
    public static void main(String[] args) {
        // UC5: Using an enhanced for-loop for clean iteration
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // "For each String 'name' in the array 'args'"
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}