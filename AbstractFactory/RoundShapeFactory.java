
package AbstractFactory;


public class RoundShapeFactory extends AbstractFactory {
    
     Shape getShape(String shapeType) {
        
        switch(shapeType){
            
            case "ROUNDSQUARE":
                return new RoundSquare();
                
            case "ROUNDRECTANGLE":
                return new RoundRectangle();
                
            default:
                return null;
        }
        
    
    }
    
}
