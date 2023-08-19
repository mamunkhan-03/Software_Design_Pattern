
package Observer;

public class Main {
    
    public static void main(String[] args) {
        
        WeatherStation observableObj=new WSobservable();
        
        DisplayObserver display1=new MobileDisplayObserver();
        DisplayObserver display2=new MobileDisplayObserver();
        DisplayObserver display3=new MobileDisplayObserver();
        DisplayObserver display4=new TVDisplayObserver();
        DisplayObserver display5=new TVDisplayObserver();
        DisplayObserver display6=new TVDisplayObserver();
        
        
        observableObj.add(display1);
        observableObj.add(display2);
        observableObj.add(display3);
        observableObj.add(display4);
        observableObj.add(display5);
        observableObj.add(display6);
        
        
         observableObj.setTemp(10);
        
        
    }
    
}
