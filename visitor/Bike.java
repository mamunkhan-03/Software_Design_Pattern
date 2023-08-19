
package visitor;


public class Bike implements Vehicle {
    
    private String company;
   private int qualityRating;
   
   public Bike(String company, int qualityRating){
       this.company=company;
       this.qualityRating=qualityRating;
       
    
   }
   
   public String getCompany(){
       return company;
       
   }
    
   public int getQualityRating(){
       return qualityRating;
       
   }
   
   public int accept(Visitor vi){
       return vi.visit(this);
   }

  
    
    
    
}
