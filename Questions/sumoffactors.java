package Questions;

public class sumoffactors {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum += i;
            }  
        }
        
        System.out.println("Sum of factors of " + n + " is: " + sum);
    }
}
