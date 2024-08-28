package Questions;

public class profitnloss {
     public static void main(String[] args) {
           int costprice = 120;
           int sellingprice = 500;

           if(sellingprice > costprice){
                 System.out.println("Profit hua hai"+(sellingprice-costprice)+"ka");
           }else{
                 System.out.println("Loss hua hai"+(costprice-sellingprice)+"ka");
           }
           
     }
}
