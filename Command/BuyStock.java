
package Command;

public class BuyStock implements Order{
    
    private Stock stockObj;
    
    BuyStock(Stock stockobject){
        this.stockObj=stockobject;
    }
    
    public void execute(){
        
        stockObj.buy();
        
    }
    
    
    
}
