package Questions;

// /Alphabet Squre
public class pattern8 {
     public static void main(String[] args) {
         int n = 4;
         for(int i=1; i<=4; i++){
            for(char ch = 'A'; ch<'A'+n; ch++){
                      System.out.print(ch+" ");
            }
            System.out.println();
         }
     }
}
