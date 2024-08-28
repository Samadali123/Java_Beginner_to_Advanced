package Questions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int prev = 0;
        int next = 1;
        int n = 10; 

        System.out.print(prev + " " + next);
        for(int i=1; i<=n; i++) {
              int sum = prev+next;
              System.out.print(" "+sum);
              prev = next;
              next = sum;
        }
        
    }
}
