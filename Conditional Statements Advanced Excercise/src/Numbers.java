import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double N1 = Double.parseDouble(scan.nextLine());
        double N2 = Double.parseDouble(scan.nextLine());
        String Operator = scan.nextLine();
        double Result;

        if (Operator.equals("+")) {
            Result = N1 + N2;
            System.out.printf("%.0f + %.0f = %.0f", N1, N2, Result);
            if (Result % 2 == 0) {
                System.out.println(" - even");
            } else {
                System.out.println(" - odd");
            }
        }


        if (Operator.equals("-")) {
            Result = N1 - N2;
            System.out.printf("%.0f - %.0f = %.0f", N1, N2, Result);
            if (Result % 2 == 0) {
                System.out.println(" - even");
            } else {
                System.out.println(" - odd");
            }
        }

        if (Operator.equals("*")) {
            Result = N1 * N2;
            System.out.printf("%.0f * %.0f = %.0f", N1, N2, Result);
            if (Result % 2 == 0) {
                System.out.println(" - even");
            } else {
                System.out.println(" - odd");
            }
        }

        switch (Operator) {
            case ("%"):
                Result = N1 % N2;
                if (N2 != 0) {
                    System.out.printf("%.0f %% %.0f = %.0f", N1, N2, Result);
                } else {
                    System.out.printf("Cannot divide %.0f by zero", N1);
                    break;
                } }


                switch (Operator) {
                    case ("/"):
                        Result = N1 / N2;
                        if (N2 != 0) {
                            System.out.printf("%.0f / %.0f = %.2f", N1, N2, Result);
                        } else {
                            System.out.printf("Cannot divide %.0f by zero", N1);
                            break;
                        }
                }

    }
}








