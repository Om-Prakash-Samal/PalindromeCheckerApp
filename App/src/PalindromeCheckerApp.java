/**
 * MAIN CLASS: UseCase3PalindromeCheckerApp
 *
 * Use Case 3: Reverse String Based Palindrome Check
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.6
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hard-coded input string
        String input = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Display original and reversed string
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }
    }
}