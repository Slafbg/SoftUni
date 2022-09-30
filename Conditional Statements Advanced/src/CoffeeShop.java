import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Product = scan.nextLine();
        String City = scan.nextLine();
        double Count = Double.parseDouble(scan.nextLine());
        double Price = 0;

        switch (City) {
            case "Sofia":
                if ("coffee".equals(Product)) {
                    Price = 0.50;
                } else if ("water".equals(Product)) {
                    Price = 0.80;
                } else if ("beer".equals(Product)) {
                    Price = 1.20;
                } else if ("sweets".equals(Product)) {
                    Price = 1.45;
                } else if ("peanuts".equals(Product)) {
                    Price = 1.60;

                }
                break;

            case "Plovdiv":
                if ("coffee".equals(Product)) {
                    Price = 0.40;
                } else if ("water".equals(Product)) {
                    Price = 0.70;
                } else if ("beer".equals(Product)) {
                    Price = 1.15;
                } else if ("sweets".equals(Product)) {
                    Price = 1.30;
                } else if ("peanuts".equals(Product)) {
                    Price = 1.50;

                }
                break;
            case "Varna":
                if ("coffee".equals(Product)) {
                    Price = 0.45;
                } else if ("water".equals(Product)) {
                    Price = 0.70;
                } else if ("beer".equals(Product)) {
                    Price = 1.10;
                } else if ("sweets".equals(Product)) {
                    Price = 1.35;
                } else if ("peanuts".equals(Product)) {
                    Price = 1.55;

                } break;


        }
                    System.out.println(Count*Price);
    }
}