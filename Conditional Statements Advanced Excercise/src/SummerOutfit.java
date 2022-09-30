import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Degrees = Integer.parseInt(scan.nextLine());
        String Time = scan.nextLine();

        switch (Time) {
        case "Morning":
            if (Degrees >= 10 && Degrees <= 18) {
                System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", Degrees);
            } else if (Degrees >= 18 && Degrees <= 24) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", Degrees);
            } else {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", Degrees);
            } break;
            case "Afternoon":
                if (Degrees >= 10 && Degrees <= 18) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", Degrees);
                } else if (Degrees >= 18 && Degrees <= 24) {
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", Degrees);
                } else {
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", Degrees);
                }
                break;
            case "Evening":
                    if (Degrees >= 10 && Degrees <= 18) {
                        System.out.printf("It's %d degrees, get your Shirt and Moccasins.", Degrees);
                    } else if (Degrees >= 18 && Degrees <= 24) {
                        System.out.printf("It's %d degrees, get your Shirt and Moccasins.", Degrees);
                    } else {
                        System.out.printf("It's %d degrees, get your Shirt and Moccasins.", Degrees);
                    }
                    break;

                }
            }
        }
