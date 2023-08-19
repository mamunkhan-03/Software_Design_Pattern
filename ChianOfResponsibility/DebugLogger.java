
package ChianOfResponsibility;


public class DebugLogger extends Logger{
    
    DebugLogger(Logger nextLogger){
        super(nextLogger);
    }
    
    
    public void log(int logLevel, String msg){
        if (logLevel==DEBUG){
            System.out.println("Debug Logger : "+msg);
        }
        
        else {
            super.log(logLevel, msg);
        }
    }
}
