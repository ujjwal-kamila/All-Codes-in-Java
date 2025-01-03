// Java String Program to Check if a String is a Palindrome
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string to check whether it is a palindrome or not: ");
        String input = scanner.nextLine();
        
        // Check if the input string is a palindrome and display the result
        if (isPalindrome(input)) {
            System.out.println("Input String: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Input String: \"" + input + "\" is Not a Palindrome.");
        }
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to ensure case-insensitive comparison
        str = str.toLowerCase();
        
        // Initialize two pointers, one at the beginning and one at the end of the string
        int left = 0;
        int right = str.length() - 1;
        
        // Loop through the string to compare characters from both ends
        while (left < right) {
            // If characters do not match, the string is not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            
            // Move the pointers towards the center
            left++;
            right--;
        }
        
        return true;
    }
}
