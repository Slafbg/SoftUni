import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String FlowerKind = scan.nextLine();
        int FlowerCount = Integer.parseInt(scan.nextLine());
        int Budget = Integer.parseInt(scan.nextLine());
        double RosePrice = 5;
        double DahliasPrice = 3.80;
        double TulipsPrice = 2.80;
        double NarcissusPrice = 3.00;
        double GladiolusPrice = 2.50;
        double Price = 0;

        switch (FlowerKind) {
            case ("Roses"):
                Price = FlowerCount * RosePrice;
                if (FlowerCount > 80) {
                    Price = Price - (Price * 0.10);
                }
                break;
            case ("Dahlias"):
                Price = FlowerCount * DahliasPrice;
                if (FlowerCount > 90) {
                    Price = Price - (Price * 0.15);
                }
                break;
            case ("Tulips"):
                Price = FlowerCount * TulipsPrice;
                if (FlowerCount > 80) {
                    Price = Price - (Price * 0.15);
                }
                break;
            case ("Narcissus"):
                Price = FlowerCount * NarcissusPrice;
                if (FlowerCount < 120) {
                    Price = Price + (Price * 0.15);
                }
                break;
            case ("Gladiolus"):
                Price = FlowerCount * GladiolusPrice;
                if (FlowerCount < 80) {
                    Price = Price + (Price * 0.20);
                }
                break;
        }
        if (Price <= Budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left." , FlowerCount , FlowerKind , Budget - Price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more." , Price - Budget);
        }
    }
}

