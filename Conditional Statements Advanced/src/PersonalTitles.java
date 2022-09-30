import javax.swing.*;
import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Age = Double.parseDouble(scan.nextLine());
        String Gender = scan.nextLine();

        if ("m".equals(Gender)) {
            if (Age >= 16) {
                System.out.print("Mr.");
            }else {
                System.out.print("Master");

            }
        }else if ("f".equals(Gender)){
            if (Age >= 16) {
                System.out.print("Ms.");
            }else {
                System.out.print("Miss");
            }
        }
    }
}










