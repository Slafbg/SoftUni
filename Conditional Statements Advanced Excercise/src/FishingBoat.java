import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int cF = Integer.parseInt(scan.nextLine());
        double BP = 0;

        switch (season) {
            case "Summer":
            case "Autumn":
                BP= 4200;
                break;
            case "Spring":
                BP = 3000;
                break;
            case "Winter":
                BP = 2600;
                break;
        }
        if (cF <= 6) {
            BP *= 0.9;
        }else if (cF >= 7 && cF <= 11) {
            BP *= 0.85;
        }else {
            BP *= 0.75;
            }
        if ((cF % 2 == 0) && (!season.equals("Autumn"))){
            BP *= 0.95;
        } else {
            BP = BP;
        }
            if (b >= BP) {
                System.out.printf("Yes! You have %.2f leva left.", b - BP);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", BP - b);


        }


    }
}
