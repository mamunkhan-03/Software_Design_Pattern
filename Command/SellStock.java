
package Command;

public class SellStock {
    
    private Stock stockObj;
    
    SellStock(Stock stockObject){
        this.stockObj=stockObject;
    }
    
    
    public void execute (){
        stockObj.sell();
    }
    
   
}
