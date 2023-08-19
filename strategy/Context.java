/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author HP
 */
public class Context {
    
    Strategy obj;
    
    Context(Strategy obj){
        this.obj=obj;
    }
    
    
    public int executeStrategy(int num1, int num2){
        return obj.calculation(num1, num2);
    }
    
}
