import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double PeterBudget = Double.parseDouble(scan.nextLine());
        int Video = Integer.parseInt(scan.nextLine());
        int CPU = Integer.parseInt(scan.nextLine());
        int RAM = Integer.parseInt(scan.nextLine());

        double VideoPrice = Video * 250;
        double CPUPrice = (VideoPrice * 0.35) * CPU;
        double RAMPrice = (VideoPrice * 0.10) * RAM;

        double finalPrice = 0;

        if(Video > CPU){
            finalPrice = (VideoPrice + CPUPrice + RAMPrice) * 0.85;
        }else{
            finalPrice= VideoPrice + CPUPrice + RAMPrice;
        }
        double Money = Math.abs(finalPrice - PeterBudget);

        if(PeterBudget >= finalPrice){
            System.out.printf("You have %.2f leva left!", Money);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!", Money);
        }


    }
}