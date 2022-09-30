import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Budget = Double.parseDouble(scan.nextLine());
        String Season = scan.nextLine();
        double Price = 0;
        String Type = "";
        String destination = "";

        if(Budget <= 100){
            destination = "Bulgaria";

            if(Season.equals("summer")){
                Price = Budget * 0.30;
                Type = "Camp";
            }else{
                Price = Budget * 0.70;
                Type = "Hotel";
            }

        }else if(Budget <= 1000){
            destination = "Balkans";

            if(Season.equals("summer")){
                Price = Budget * 0.40;
                Type = "Camp";

            }else{
                Price = Budget * 0.80;
                Type = "Hotel";
            }
        }else{
            destination = "Europe";

            Price = Budget * 0.90;
            Type = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f%n", Type, Price);

    }
}
