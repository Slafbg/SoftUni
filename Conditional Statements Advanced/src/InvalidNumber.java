import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Number = Integer.parseInt(scan.nextLine());

        if (Number >= 100 &&  Number <= 200 || Number == 0) {
            System.out.println();
        } else {
            System.out.println("invalid");}

    }
}
