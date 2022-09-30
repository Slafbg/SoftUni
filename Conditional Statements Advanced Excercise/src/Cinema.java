import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Type = scan.nextLine();
        double Rows = Double.parseDouble(scan.nextLine());
        double Colons = Double.parseDouble(scan.nextLine());
        if (Type.equals("Premiere")) {
            System.out.printf("%.2f leva", Rows * Colons * 12);
        } else if (Type.equals("Normal")) {
            System.out.printf("%.2f leva", Rows * Colons * 7.50);
        } else {
            boolean discount = Type.equals("Discount");
            System.out.printf("%.2f leva", Rows * Colons * 5);
            }
        }
    }

















