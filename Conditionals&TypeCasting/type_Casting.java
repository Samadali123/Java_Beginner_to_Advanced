public class type_Casting {
    
    public static void main(String[] args) {
        System.out.println("Type Casting in Java Prgramming Langauge");
        // the basic rule in type casting is that chote weight ko bada weight aram se consume krlega pr bada weight ko chota weoight directly consume nhi krsjta use explicity consume krvana padega

        //ex1 
        int x = 100;
        long y = x;
        System.out.print(y);

        //ex2 
        long x2  = 1000;
         int y2 = (int)x2; // (int)
        //  System.out.print(y2); // (long) (float)
        

        // ex3 
        long x3 = 10000000000L; // L is used becoz numbers are  bydeafult integer form and in decimasl in theri double form in default form

        int y3 =  (int)x3;
        // System.out.print(y3);

        // ex5

        int x5 = 10000;
        long y5 = x5;
        // System.out.print(y5);


        // ex6

       long x6 = 10000000000L;
       int y6 = (int)x;
    //    System.out.print(y6);

    









    }
}
