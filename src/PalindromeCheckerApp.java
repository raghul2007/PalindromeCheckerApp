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
        // UC4 - Character Array Based
        System.out.println("\n--- UC4: Char Array Check ---");

        String input4 = "radar";
        char[] chars = input4.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome4 = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome4 = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input: " + input4);
        System.out.println("Is Palindrome? " + isPalindrome4);
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
