import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Day = scan.nextLine();
        double Price = 0;
        switch (Day) {
            case "Monday":
            case "Tuesday":
            case "Friday": {
                    Price = 12;
                System.out.printf("%.0f", Price);
            } break;
        }
          switch (Day) {
              case "Wednesday":
              case "Thursday":
                  Price = 14;
                  System.out.printf("%.0f", Price);
                  break;
          }
        switch (Day) {
            case "Saturday":
            case "Sunday":
                Price = 16;
                System.out.printf("%.0f", Price);
                break;
        }


    }
}
