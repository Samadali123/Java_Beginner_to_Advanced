package Questions;

public class reverseofnumber {
      public static void main(String[] args) {
              int n = 123;
              int reverse = 0;

              while(n>0){
                int last = n%10;
                reverse = reverse * 10+last;
                n = n/10;
              }

              System.out.println("Reverse of a given number is " + reverse);
      }
}
