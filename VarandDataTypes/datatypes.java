package VarandDataTypes;

public class datatypes {
    public static void main(String[] args) {
// System.out.print("Data Types in Java");
// data types generally in 2 types primitive and non primitve 

// Data Type	Size	Range	Example
// byte 2 byte	8-bit	-128 to 127	byte b = 100;
// short 1 byte	16-bit	-32,768 to 32,767	short s = 10000;
// int 4 byte	32-bit	-2^31 to 2^31-1	int i = 100000;
// long 8 byte	64-bit	-2^63 to 2^63-1	long l = 100000L;
// float 4 byte	32-bit	±1.4E-45 to ±3.4E38 (approx)	float f = 10.5f;
// double 8 byte	64-bit	±4.9E-324 to ±1.7E308 (approx)	double d = 10.5;
// boolean  1byte 	1-bit	true or false	boolean flag = true;
// char 2 byte 	16-bit	'\u0000' to '\uffff' (0 to 65,535)	char c = 'A';

// primitive :  Numbers, Char, Boolean,  etc, 
//  numbers : Integers and decimals
//  Integers : byte, short, int , long  // inters me number by deafutlt integers hold krta hai
//  decimals : float , double ,, decimals numbers mein default double hold krta hai 


// non-primitive :  STRING, Array,objetcs, classes etc


    //   numbers 
    int age = 43;
    // System.out.println(age);

    int temp;
    temp = 54656756;
    // System.out.print(temp+age) ;
    System.out.println();

    int a = 12;
    int b = 22;
    temp = a;
    a = b;
    b = temp;
    // System.out.print(a + "and" + b) ;
    int temp3 = 133;
    // temp3  =  333.34;
    // System.out.println(temp3);
    int temp4 = 133;
    // System.out.print(temp4);

    int x = 30;
    int y = 20;
    // System.out.println(x+y);
    // System.out.println(x+" " +y);/
    // System.out.println(y);

    // System.out.print(z);
    // int z = 35; // Error occurs becoz variable cannot be used before initalsed in the code in the Java 

    int s = 10;
    // int s = 10;
    // System.out.println(s);
    // cant initialise same variaable with same name
//  System.out.println(s);

//    int n  = 1000000000 // 19 Power 9 is the range of the Integer Class in Numbers;
//    System.out.println(n);

    //    long n2 = 100000000000;
//    System.out.println(n2);


}

}
