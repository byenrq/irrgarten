/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author emart
 */
public class TestP1 {
    public static void main(String[] args) {
        System.out.println("Enumerados: " + Directions.LEFT + " " + Orientation.VERTICAL + " " + GameCharacter.PLAYER);
 
        Weapon w = new Weapon(2.0, 1);
        System.out.println("Arma: " + w + " | ataque: " + w.attack() + " | después: " + w + " | ¿descartar?: " + w.discard());
 
        Shield s = new Shield(3.0, 1);
        System.out.println("Escudo: " + s + " | protección: " + s.protect() + " | después: " + s + " | ¿descartar?: " + s.discard());
 
        GameState gs = new GameState("lab", "players", "monsters", 0, false, "log");
        System.out.println("Estado: laberinto=" + gs.getLabyrinth() + ", jugador actual=" + gs.getCurrentPlayer() + ", ganador=" + gs.getWinner());
 
        int resurrect = 0;
        for (int i = 0; i < 100; i++) {
            if (Dice.resurrectPlayer()) resurrect++;
        }
        System.out.println("Resurrecciones: " + resurrect + "/100 (esperado ~30)");
        System.out.println("Potencia de arma: " + Dice.weaponPower() + " | usos restantes: " + Dice.usesLeft());
    }
}