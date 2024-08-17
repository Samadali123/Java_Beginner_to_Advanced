import  java.util.*;
public class cube {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scn.nextInt();

        System.out.println(cube(n));

    }


    public static int cube (int n){
         return  n*n*n;
    }


    
}

