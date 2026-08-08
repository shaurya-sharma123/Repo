import java.util.Scanner;

public class Formatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String number = sc.nextLine();

        if (number.length() != 10) {
            System.out.println("Invalid phone number.");
            return;
        }

        StringBuilder sb = new StringBuilder();

        sb.append("XXXXXX-");
        sb.append(number.substring(6));
        System.out.println(sb);
    }
}