import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());

        if (num <= 10) {
            System.out.print("slow");
        } else if (num <= 50) {
            System.out.print("average");
        } else if (num <= 150){
            System.out.print("fast");
        }else if (num <= 1000){
            System.out.print("ultra fast");
        }else {
            System.out.print("extremely fast");
        }


    }
}
