
package ChianOfResponsibility;

public class Main {
    
    public static void main(String[] args) {
        
        Logger logObj=new InfoLogger(new DebugLogger(new ErrorLogger(null)) );
        
        
        
         logObj.log(Logger.ERROR, "mamun khan");
        logObj.log(Logger.INFO, "mamun khan");
        logObj.log(Logger.DEBUG, "mamun khan");
       
        
        
    }
    
}
