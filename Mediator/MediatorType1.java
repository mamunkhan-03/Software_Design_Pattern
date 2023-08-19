
package Mediator;

import java.util.ArrayList;
import java.util.List;


public class MediatorType1 implements Mediator {
    
    List <User> userList=new ArrayList<User>();
    
    public void addUser(User user)
    {
        userList.add(user);
    }
    
    public void sendMessage (User user , String msg){
        for(User u : userList){
            
            if (u !=user){
                u.receive(msg);
            }
            
        }
    }
    
}
