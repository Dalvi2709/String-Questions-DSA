public class reverseSentence{
    public static void main(String[] args) {
        String str = "java is programming language";
        String cw = "";
        String rev = "";

        // Loop from the end of the sentence to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            char currentChar = str.charAt(i);

            if (currentChar != ' ') {
                // Add character to the front of the current word
                cw = currentChar + cw;
            } else {
                // Add the completed word to the reversed sentence
                rev += cw + " ";
                cw = ""; // Reset the current word
            }
        }

        // Add the last word (since there may not be a space after it)
        rev += cw;

        System.out.println(rev);
    }
}


// public class practice {
//     public static void main(String[] args) {
//         String str = "i love java";
//        String [] words = str.split(" ");
//         for (int i = words.length-1; i >= 0; i--) {
//             System.out.print(words[i].trim() + " ");
//         }
//     }
// }