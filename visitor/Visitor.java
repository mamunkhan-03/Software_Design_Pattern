
package visitor;


public interface Visitor {
    
    public int visit(Car car);
    public int visit(Bike bike);
    public int visit(Bus bus);
    
    
    
}
