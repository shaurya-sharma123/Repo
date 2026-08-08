
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String s = sc.nextLine();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || 
                s.charAt(i) == 'u'
            ) {
                vowels++;
            }

            else if (s.charAt(i) == ' ') {
                continue;
            }

            else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}