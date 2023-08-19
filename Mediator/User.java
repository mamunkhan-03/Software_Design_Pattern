
package Mediator;


public abstract class User {
    
   protected Mediator mediatorObj;
    
  protected  String name;
    
   public User (Mediator obj, String name){
        this.mediatorObj=obj;
        this.name=name;
    }
    
   public abstract void sent(String msg);
   
   public abstract void receive(String msg);
   
        
        
    
}
