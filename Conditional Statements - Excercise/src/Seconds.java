import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int First = Integer.parseInt(scan.nextLine());
        int Second = Integer.parseInt(scan.nextLine());
        int Third = Integer.parseInt(scan.nextLine());
        int TotalTime = (First + Second + Third);
        int Minutes = TotalTime / 60;
        int Seconds = TotalTime % 60;
        if (Seconds < 10) {
            System.out.printf("%d:0%d", Minutes, Seconds);
        } else {
            System.out.printf("%d:%d" , Minutes , Seconds);
        }

    }
}
