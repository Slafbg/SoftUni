import java.util.Scanner;

public class Number100Number200 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

          if (num < 100) {
            System.out.print("Less than 100");
          }else if (num <= 200) {
            System.out.print("Between 100 and 200");
        }else {
            System.out.print("Greater than 200");}
        }


    }

