
import  java.util.*;
 
public class maxnumber {
    public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);

          int a = scn.nextInt();
          int b = scn.nextInt();
          int c = scn.nextInt();


          if(a>b && a>c){
             System.out.println("a sabse bada hai");
          }
          else if(b>a && b>c){
            System.out.println("B sabse bada hai");
          }
          else{
            System.out.println("C sabse bada hai");
          }
    }
}
