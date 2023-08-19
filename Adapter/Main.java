
package Adapter;

public class Main {
    
    public static void main(String[] args) {
        
        Sparrow sparrow=new Sparrow();
        
        ToyDuck toyDuck=new PlasticToyDuck();
        
        ToyDuck birdAdapter =new BirdAdapter(sparrow);
        
        System.out.println("For Sparrow ");
        sparrow.fly();
        sparrow.makeSound();
        
        System.out.println("For Plastic Toy Duck");
        toyDuck.squeak();
        
        System.out.println("Using Apadapter");
        birdAdapter.squeak();
    }
    
}
