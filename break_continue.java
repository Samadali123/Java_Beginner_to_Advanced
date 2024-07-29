public  class break_continue{
     public static void main(String[] args){
         // Break and Continue in java

         for(int i=1; i<10; i++){
             if(i == 5){
                break;
             }
             if(i == 3){
                continue;
             }
             System.out.println(i);
         }

         System.out.println("Breaked");
     }
}