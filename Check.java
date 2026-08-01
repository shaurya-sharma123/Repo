
import java.util.Scanner;


public class Check {

    public static String check(String Id) {
        
        if (Id.startsWith("VIP")) {
            return "VIP Customer";
        }

        return "Regular Customer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID: ");
        String text = sc.nextLine();

        System.out.println("Result: " + check(text));
    }
}