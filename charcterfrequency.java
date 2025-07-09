// public class charcterfrequency {
//     public static void main(String[] args) {
//         String str = "java";
//         int[] freq = new int[256]; // ASCII character range
//         // Count frequency of each character
//         for (int i = 0; i < str.length(); i++) {
//             freq[str.charAt(i)]++;
//         }
//         // Print the frequency of each character
//         for (int i = 0; i < 256; i++) {
//             if (freq[i] > 0) {
//                 System.out.println((char) i + " : " + freq[i]);
//             }
//         }
//     }
// }


import java.util.*;

public class charcterfrequency {
    public static void main(String[] args) {
        String str = "hello";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        System.out.println(map);
    }
}
