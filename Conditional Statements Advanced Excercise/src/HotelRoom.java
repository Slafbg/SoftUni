import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Month = scan.nextLine();
        int Nights = Integer.parseInt(scan.nextLine());
        double SP = 0;
        double AP = 0;


        switch (Month) {
            case ("May"):
            case ("October"):
                SP = 50;
                AP = 65;
                if (Nights <= 7) {
                    SP = Nights * SP;
                    AP = Nights * AP;
                } else if (Nights > 7 & Nights <= 14) {
                    SP = Nights * SP - (Nights * SP * 0.05);
                    AP = Nights * AP;
                } else {
                    SP = Nights * SP - (Nights * SP * 0.30);
                    AP = Nights * AP - (Nights * AP * 0.10);
                } break;
            case ("June"):
            case ("September"):
                SP = 75.20;
                AP = 68.70;
                if (Nights <= 7) {
                    SP = Nights * SP;
                    AP = Nights * AP;
                } else if (Nights > 7 & Nights <= 14) {
                    SP = Nights * SP;
                    AP = Nights * AP;
                } else {
                    SP = Nights * SP - (Nights * SP * 0.20);
                    AP = Nights * AP - (Nights * AP * 0.10);
                } break;

                case ("July"):
                case ("August"):
                    SP = 76;
                    AP = 77;
                    if (Nights <= 14) {
                        AP = Nights * AP;
                        SP = Nights * SP;
                    } else {
                        AP = Nights * AP - (Nights * AP * 0.10);
                        SP = Nights * SP;
                    } break;

            }
            System.out.printf("Apartment: %.2f lv.\n", AP);
            System.out.printf("Studio: %.2f lv.", SP);


        }
    }

