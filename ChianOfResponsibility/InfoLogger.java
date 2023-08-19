
package ChianOfResponsibility;


public class InfoLogger extends Logger{
    
    InfoLogger(Logger nextLogger){
        super(nextLogger);
    }
    
    
    public void log(int logLevel, String msg){
        if (logLevel==INFO){
            System.out.println("INFO Logger : "+msg);
        }
        
        else {
            super.log(logLevel, msg);
        }
    }
}
