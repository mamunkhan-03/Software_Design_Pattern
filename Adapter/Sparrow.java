
package Adapter;


public class Sparrow implements Bird {

    @Override
    public void fly() {
        
        System.out.println("Sparrow can fly");
      
    }

    @Override
    public void makeSound() {
        System.out.println(" make sound");
        
    }
    
}
