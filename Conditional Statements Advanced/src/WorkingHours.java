import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Hour = Integer.parseInt(scan.next());
        String Day = scan.next();

        switch (Day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (Hour >= 10 && Hour <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            case "Sunday":
                System.out.println("closed");
                break;
        }
                

    }
}