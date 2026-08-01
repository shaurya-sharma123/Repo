
import java.util.Scanner;

public class Text {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iterative Check");

        String text = sc.nextLine();
        int i = 0, j = text.length() - 1;

        while (i < j) {

            if (text.charAt(i) != text.charAt(j)) {
                System.out.println("Not palindrome");
                return;
            }

            i++;
            j--;
        }

        System.out.println("Palindrome");
    }
}