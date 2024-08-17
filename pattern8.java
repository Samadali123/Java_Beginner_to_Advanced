import java.util.Scanner;

public class pattern8 {
    
    public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Enter a number of rows");
          int n = scn.nextInt();
          System.err.println("Enter a number of columns");
          int m = scn.nextInt();

          for(int i=1; i<=n; i++) {

         

          for(int j=1; j<=m; j++) {
             if(i == 1 || j==1 || i == n || j== m){
                  System.out.print("*");
             }else{
                 System.out.print(" ");
             }

          }
          System.out.println();



          }


        
    }
}
