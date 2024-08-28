package Questions;

public class pallindrome {
     public static void main(String[] args) {
         int n =  1244;
         int copyn = n;
         int reverse = 0;
         while(n>0){
            int last = n%10;
            reverse = reverse *10+last;
            n = n/10;
         }

         if(reverse == copyn) {
               System.out.println("Pallindromiic number");
         }else{
                System.out.println("Not a pallindromiic number");
         }
     }
}
