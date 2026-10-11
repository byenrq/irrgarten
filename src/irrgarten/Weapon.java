/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author emart
 */
public class Weapon {
    private double power;
    private int uses;
    
    public Weapon(double power, int uses) {
        this.power = power;
        this.uses = uses;
    }
    
    public double attack(){
        double powerCambio=0;
        if (uses >0) {
            uses--;
            powerCambio = power;
        }
        return powerCambio;
    }
    
    @Override
    public String toString() {
            return "W[" + power + ", " + uses + "]";
    }
    
    public boolean discard() {
        return Dice.discardElement(uses);
    }
}
