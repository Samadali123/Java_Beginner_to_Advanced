import  java.util.*;
public class pattern15 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int n = scn.nextInt();

        for(int i=1; i<=n; i++){


            for(int j=1; j<=n-i;  j++){
                 System.out.print("  ");
            }

            for(int k=i; k>=1; k--){
                System.out.print(k+" ");
      
            }
            
            for(int k=2; k<=i; k++){
                System.out.print(k+" ");
            
            }

            

     
        
            System.out.println();



        }

    }
}
