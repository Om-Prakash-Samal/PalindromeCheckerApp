public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hard-coded string
        String original = "madam";

        // Remove spaces and convert to lowercase (for safety)
        String cleaned = original.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Check palindrome
        if (cleaned.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}