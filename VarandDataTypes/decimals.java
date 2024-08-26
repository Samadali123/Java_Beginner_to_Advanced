package VarandDataTypes;
public class decimals {
        public static void main(String[] args) {
            System.out.println("Lets Understand the Dynamics of the Floating numbers");

            // Default value in decimals in double if we have to still use float write f after value of the varibale or the data
            
              double f1 = 2.4;
              System.out.println(f1);
               float f2 = 3.4f;
               System.out.println(f2);

               // jo class type greater hoga usme answer ayega isme answer ayega double me  or float double ko directly store nhi krskata toh use explicityly typecast krna padega

               float sum =  (float)(f1+f2);
               System.out.println(sum);

               float f4 =  (float)34.678346767754765467345764;
               System.out.println(f4);

               

               // int to long works defaultly 
               // float to double wokrs default
               // but 
               // double to float use (float)
               // long to int use (int)

        
               // rule 1 : Mathematical operations between  decimals and non  deciamals , Result is Decimals
               // rule 2 : if operation betweeen the same category then larger size is the rsultant
               
        }
}
