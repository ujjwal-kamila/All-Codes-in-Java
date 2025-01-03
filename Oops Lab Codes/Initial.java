
import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their full name
        System.out.println("Enter Your Full Name: ");
        String name = scanner.nextLine();
        
        // Convert the name to uppercase for uniformity
        name = name.toUpperCase();
        
        // Close the scanner as it is no longer needed
        scanner.close();
        
        // Display the initials
        System.out.println("Initials: " + getInitials(name));
    }

    // Method to extract initials from the given name
    public static String getInitials(String name) {
        // Split the name into an array of words
        String[] words = name.split("\\s+");
        
        // Use StringBuilder for efficient string manipulation
        StringBuilder initials = new StringBuilder();
        
        // Iterate through each word in the array
        for (int i = 0; i < words.length; i++) {
            // Append the first character of each word
            initials.append(words[i].charAt(0));
            
            // Add a dot after each initial except the last one
            if (i < words.length - 1) {
                initials.append(".");
            }
        }        
        // Return the initials as a string
        return initials.toString();
    }
}





/*
   public static String getInitials(String name){
    String[] words=name.split("\\s+");
    StringBuilder initials = new StringBuilder();
    for(String word:words){
    initials.append(word.charAt(0)).append(".");
    }
    return initials.toString().trim();
   }
  }
 */