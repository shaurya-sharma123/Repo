
import java.util.Scanner;
public class HashArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] words = new char[256];

        for (int i = 0; i < text.length(); i++) {
            words[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            
            if (words[text.charAt(i)] == 1) {
                System.out.println(text.charAt(i));
                return;
            }
        }
    }
}