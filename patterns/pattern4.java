package patterns;
import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        if(n%2 == 0){
            System.out.println("Number you entered cannot make your pattern");
        }

        int nstr = 1;
        int nsp = n/2;
        
        for(int i=1; i<=n; i++){

        for(int j=1; j<=nsp; j++){
            System.out.print(" ");
        }   

        for(int k=1;  k<= nstr; k++){
         System.out.print("*");
        }

        if(i<=n/2){
            nsp--;
            nstr+=2;
        }else{
             nsp++;
             nstr-=2;  
        }

     System.out.println();
      
        }
        

        


    }
}
