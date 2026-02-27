import java.util.Stack;
import java.util.*;
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
        // UC5 - Stack Based
        System.out.println("\n--- UC5: Stack Check ---");

        String input5 = "noon";
        Stack<Character> stack = new Stack<>();

        for (char c : input5.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome5 = true;

        for (char c : input5.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome5 = false;
                break;
            }
        }

        System.out.println("Input: " + input5);
        System.out.println("Is Palindrome? " + isPalindrome5);
        // UC6 - Queue + Stack
        System.out.println("\n--- UC6: Queue + Stack Check ---");

        String input6 = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack6 = new Stack<>();

        for (char c : input6.toCharArray()) {
            queue.add(c);
            stack6.push(c);
        }

        boolean isPalindrome6 = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack6.pop())) {
                isPalindrome6 = false;
                break;
            }
        }

        System.out.println("Input: " + input6);
        System.out.println("Is Palindrome? " + isPalindrome6);
        // UC7 - Deque Based
        System.out.println("\n--- UC7: Deque Optimized Check ---");

        String input7 = "refer";
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input7.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome7 = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome7 = false;
                break;
            }
        }

        System.out.println("Input: " + input7);
        System.out.println("Is Palindrome? " + isPalindrome7);
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
