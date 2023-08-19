
package visitor;

public class Bus implements Vehicle {
    
    private int numberOfSeat;
    private String company;
    
   public Bus (int numberOfseat, String company){
        this.numberOfSeat=numberOfSeat;
        this.company=company;
    }
    
    public int getNumberOfSeat(){
        return numberOfSeat;
    }
    
    public String getCompany(){
        return company;
    }
    
    public int accept(Visitor vi){
        return vi.visit(this);
    }
    
}
