package patterns;
import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number of rows");
        int n = scn.nextInt();


        for(int i=1; i<=n; i++) {


              for(int j=1; j<=i; j++) {
                   int sum = i + j;

                   if(sum % 2 == 0){
                    System.out.print("1"+" ");
                   }else{
                       System.out.print("0"+" ");
                   }
              }

            System.out.println();
        }

    }
}
