import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Animal = scan.nextLine();

        switch (Animal) {
            case ("dog"):
                System.out.print("mammal");
                break;
            case "crocodile":
                case
                 "tortoise":
                    case

                  "snake":
                System.out.print("reptile");
                break;
            default:
                System.out.print("unknown");

        }

    }
}
