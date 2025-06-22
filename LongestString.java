public class LongestString {
    public static void main(String[] args) {
        String str = "Java is a powerful programming language";
        String[] words = str.split(" ");
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Longest word: " + longest);
    }
}



// public class LongestWord {
//     public static void main(String[] args) {
//         String sentence = "Java is a powerful programming language";
//         String word = "";
//         String longest = "";

//         for (int i = 0; i < sentence.length(); i++) {
//             char ch = sentence.charAt(i);

//             if (ch != ' ') {
//                 word = word + ch; // building word manually
//             } else {
//                 if (word.length() > longest.length()) {
//                     longest = word;
//                 }
//                 word = ""; // reset for next word
//             }
//         }

//         // Final check for the last word (if sentence doesn't end with space)
//         if (word.length() > longest.length()) {
//             longest = word;
//         }

//         System.out.println("Longest word: " + longest);
//     }
// }
