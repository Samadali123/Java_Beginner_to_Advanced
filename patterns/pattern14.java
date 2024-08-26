package patterns;
import  java.util.*;

public class pattern14 {
    
    public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter the number or rows");
          int n = scn.nextInt();
    
          for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();


          }

    }
}
