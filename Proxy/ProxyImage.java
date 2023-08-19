/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

/**
 *
 * @author HP
 */
public class ProxyImage implements Image {
    
    
    String fileName;
    Realimage realImage;
    
    public ProxyImage(String fileName){
        
        this.fileName=fileName;
        
    }

    @Override
    public void display() {
       if (realImage==null){
        
           realImage=new Realimage(fileName);
       }
       
       realImage.display();
    
    }
    
    
    
    
}
