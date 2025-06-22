public class NumberPalindromeCheckUsingCharArray {
    public static void main(String[] args) {
        int num = 121;
        String str = Integer.toString(num);
        char arr [] = str.toCharArray();

        boolean isPalindrome = true;


        // Loop through the string from both ends
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
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
