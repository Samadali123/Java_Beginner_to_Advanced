import  java.util.*;

class  input {
     public static void main(String[] args) {
         System.out.println("Lets  understand Taking inputs in Java Programming Language");
         Scanner scn = new Scanner(System.in);
        float number1 = scn.nextFloat();
         float number2 = scn.nextFloat();
         int sum =  (int)(number1 + number2);
         System.out.print("sum "+(sum)+ "of both the inputs");
        char x = scn.next().charAt(0);
        System.out.print(x+"amad");
         String str = scn.next();
         String str2 = scn.nextLine();
         System.out.print(str);
        

         // for input int we use nextint(), for float nextfloat(), for  double we use nextdouble(), for long we use nextlong(), for single charcater we use  scn.next().charAt(0), for string we use scn.nextLine();


     }
}