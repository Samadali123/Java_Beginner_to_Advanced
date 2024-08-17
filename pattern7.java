import java.util.Scanner;

public class pattern7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();

        int nsp = 1;
        int nstr = n / 2 + 1;
       
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= nstr; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= nstr; l++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after printing each row

            if (i <= n / 2) {
                nsp += 2;
                nstr--;
            } else {
                nsp -= 2;
                nstr++;
            }
        }

    }
}
