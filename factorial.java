import  java.util.*;

public class factorial {
    
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scn.nextInt();
        System.out.println("Enter r");
        int r = scn.nextInt();
       
        int nfact = factorial(n);
        int rfcat = factorial(r);
        int nminusrfact = factorial(n-r);


        int finalans = (nfact)/(rfcat*nminusrfact);
       
        System.out.print(finalans);

        
    }


    public static int factorial(int n){
         int fact = 1;
         for(int i=1; i<=n; i++){
            fact = fact*i;
         }
         return  fact;

    }
}
