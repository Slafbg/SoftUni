import java.util.Scanner;

public class WorldRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double WorldRec = Double.parseDouble(scan.nextLine());
        double Distance = Double.parseDouble(scan.nextLine());
        double SecMeter = Double.parseDouble(scan.nextLine());


        double Punishment = Math.floor(Distance / 15) * 12.5;

        double Time = Distance * SecMeter + Punishment;

        if(Time < WorldRec){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", Time);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", Time - WorldRec);
        }

    }
}