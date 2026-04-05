public class JoinGreeting {
    public static void main(String[] args) {
        // UC7: Using String.join for efficient concatenation
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all elements of args with a comma and a space
            String names = String.join(", ", args);
            
            System.out.println("Hello, " + names + "!");
        }
    }
}