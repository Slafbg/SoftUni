import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = (scan.nextLine());

        if (word.equals("s3cr3t!P@ssw0rd")) {
            System.out.print("Welcome");
        } else {
            System.out.print("Wrong password!");
        }

    }
}
