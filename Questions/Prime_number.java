package Questions;
import java.util.*;
public class Prime_number {
      public static void main(String[] args){

        System.out.println("Enter a number");
        int number = scn.nextInt();
        int count = 0;
        for(int i=1; i<=number; i++){
            if(number%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime Number");
        }else{
          System.out.println("Not a Prime Number");
        }

        
      }
}
