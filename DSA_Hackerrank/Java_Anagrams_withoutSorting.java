import java.util.Scanner;

public class Java_Anagrams_withoutSorting {
    static boolean isAnagram(String a, String b) {
         // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths differ, they're not anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Create an array to count character frequencies
        int[] count = new int[26]; // For 'a' to 'z'

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++; // Increment for a
            count[b.charAt(i) - 'a']--; // Decrement for b
        }

        // If all counts are zero, they are anagrams
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}