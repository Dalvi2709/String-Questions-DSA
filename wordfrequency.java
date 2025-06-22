import java.util.*;
public class wordfrequency{
    public static void main(String [] args){
        String str = "java is a programming language and java is fun";
        String [] words = str.split(" ");
        
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        } 
    }
}
