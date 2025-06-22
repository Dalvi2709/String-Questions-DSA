public class NumberPalindromeCheck {
    public static void main(String[] args) {
        int num = 1210;
        int  original = num;
        int revesed = 0;
        
        while (num != 0) {
            
            int digit = num % 10;
            revesed = revesed * 10 + digit;
            num = num / 10;

        }

         if (original == revesed) {
            System.out.println("palindrome");
         }else{
            System.out.println("not palindrome");
         }
    }
}
