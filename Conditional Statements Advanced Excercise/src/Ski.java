import java.util.Scanner;

public class Ski {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Days = Integer.parseInt(scan.nextLine());
        String RoomKind = scan.nextLine();
        String Feedback = scan.nextLine();
        double Price = 0;

        switch (RoomKind) {
            case "room for one person":
                if (Days > 0) {
                    Price = 18;
                }break;
            case "apartment":
                Price = 25;
                if (Days < 10) {
                    Price = Price - (Price * 0.30);
                } else if (Days <= 15) {
                    Price = Price - (Price * 0.35);
                } else {
                    Price = Price - (Price * 0.5);
                }break;
            case "president apartment":
                Price = 35;
                if (Days < 10) {
                    Price = Price - (Price * 0.1);
                } else if (Days <= 15) {
                    Price = Price - (Price * 0.15);
                } else {
                    Price = Price - (Price * 0.2);
                }break;
        } if (Feedback.equals("positive")) {
            Price = Price + (Price * 0.25);
            double Nights = Days -1;

            System.out.printf("%.2f", Price * Nights);
        } else if(Feedback.equals("negative")) {

            Price = Price - (Price * 0.1);
            double Nights = Days -1;
            System.out.printf("%.2f", Nights * Price);


        }

    }
}




