
package Observer;


public class TVDisplayObserver implements DisplayObserver {
    
    public void update(){
        System.out.println("Temperature updated that is seen by TV display");
    }
    
}
