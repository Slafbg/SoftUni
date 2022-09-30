import java.util.Scanner;

public class Comision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String City = scan.nextLine();
        double Number = Double.parseDouble(scan.nextLine());


        switch (City) {
            case "Sofia":
                if (Number >= 0 && Number <= 500) {
                    System.out.printf("%.2f%n", (Number * 5) / 100);
                } else if (Number > 500 && Number <= 1000) {
                    System.out.printf("%.2f%n", (Number * 7) / 100);
                } else if (Number > 1000 && Number <= 10000) {
                    System.out.printf("%.2f%n", (Number * 8) / 100);
                } else if (Number > 10000)   {
                    System.out.printf("%.2f%n", (Number * 12) / 100);
                } else System.out.println("error");
                break;

            case "Varna":
                if (Number >= 0 && Number <= 500) {
                    System.out.printf("%.2f%n", (Number * 4.5) / 100);
                } else if (Number > 500 && Number <= 1000) {
                    System.out.printf("%.2f%n", (Number * 7.5) / 100);
                } else if (Number > 1000 && Number <= 10000) {
                    System.out.printf("%.2f%n", (Number * 10) / 100);
                } else if (Number > 10000)   {
                    System.out.printf("%.2f%n", (Number * 13) / 100);
                } else System.out.println("error");
                break;

            case "Plovdiv":
                if (Number >= 0 && Number <= 500) {
                    System.out.printf("%.2f%n", (Number * 5.5) / 100);
                } else if (Number > 500 && Number <= 1000) {
                    System.out.printf("%.2f%n", (Number * 8) / 100);
                } else if (Number > 1000 && Number <= 10000) {
                    System.out.printf("%.2f%n", (Number * 12) / 100);
                } else if (Number > 10000)   {
                    System.out.printf("%.2f%n", (Number * 14.5) / 100);
                } else System.out.println("error");
                break;
                default:
                   System.out.println("error");
        }

        }
    }












