/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author HP
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Context t=new Context(new Addition());
        System.out.println(t.executeStrategy(10, 20));
    }
    
}
