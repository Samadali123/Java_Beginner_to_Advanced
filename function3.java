
import java.util.Scanner;

public class function3 {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n = scn.nextInt();
        System.out.println("Enter number 2");
        System.out.println("Enter number 2");
        int n2 = scn.nextInt();

       add(n,n2);

    }



    public static void add (int a, int b){
          int sum = a+b;
          System.out.print("Sum of "+a+"and"+b+"is"+ sum);
    }


}
