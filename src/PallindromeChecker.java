public class PallindromeChecker {
    public static void main(String[] args) {
        String input = "madam";
        // Call recursive check starting from index 0 to last index
        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    private static boolean check(String s, int start, int end) {
        // Base case: all characters matched or pointers crossed
        if (start >= end) {
            return true;
        }
        // If characters mismatch, it's not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}