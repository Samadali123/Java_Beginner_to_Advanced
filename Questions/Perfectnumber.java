package Questions;

public class Perfectnumber {
      public static void main(String[] args) {
        int  n = 6;
        int sum = 0;
        for(int i=1; i<=n/2; i++) {
            if(n%i == 0){
              sum+=i;
            }
        }

        if(sum == n){
            System.out.println("Pefect Number");
        }else{
            System.out.println("Not a Perfect number");
        }
      }
}
