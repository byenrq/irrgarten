/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.ArrayList;
/**
 *
 * @author emart
 */
public class Player {
    private static final int MAX_WEAPONS = 2;
    private static final int MAX_SHIELDS = 3;
    private static final int INITIAL_HEALTH = 10;
    private static final int HITS2LOSE = 3;
    private String name;
    private int number;
    private float intelligence;
    private float strength;
    private float health;
    private int row;
    private int col;
    private int consecutiveHits;
    
    private ArrayList<Weapon> weapons;
    private ArrayList<Shield> shields;
    
    public Player(int number, float intelligence, float strength) {
        this.number = number;
        this.name = "Player #" + number;
        this.intelligence = intelligence;
        this.strength = strength;
        this.health = INITIAL_HEALTH;
        this.row = 0;
        this.col = 0;
        this.consecutiveHits = 0;
        this.weapons = new ArrayList<>();
        this.shields = new ArrayList<>();
    }
    
        public void resurrect() {
        weapons = new ArrayList<>();
        shields = new ArrayList<>();
        health = INITIAL_HEALTH;
        consecutiveHits = 0;
    }
        
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getNumber() {
        return number;
    }

    public void setPos(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean dead() {
        boolean valor = false;
        if (health <= 0.0) {
            valor = true;
        }
        return valor;
    }

    public Directions move(Directions direction, ArrayList<Directions> validMoves) {
        throw new UnsupportedOperationException();
    }

    public float attack() {
        return strength + sumWeapons();
    }

    public boolean defend(float receivedAttack) {
        return manageHit(receivedAttack);
    }

    public void receiveReward() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "P[" + name + ", intelligence=" + intelligence + ", strength=" + strength + ", health=" + health + ", pos=[" + row + "," + col + "]""]";
    }

    private void receiveWeapon(Weapon w) {
        throw new UnsupportedOperationException();
    }

    private void receiveShield(Shield s) {
        throw new UnsupportedOperationException();
    }

    private Weapon newWeapon() {
        return new Weapon(Dice.weaponPower(), Dice.usesLeft());
    }

    private Shield newShield() {
        return new Shield(Dice.shieldPower(), Dice.usesLeft());
    }

    private float sumWeapons() {
        float sum = 0;
        for (Weapon w : weapons) {
            sum += w.attack();
        }
        return sum;
    }

    private float sumShields() {
        float sum = 0;
        for (Shield s : shields) {
            sum += s.protect();
        }
        return sum;
    }

    private float defensiveEnergy() {
        return intelligence + sumShields();
    }

    private boolean manageHit(float receivedAttack) {
        throw new UnsupportedOperationException();   // P3
    }

    private void resetHits() {
        consecutiveHits = 0;
    }

    private void gotWounded() {
        health--;
    }

    private void incConsecutiveHits() {
        consecutiveHits++;
    }
}
}
