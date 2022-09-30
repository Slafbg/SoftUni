import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = 0;

        String Figure =  (scan.nextLine());
        if (Figure.equals("square")){
            double a = Double.parseDouble(scan.nextLine());
            area = a * a;
        } else if (Figure.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            area = a * b;
        } else if (Figure.equals("circle")) {
            double r = Double.parseDouble(scan.nextLine());
            area = Math.PI * r * r;
        } else if (Figure.equals("triangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            area = a * h / 2;
        }
            System.out.printf("%.3f", area);

            
        }


    }







