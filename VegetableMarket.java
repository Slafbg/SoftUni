import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double PriceKGVegetables = Double.parseDouble(scan.nextLine());
        double PriceKGFruits = Double.parseDouble(scan.nextLine());
        double TotalKGVegetables = Double.parseDouble(scan.nextLine());
        double TotalKGFruits = Double.parseDouble(scan.nextLine());

        double Price = 1.94;
        double Vegetables = PriceKGVegetables * TotalKGVegetables;
        double Fruits = PriceKGFruits * TotalKGFruits;
        double TotalCost = (Vegetables + Fruits) / Price;

        System.out.printf("%.2f%n", TotalCost);

    }
}
