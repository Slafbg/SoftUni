import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Number = Double.parseDouble(scan.next());

        if  (Number <= 100  && Number != 0 && Number >= -100  ){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }


    }
}

