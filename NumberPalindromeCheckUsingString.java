public class NumberPalindromeCheckUsingString {
    public static void main(String[] args) {
        int num = 121;
        String str = String.valueOf(num);
        boolean isPalindrome = true;
           
        System.out.println(str.length());

        // Loop through the string from both ends
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;  // If characters don't match, it's not a palindrome
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}