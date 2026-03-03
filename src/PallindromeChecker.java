public class PallindromeChecker {
    public static void main(String[] args) {
        // Declare and initialize the input string.
        String input = "radar";

        // Convert the string into a character array.
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning.
        int start = 0;

        // Initialize pointer at the end.
        int end = chars.length - 1;

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Continue comparison until pointers cross.
        while (start < end) {
            // Check if characters at current pointers are different
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Optimization: stop checking if a mismatch is found
            }

            // Move pointers towards the center
            start++;
            end--;
        }

        // Print the results as shown in the requirement
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}