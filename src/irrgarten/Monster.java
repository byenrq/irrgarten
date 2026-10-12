/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author emart
 */
public class Monster {
    private static int INITIAL_HEALTH = 5;
    private String name;
    private double intelligence;
    private double strength;
    private double health;
    private int row;
    private int col;
    
    //Constructor
    public Monster(String name, double intelligence, double strength){
        this.name = name;
        this.intelligence = intelligence;
        this.strength = strength;
        health = INITIAL_HEALTH;
        //aún no está en ningún lado
        row = -1;
        col = -1;
    }
    
    //método que devuelve true si está muerto
    public boolean dead() {
        boolean valor = false;
        if (health <= 0.0) {
            valor = true;
        }
        return valor;
    }
    
    public float attack() {
        return Dice.intensity(strength);  
    }
    
    public float defend() {
        throw new UnsupportedOperationException();
    }
    
    public setPos(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    @Override
    public  String toString(){
        return "M[" + name + ", I: " + intelligence + ", S: " + strength + ", H: " + health + "POS [" + row + ", " + col + "]]";
    }
}

