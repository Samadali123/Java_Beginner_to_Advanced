package Questions;

// Number Pyramid Palindrome
public class pattern16 {
    public static void main(String[] args) {
            int n = 4;
            for(int i=1; i<=n; i++){
               // spaces
               for(int j=1; j<=n-i;  j++){
                System.out.print("  ");
               }

               // increasing
               for(int k=1; k<=i; k++){
                System.out.print(k+" ");
               }
               // decreasing
               for(int m=i-1; m>=1;  m--){
                System.out.print(m+" ");
               }

               System.out.println();
            }
    }
}
