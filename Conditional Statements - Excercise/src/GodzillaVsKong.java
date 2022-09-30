import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Money = Double.parseDouble(scan.nextLine());
        int People = Integer.parseInt(scan.nextLine());
        double ClothesPerson = Double.parseDouble(scan.nextLine());

        double DecorMoney = Money * 0.10;
        double ClothesPrice = (People * ClothesPerson);


        if (People > 150) {
            ClothesPrice = ClothesPrice - (ClothesPrice * 0.10);
        }
        double TotalMovieCost = (DecorMoney + ClothesPrice);

        if( Money >= TotalMovieCost){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Money - TotalMovieCost);
        }else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",  Math.abs(Money - TotalMovieCost));
        }


    }
}

