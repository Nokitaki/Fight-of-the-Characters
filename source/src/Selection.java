/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Philip
 */
import java.util.Random;

public abstract class Selection {
    Random rand = new Random();
    String name;
    int maxHP;
    int maxMana;
    int currentHp;
    int currentMana;


    public abstract void performBasicAttack(Selection enemy);
    public abstract void performRecharge();
    public abstract void performSkill(Selection enemy);
    public abstract void performSpecialSkill(Selection enemy);
    public abstract void chooseAction(Selection hero);

    public void displayInfo() {
        System.out.println("logic.Character: " + name + "\nMaximum HP: " + maxHP + "\nMaximum Mana: " + maxMana);
        // Display specific character skills and details here...
    }
}