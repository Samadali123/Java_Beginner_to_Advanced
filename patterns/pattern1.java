package patterns;
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print("*");
        }
        
    }
}
