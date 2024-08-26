package patterns;
import  java.util.*;
class Pattern13{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scn.nextInt();
        int nsp = n-1;
        int nstr = 1;
        for(int i=1; i<=n; i++){

          //1st part
         for(int j=1; j<=nstr; j++){
              System.out.print("*");
         }

         // spaces
         for(int k=1; k<=nsp; k++){
             System.out.print(" ");
         }
          
         // 2nd part
         for(int j=1; j<=nstr; j++){
            System.out.print("*");
       }
      
       if(i<=n/2){
          nsp-=2;
          nstr++;
       }else{
         nsp+=2;
         nstr--;
       }
       
        System.out.println();

        }


    }
}