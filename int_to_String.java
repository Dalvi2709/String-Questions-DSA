import java.util.*;

public class int_to_String {
    public static void main(String[] args) {

        try {
            System.out.println("Enter the number");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}
