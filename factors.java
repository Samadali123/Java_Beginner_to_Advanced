import  java.util.*;
public class factors {
    
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

         int number = scn.nextInt();

         for(int i=1; i<=number; i++) {
             if(number%i == 0){
                System.out.println(i);
             }
         }

    }
}
