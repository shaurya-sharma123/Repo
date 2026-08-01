
import java.util.Scanner;

public class Desk {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String text = sc.nextLine();

        String[] res = text.split(" ");

        String minWord = res[0];
        String maxWord = res[0];

        for (int i = 0; i < res.length; i++) {
            
            if (res[i].length() < minWord.length()) {
                minWord = res[i];
            }

            else if (res[i].length() > maxWord.length()) {
                maxWord = res[i];
            }
        }

        System.out.println("Max: " + maxWord);
        System.out.println("Min: " + minWord);
    }
}