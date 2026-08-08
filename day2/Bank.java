
import java.util.Scanner;


public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the reference: ");
        String reference = sc.nextLine();
        reference.trim();

        StringBuilder sb = new StringBuilder(reference);

        for (int i = 0; i < 3; i++) {
            char temp = Character.toUpperCase(sb.charAt(i));
            sb.setCharAt(i, temp);
        }

        int noOfChar = 0;

        for (int i = 0; i < sb.length(); i++) {
            noOfChar++;
        }

        if (noOfChar != 14) {
            System.out.println("INvalid string");
            return;
        }

        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(sb.charAt(i))) {
                System.out.println("Invalid String");
                return;
            }
        }

        for (int i = 0; i < 14; i++) {

            if (!Character.isDigit(sb.charAt(i))) {
                System.out.println("Invalid String");
                return;
            }
        }

        System.out.println("[" + sb.substring(0, 3) + "]" + "DATE: " + sb.substring(3, 5) + "/" + sb.substring(5, 7) + "/" + sb.substring(7, 9) + " | " + "SEQ: " + sb.substring(9, 14));
    }
}