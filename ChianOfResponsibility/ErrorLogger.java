
package ChianOfResponsibility;


public class ErrorLogger extends Logger{
    
    ErrorLogger(Logger nextLogger){
        super(nextLogger);
    }
    
    
    public void log(int logLevel, String msg){
        if (logLevel==ERROR){
            System.out.println("Error Logger : "+msg);
        }
        
        else {
            super.log(logLevel, msg);
        }
    }
}
