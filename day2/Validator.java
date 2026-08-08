
import java.util.Scanner;

public class Validator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String fileName = sc.nextLine();

        int lastCharIndex = fileName.lastIndexOf('.');
        String extension = fileName.substring(lastCharIndex + 1);

        if (extension.equalsIgnoreCase("pdf") || extension.equalsIgnoreCase("zip") || extension.equalsIgnoreCase("docx")) {
            System.out.println("Accepted.");
        }

        else {
            System.out.println("Rejected.");
        }
    }
}
