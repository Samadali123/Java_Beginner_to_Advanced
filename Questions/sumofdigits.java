package Questions;

public class sumofdigits {
    
    public static void main(String[] args) {
        int n = 655;
        int sum = 0;
        while(n >0){
             int digit = n % 10;
              sum += digit;
             n = n/10;
        }
    
        System.out.println("Sum of digits of a number is " + sum);
    }
    
}
