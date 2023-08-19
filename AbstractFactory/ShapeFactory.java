
package AbstractFactory;


public class ShapeFactory  extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        
        switch(shapeType){
            
            case "SQUARE":
                return new Square();
                
            case "RECTANGLE":
                return new Rectangle();
                
            default:
                return null;
        }
        
    
    }
    
}
