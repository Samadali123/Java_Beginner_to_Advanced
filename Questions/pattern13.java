package Questions;

// Star Triangle Flipped
public class pattern13 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
             for(int j=1; j<=n-i; j++){
                System.out.print("  ");
             }
             for(int k=1; k<=i; k++){
                System.out.print("* ");
             }
            System.out.println();  // Move to the next line after each row
        }
    }
}
