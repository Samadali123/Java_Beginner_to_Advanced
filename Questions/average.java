package Questions;
class average {
     public static void main(String[] args) {
         int n1 = 12;
         int n2 = 13;
         int n3 = 14;

         int ans = average(n1, n2, n3);
         System.err.println(ans);
     }

     public static int average(int a, int b, int c){
      return  (a+b+c)/3;
     }



}