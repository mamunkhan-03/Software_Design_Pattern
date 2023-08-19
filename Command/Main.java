
package Command;


public class Main {
    
    public static void main(String[] args) {
        
        Stock stockObj=new Stock();
        
        BuyStock buyStock=new BuyStock(stockObj);
        
        SellStock sellStock=new SellStock(stockObj);
        
        
        Broker broker=new Broker();
        broker.takeOder(buyStock);
       
        
        broker.placeOrders();
      
        
        
        
    }
    
}
