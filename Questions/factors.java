package Questions;
import  java.util.*;
public class factors {
    
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

         int number = scn.nextInt();
         int count = 0;
         for(int i=1; i*i<=number; i++) {
             if(number%i == 0){
                if(i != number/i){
                    count+=2;
                }
                else{
                count++;
                }
             }

         }

         System.out.print(count);

    }
}
