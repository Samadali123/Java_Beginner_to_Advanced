package patterns;
import java.util.*;

public class pattern9 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print for pattern");

        int n = scn.nextInt();
      
        int nsp = n-1;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=nsp; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println(" ");
            nsp--;
        }

    }

}
