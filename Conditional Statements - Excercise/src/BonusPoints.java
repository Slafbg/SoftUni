import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int Number = Integer.parseInt(scan.nextLine());

        double Bonus = 0;


        if (Number <= 100) {
            Bonus = Bonus + 5;
        } else if (Number <= 1000) {
            Bonus = Number * 0.20;
        } else {
            Bonus = Number * 0.10;
        }

        if (Number % 2 == 0) {
            Bonus = Bonus + 1;
        }

        if (Number % 10 == 5) {
            Bonus = Bonus + 2;
        }


        System.out.println(Bonus);
        System.out.println(Bonus + Number);


    }
}