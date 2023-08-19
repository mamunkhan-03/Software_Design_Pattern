
package Factory;


public class Main {
    
    public static void main(String[] args) {
        
        ShapeFactory shapefact=new ShapeFactory();
        
        Shape shape=shapefact.getShape("CIRCLE");
        
        shape.draw();
    }
    
}
