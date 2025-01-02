import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name:");
        String name = scanner.nextLine();

        // Using a StringBuilder to store the initials
        StringBuilder initials = new StringBuilder();

        // Splitting the name into words and processing each word
        String[] words = name.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(Character.toUpperCase(word.charAt(0))).append(".");
            }
        }

        // Printing the initials
        System.out.println("PrintInitials: " + initials.toString().trim());
        scanner.close();
    }
}
