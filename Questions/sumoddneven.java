package Questions;

public class sumoddneven {
    public static void main(String[] args) {
        int n = 10;
        int sumodd = 0;
        int sumeven = 0;

        for(int i=1; i<=n; i++) {
             if(n%i  == 0){ 
                  sumeven+=i;
             }else{
                sumodd+=i;
             }
        }

        System.out.print("Sum even:"+sumeven+" Sum odd:"+sumodd);
    }
}
