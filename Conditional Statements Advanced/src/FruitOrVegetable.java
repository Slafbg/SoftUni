import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Product = scan.nextLine();

        if (Product.equals("banana") || Product.equals("apple")  || Product.equals("kiwi") || Product.equals("cherry") || Product.equals("lemon") || Product.equals("grapes")) {
            System.out.print("fruit");
        } else if (Product.equals("tomato") || Product.equals("cucumber") || Product.equals("pepper") || Product.equals("carrot")) {
            System.out.print("vegetable");
        } else {
            System.out.print("unknown");
        }

    }

}








