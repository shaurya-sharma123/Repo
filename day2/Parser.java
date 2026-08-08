
import java.util.Scanner;


public class Parser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the CSV formatted line: ");
        String csv = sc.nextLine();

        String[] arr = csv.split(",");

        if (arr.length != 3) {
            System.out.println("invalid Record.");
            return;
        }

        System.out.println("Name: " + arr[0] + " | " + "Roll No.: " + arr[1] + " | " + "Dept: " + arr[2]);
    }
}