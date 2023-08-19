
package AbstractFactory;

public class FactoryProducer {
    
   public static AbstractFactory getFactory(boolean rounded){   
      if(rounded){
         return new RoundShapeFactory();         
      }else if(!rounded){
         return new ShapeFactory();
      }
      
      else {
          return null;
      }
   }
    
}
