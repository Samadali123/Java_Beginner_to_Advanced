package patterns;
import   java.util.*;

public class pattern11 {
     public static void main(String[] args) {
         
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a  number of rows");
        int n = scn.nextInt();

        for(int i=1; i<=n; i++){

            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=n; k++){
                System.out.print("*");
            }

            System.out.println();

        }
     }
}
