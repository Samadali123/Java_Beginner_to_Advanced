package Questions;

public class Armstrongnumber {
    public static void main(String[] args) {
         int number =  455;
         int copy = number;
        int sum  = 0;
        while(number>0){
                int last = number%10;
                sum+=last*last*last;  
                number = number/10;
        }

        if(sum == copy){
           System.out.println("Armstrong number");
        }else{
           System.out.println("Not a Armstrong number");
        }
    }
}
