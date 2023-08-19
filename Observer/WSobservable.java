
package Observer;

import java.util.ArrayList;
import java.util.List;


public class WSobservable  implements WeatherStation {
    
    List <DisplayObserver>  observerList  = new ArrayList<DisplayObserver>();
    
    int temp=0;
    
    public void add (DisplayObserver obj){
        observerList.add(obj);
    }
    
    public void remove (DisplayObserver obj){
        observerList.remove(obj);
    }
    
    public void notifyObserver(){
        for (DisplayObserver obj: observerList){
            obj.update();
        }
    }
    
    public void setTemp(int newTemp){
        if (newTemp !=temp){
                notifyObserver();
                
                temp=newTemp;
                }
    }
    
    public int getTemp(){
        return temp;
    }
    
    
   
 
    
}
