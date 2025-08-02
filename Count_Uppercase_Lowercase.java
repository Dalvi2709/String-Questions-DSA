public class Count_Uppercase_Lowercase {
    public static void main(String [] args){
        String  str = "Roshan Ramchandra Dalvi";
        int Count_Uppercase = 0;
        int Count_Lowercase = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch<=90) {

            Count_Uppercase++;
            }else if (ch >= 97 && ch<=122){
                Count_Lowercase++;
            }
        
        }

        System.out.println(Count_Uppercase);
        System.out.println(Count_Lowercase);
    }
}
