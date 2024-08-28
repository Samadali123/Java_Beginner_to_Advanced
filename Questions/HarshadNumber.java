package Questions;

public class HarshadNumber {
     public static void main(String[] args) {
        int n = 24;
        int copy = n;
        int sum = 0;

        while(n>0){
            int digit = n%10;
            sum += digit;
            n = n/10;
        }

        if(copy%sum == 0){
            System.out.println("harshad number");
        }else{
              System.out.println("Not a harshad number");
        }

     }
}
