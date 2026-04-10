public class checkPalindromeString {
    boolean checkPalindromeString(String input) {
 boolean result = true;
 int length = input.length();

 for (int i = 0; i < length/2; i++) {
  if (input.charAt(i) != input.charAt(length - i - 1)) {
   result = false;
   break;
  }
 }

 return result;
}

    public static void main(String args[]) {
        checkPalindromeString obj = new checkPalindromeString();
        String input = "madam";
        boolean isPalindrome = obj.checkPalindromeString(input);
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
