
package AbstractFactory;

public class Main {
    
    public static void main(String[] args) {
        AbstractFactory shapeFactory=FactoryProducer.getFactory(true);
        Shape shape1 =shapeFactory.getShape("CIRCLE");
        shape1.draw();
    }
    
}
