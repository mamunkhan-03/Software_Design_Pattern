
package visitor;


public class VistorMamun implements Visitor {

    @Override
    public int visit(Car car) {
        int cost=1000;
        if (car.getColor()=="Black"){
            
            cost+=100;     
            
        }
        
        else {
            cost=cost;
        }
        System.out.println("Total cost of Car is : "+cost+" where base cost was : 1000");
        
      
        return cost;
               
    }

    @Override
    public int visit(Bike bike) {
        
        int cost=500;
        
        if (bike.getQualityRating()>8){
            cost+=200;
        }
        
        System.out.println("Total cost of Bike is : "+cost+" where base cost was : 500");
        return cost;
            }

    @Override
    public int visit(Bus bus) {
        
        int cost=2000;
        
        if(bus.getNumberOfSeat()>42){
            cost+=500;
        }
        
        System.out.println("Total cost of Bus is : "+cost+" where base cost was : 2000");
        
        return cost;
       
    
    }
    
    
    
}
