import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Serial = scan.nextLine();
        int Duration = Integer.parseInt(scan.nextLine());
        int Break = Integer.parseInt(scan.nextLine());


        double Lunch = Break / 8.00;
        double Relax = Break / 4.00;
        double Time = Break - (Lunch + Relax);

        if(Time >= Duration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time." , Serial, Math.ceil(Time - Duration));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes." ,  Serial, Math.ceil(Duration - Time));
    }
}
}