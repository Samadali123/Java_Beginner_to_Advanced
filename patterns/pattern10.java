package patterns;
import java.util.Scanner;

public class pattern10 {
     public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter  a numbe of rows to print the pattern");
        int n = scn.nextInt();

        for(int i=1; i<=n; i++) {

            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();


        }




     }
}
