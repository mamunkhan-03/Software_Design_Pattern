
package Observer;

// observable
public interface WeatherStation {
    
    public void add (DisplayObserver obj );
    
    public void remove (DisplayObserver obj);
    
  
    public void notifyObserver();
    public void setTemp(int newTemp);
    
    public int  getTemp();
            
    
}
