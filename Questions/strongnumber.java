package Questions;

public class strongnumber {
       public static void main(String[] args) {
           int n = 145;
           int copy = n;
           int sum = 0;
           while(n>0){
               int last = n%10;
               int fact = 1;

               for(int i=1; i<=last; i++) {
                       fact = fact*i;
               }
               sum+=fact; 
               n = n/10;
           }

           if(sum == copy) {
              System.out.println("strong number");
           }else{
             System.out.println("Not a strong number");
           }
       }
}
