public class Palindrome {
    public static void main(String[] args) {
        
        String str = "madam";  // You can change this string to test other words
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