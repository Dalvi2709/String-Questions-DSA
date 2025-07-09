import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        Arrays.sort(arr);
        
        String first = arr[0];
        String last = arr[arr.length - 1];
        int i = 0;

        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i))
            i++;

        System.out.println(first.substring(0, i));
    }
}

