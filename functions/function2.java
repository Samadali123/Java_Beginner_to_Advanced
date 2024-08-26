package functions;
import  java.util.*;
public class function2 {
     public static void main(String[] args) {
         
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
   
        int n = scn.nextInt();
   
        System.out.println(sum(n));
     }


     public  static long  sum(int n){
            int fact = 1;
            for(int i=1; i<=n; i++){
                  fact = fact*i;
            }

            return  fact;
     }




}
