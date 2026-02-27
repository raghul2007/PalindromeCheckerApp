public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1 - Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println("----------------------------------");

        // UC2 - Hardcoded Palindrome
        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
// UC3 - Reverse String Based Palindrome
        System.out.println("\n--- UC3: Reverse String Check ---");

        String input3 = "level";
        String reversed = "";

        for (int i = input3.length() - 1; i >= 0; i--) {
            reversed += input3.charAt(i);
        }

        if (input3.equals(reversed)) {
            System.out.println(input3 + " is a Palindrome.");
        } else {
            System.out.println(input3 + " is NOT a Palindrome.");
        }
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}