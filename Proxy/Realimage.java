
package Proxy;


public class Realimage implements Image {
    
   private String fileName;
   
   Realimage(String fileName){
       this.fileName=fileName;
       loadFromDisk(fileName);
   }

    @Override
    public void display() {
        
        System.out.println("Displaying : "+fileName);
    
    }
    
    public void loadFromDisk(String fileName){
        
        System.out.println("Loading : "+fileName);
    }
   
   
   
    
}
