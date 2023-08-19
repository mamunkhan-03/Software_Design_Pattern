
package Mediator;


public class User1 extends User {
    
    
   User1 (Mediator obj1, String name){
         
       super(obj1, name);
    }

    @Override
    public void sent(String msg) {
        System.out.println(name+"sending message "+msg);
        mediatorObj.sendMessage(this, msg);
    
    }

    @Override
    public void receive(String msg) {
        System.out.println(name+"receive message "+msg);
    
    }
}
