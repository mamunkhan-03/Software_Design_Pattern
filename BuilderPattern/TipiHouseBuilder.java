/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderPattern;

/**
 *
 * @author HP
 */
public class TipiHouseBuilder {
    
    private House house;
  
    public TipiHouseBuilder() 
    {
        this.house = new House();
    }
  
    public void buildBasement() 
    {
        house.setBasement("Wooden Poles");
    }
  
    public void buildStructure() 
    {
        house.setStructure("Wood and Ice");
    }
  
    public void buildInterior() 
    {
        house.setInterior("Fire Wood");
    }
  
    public void buildRoof() 
    {
        house.setRoof("Wood, caribou and seal skins");
    }
  
    public House getHouse() 
    {
        return this.house;
    }
    
}
