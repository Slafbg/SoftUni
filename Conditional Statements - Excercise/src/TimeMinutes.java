import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Hours = Integer.parseInt(scan.nextLine());
        int Minutes = Integer.parseInt(scan.nextLine());

        int TotalTime = Hours* 60 + Minutes + 15;

        int Hour = TotalTime / 60;
        int Min = TotalTime % 60;



        if(Hour == 24){
            Hour = 0;
        }

        if(Min < 10){
            System.out.printf("%d:0%d", Hour, Min);
        }else{
            System.out.printf("%d:%d", Hour, Min);
        }

    }
}