import java.util.Scanner;

public class WeekendorWorking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Day = (scan.nextLine());

        switch (Day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case  "Friday":
                System.out.print("Working day");
                break;
            case "Saturday":
               case  "Sunday":
                System.out.print("Weekend");
                break;
            default:
                System.out.print("Error");
        }


    }
}
