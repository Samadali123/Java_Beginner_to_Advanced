package Questions;


class largestnumber{
    public static void main(String[] args) {
          int a = 50;
          int b = 32;
          int c = 13;

          if(a>b){
             if(a>c){
                   System.out.println("A is largest");
             }else{
                 System.out.println("C is largest");
             }
          }
          else {
             if(b>a){
                  if(b>c){
                     System.out.println("B is largest"); 
                  }
                  else{
                     System.out.println("c is largest");
                  }
             }
          }
    }
}