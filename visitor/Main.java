
package visitor;

public class Main {
    
    private static int calculateTotal(Vehicle [] vehicles){
        
        Visitor vi=new VistorMamun();
          int total = 0;  
        for(Vehicle vehicle : vehicles){  
            total = total + vehicle.accept(vi);  
        }  
        return total;  
        
    }


    public static void main(String[] args) {
        
        Vehicle[] vehicles=new  Vehicle[] {
            new Car("Black"), 
            new Bike("TVS", 9),
            new Bus(55,"GreenLine")
        };
        
        int totalCost=calculateTotal(vehicles);
        System.out.println("Total cost : "+totalCost);
    }
    
}














/*

public class Main {
    
 private static int costCalculate(Vehicle [] vehicles){
     int total=0;
     
     Visitor vi= new VistorMamun();
     
    for(Vehicle v:vehicles){
        total=total+v.accept(vi);
    }
        return total;
    }
    
    
    
    
    public static void main(String[] args) {
       
        

 Vehicle[] vehicles=new  Vehicle[] {
            new Car("Black"),
            new Bike("TVS", 9),
            new Bus(55, "Greenline")
        };
 
 int totalCost=costCalculate(vehicles);
        System.out.println("Total Cost is : "+totalCost);
    
    
    }
    
}*/