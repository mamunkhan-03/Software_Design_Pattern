
package Adapter;


public class BirdAdapter implements ToyDuck{
    
    Bird bird;
    
    BirdAdapter(Bird bird){
        this.bird=bird;
    }
    
    public void squeak(){
        bird.makeSound();
    }
}
