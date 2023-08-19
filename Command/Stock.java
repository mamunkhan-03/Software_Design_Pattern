
package Command;

public class Stock {
    
    private String name ="ABC";
    private int quantity=10;
    
    public void buy(){
        System.out.println("Buy the item that is "+name+"and quantity is "+quantity);
    }
    
    public void sell (){
        System.out.println("Sell the item that is "+name+"and quantity is "+quantity);
        
    }
}
