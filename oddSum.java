public class oddSum {
    public static void main(String[] args) {
         int ans = sumOfOddNumbers(10);
         System.out.println(ans);
    }


    public static int sumOfOddNumbers(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                 sum+=i;
            }
        }
        return sum;
    }
}
