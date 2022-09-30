import java.util.Scanner;

public class KidsStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Trip = Double.parseDouble(scan.nextLine());
        int PuzzleCount = Integer.parseInt(scan.nextLine());
        int Dolls = Integer.parseInt(scan.nextLine());
        int Bears = Integer.parseInt(scan.nextLine());
        int Minions = Integer.parseInt(scan.nextLine());
        int Trucks = Integer.parseInt(scan.nextLine());

        double PuzzlePrice = PuzzleCount * 2.60;
        double DollsPrice = Dolls * 3;
        double BearsPrice = Bears * 4.10;
        double MinionPrice = Minions * 8.20;
        double TruckPrice = Trucks * 2;

        double Total = PuzzlePrice + DollsPrice + BearsPrice + MinionPrice + TruckPrice;
        int Number = PuzzleCount + Dolls + Bears + Minions + Trucks;


        if (Number >=50){
             Total = Total - (Total  * 0.25);
        }
         Total = Total - (Total * 0.10);
        if (Total >= Trip) {
            System.out.printf("Yes! %.2f lv left.", Total - Trip);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", Trip - Total);
        }

    }
}
