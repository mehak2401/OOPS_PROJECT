public class SubstringGreeting {
    public static void main(String[] args) {
        // UC6: Using substring to clean up delimiters
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder namesList = new StringBuilder();
            
            // Collect names with a comma and space
            for (String name : args) {
                namesList.append(name).append(", ");
            }

            // Remove the last two characters (the trailing ", ")
            // We go from index 0 to (length - 2)
            String finalNames = namesList.substring(0, namesList.length() - 2);

            System.out.println("Hello, " + finalNames + "!");
        }
    }
}