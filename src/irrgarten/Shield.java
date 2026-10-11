/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author emart
 */
public class Shield {
    private double protection;
    private int uses;
    
    public Shield(double protection, int uses) {
        this.protection = protection;
        this.uses = uses;
    }
    
    public double protect() {
        double protectionCambio=0;
        if (uses >0) {
            uses--;
            protectionCambio = protection;
        }
        return protectionCambio;
    }
    
    @Override
    public String toString() {
            return "S[" + protection + ", " + uses + "]";
    }

    public boolean discard() {
        return Dice.discardElement(uses);
    }
}
