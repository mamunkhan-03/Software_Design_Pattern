
package visitor;

public class Car implements Vehicle{
    
    private String color;
    
    
    public Car(String color){
        this.color=color;
    }
    
    public String getColor() {
       return color;
    }
    
    
    public int accept(Visitor vi){
      return  vi.visit(this);
    }

    
    
}
