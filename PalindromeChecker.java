public class PalindromeChecker {

    static boolean checkPalindromeString(String input) {
        if (input == null) {
            return false; // handle null input safely
        }

        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false; // directly return false instead of using 'result'
            }
        }
        return true; // if no mismatches, it's a palindrome
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(checkPalindromeString("madam"));   // true
        System.out.println(checkPalindromeString("hello"));   // false
    }
}
