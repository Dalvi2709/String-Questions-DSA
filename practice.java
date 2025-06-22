import java.util.HashMap;
import java.util.Map;

public class practice {
    public static void main(String[] args) {
       
     String str = "java is easy java is super";
     String words [] = str.split(" ");
     Map<String,Integer> map = new HashMap<>();
     
     for (String word : words) {
          map.put(word, map.getOrDefault(word, 0)+1);
          
     }
     
     for (String word : map.keySet()) {
        System.out.print(word +":"+ map.get(word)+" ");
     }
    }
}
