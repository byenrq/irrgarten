/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.Random;

/**
 *
 * @author emart
 */
public class Dice {
    private static int MAX_USES = 5;
    private static double MAX_INTELLIGENCE = 10.0;
    private static double MAX_STRENGTH = 10.0;
    private static double RESURRECT_PROB = 0.3;
    private static int WEAPONS_REWARD = 2;
    private static int SHIELDS_REWARD = 3;
    private static int HEALTH_REWARD = 5;
    private static int MAX_ATTACK = 3;
    private static int MAX_SHIELD = 3;
    
private static final Random generator = new Random();
 
    public static int randomPos(int max) {
        return generator.nextInt(max);
    }
 
    public static int whoStarts(int nplayers) {
        return generator.nextInt(nplayers);
    }
 
    public static double randomIntelligence() {
        return generator.nextFloat() * MAX_INTELLIGENCE;
    }
 
    public static double randomStrength() {
        return generator.nextFloat() * MAX_STRENGTH;
    }
 
    public static boolean resurrectPlayer() {
        return generator.nextFloat() < RESURRECT_PROB;
    }
 
    public static int weaponsReward() {
        return generator.nextInt(WEAPONS_REWARD + 1);
    }
 
    public static int shieldsReward() {
        return generator.nextInt(SHIELDS_REWARD + 1);
    }
 
    public static int healthReward() {
        return generator.nextInt(HEALTH_REWARD + 1);
    }
 
    public static float weaponPower() {
        return generator.nextFloat() * MAX_ATTACK;
    }
 
    public static double shieldPower() {
        return generator.nextFloat() * MAX_SHIELD;
    }
 
    public static int usesLeft() {
        return generator.nextInt(MAX_USES + 1);
    }
 
    public static double intensity(float competence) {
        return generator.nextFloat() * competence;
    }
 
    public static boolean discardElement(int usesLeft) {
        float prob = (float) (MAX_USES - usesLeft) / MAX_USES;
        return generator.nextFloat() < prob;
    }
}

