import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Fruit = scan.nextLine();
        String Day = scan.nextLine();
        double Quantity = Double.parseDouble(scan.nextLine());
        double Price = 0.0;

        switch (Day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":

                if ("banana".equals(Fruit)) {
                    Price = 2.50;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if ("apple".equals(Fruit)) {
                    Price = 1.20;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if ("orange".equals(Fruit)) {
                    Price = 0.85;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if ("grapefruit".equals(Fruit)) {
                    Price = 1.45;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if ("kiwi".equals(Fruit)) {
                    Price = 2.70;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if ("pineapple".equals(Fruit)) {
                    Price = 5.50;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if  ("grapes".equals(Fruit)) {
                    Price = 3.85;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else {
                    System.out.println("error");
                } break;


            case "Saturday":
            case "Sunday":
                if ("banana".equals(Fruit)) {
                    Price = 2.70;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if ("apple".equals(Fruit)) {
                    Price = 1.25;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if ("orange".equals(Fruit)) {
                    Price = 0.90;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if ("grapefruit".equals(Fruit)) {
                    Price = 1.60;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if ("kiwi".equals(Fruit)) {
                    Price = 3.00;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if ("pineapple".equals(Fruit)) {
                    Price = 5.60;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else if ("grapes".equals(Fruit)) {
                    Price = 4.20;
                    System.out.printf("%.2f%n", Quantity * Price);
                } else System.out.println("error");

                break;
            default: System.out.println("error");


            }
        }
    }

















