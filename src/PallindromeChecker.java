import java.util.Stack;

public class PallindromeChecker {
    public static void main(String[] args) {
        // Declare and initialize the input string.
        String input = "noon";

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string.
        for (char c : input.toCharArray()) {
            // Pop from stack to get characters in reverse order
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display the output as required
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}