public class AllMethods {
    public static void main(String[] args) {
       
                String name = "Roshan Dalvi ";
                int len = name.length();
                System.out.println(len);
                System.out.println(name.toLowerCase());
                System.out.println(name.toUpperCase());
                System.out.println(name.trim());
                System.out.println(name.replace('o','m'));
                System.out.println(name.startsWith("R"));
                System.out.println(name.endsWith("R"));
                System.out.println(name.charAt(4));
                System.out.println(name.indexOf('a'));
                System.out.println(name.equals("Roshan Dalvi "));
                

                String arr [] = name.split(" ");
                for(int i = 0; i< arr.length; i++){
                  System.out.println(arr[1]);
                  break;
                }
               
               
               
            }
        }
     
