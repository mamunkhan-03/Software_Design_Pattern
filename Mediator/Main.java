
package Mediator;

public class Main {
    
    public static void main(String[] args) {
        
        Mediator medi=new MediatorType1();
        
        User user1=new User1(medi, "Mamun");
        User user2=new User1(medi, "Akash");
        User user3=new User1(medi, "Reza");
       
        
        medi.addUser(user1);
        medi.addUser(user2);
        medi.addUser(user3);
        
        user1.sent("Fuck you");
        
        user3.sent("Bainchod");
        
    }
    
}
