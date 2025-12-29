package Frames;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Joel
 */

import dataobject.EnemyInfo;
import dataobject.HeroInfo;
import java.util.Random;
import java.lang.InterruptedException;
import java.util.*;
import logic.CharacterFactory;
public class PlayGame implements Perform {              //Abstraction
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    HeroInfo hero = new HeroInfo();
    EnemyInfo enemy = new EnemyInfo();
  
    int baseB, baseE;
    int chargeB, chargeE;
    int skillB, skillE;
    int ssB, ssE;
    int EbaseB, EbaseE;
    int EchargeB, EchargeE;
    int EskillB, EskillE;
    int EssB, EssE;

    private int Checker = 1;
    private int Stage = 1;
    int currentStage = 1;



    public void damage(HeroInfo hero, EnemyInfo enemy) {

        switch (hero.getName()) {
            case "[Naruto Uzumaki]":
            case "[Sasuke Uchiha]":
                baseB = 110;
                baseE = 126;
                chargeB = 40;
                chargeE = 60;
                skillB = 275;
                skillE = 350;
                ssB = 530;
                ssE = 560;
                break;
            case "[Monkey D. Luffy]":
                baseB = 120;
                baseE = 126;
                chargeB = 40;
                chargeE = 60;
                skillB = 280;
                skillE = 350;
                ssB = 500;
                ssE = 560;

                break;
            case "[Gojo Saturo]":
                baseB = 120;
                baseE = 126;
                chargeB = 40;
                chargeE = 60;
                skillB = 300;
                skillE = 350;
                ssB = 550;
                ssE = 560;
                break;
            case "[Madara Uchiha]":
                baseB = 112;
                baseE = 126;
                chargeB = 40;
                chargeE = 60;
                skillB = 280;
                skillE = 350;
                ssB = 540;
                ssE = 560;
                break;
            case "[Megumi Fushiguro]":
                baseB = 112;
                baseE = 126;
                chargeB = 40;
                chargeE = 60;
                skillB = 260;
                skillE = 350;
                ssB = 535;
                ssE = 560;
                break;
            case "[Sukuna (King of Curses)]":
                baseB = 112;
                baseE = 126;
                chargeB = 40;
                chargeE = 60;
                skillB = 290;
                skillE = 350;
                ssB = 545;
                ssE = 560;
                break;
            case "[Pain (Akatsuki)]":
                baseB = 115;
                baseE = 126;
                chargeB = 40;
                chargeE = 60;
                skillB = 290;
                skillE = 350;
                ssB = 550;
                ssE = 560;
                break;

        }
        switch (enemy.getName()) {
            case "[Naruto Uzumaki]":
            case "[Sasuke Uchiha]":
                EbaseB = 110;
                EbaseE = 126;
                EchargeB = 40;
                EchargeE = 60;
                EskillB = 275;
                EskillE = 350;
                EssB = 530;
                EssE = 560;
                break;
            case "[Monkey D. Luffy]":
                EbaseB = 120;
                EbaseE = 126;
                EchargeB = 40;
                EchargeE = 60;
                EskillB = 280;
                EskillE = 350;
                EssB = 500;
                EssE = 560;
                break;
            case "[Gojo Saturo]":
                EbaseB = 120;
                EbaseE = 126;
                EchargeB = 40;
                EchargeE = 60;
                EskillB = 300;
                EskillE = 350;
                EssB = 550;
                EssE = 560;
                break;
            case "[Madara Uchiha]":
                EbaseB = 112;
                EbaseE = 126;
                EchargeB = 40;
                EchargeE = 60;
                EskillB = 280;
                EskillE = 350;
                EssB = 540;
                EssE = 560;
                break;
            case "[Megumi Fushiguro]":
                EbaseB = 112;
                EbaseE = 126;
                EchargeB = 40;
                EchargeE = 60;
                EskillB = 260;
                EskillE = 350;
                EssB = 535;
                EssE = 560;
                break;
            case "[Sukuna (King of Curses)]":
                EbaseB = 112;
                EbaseE = 126;
                EchargeB = 40;
                EchargeE = 60;
                EskillB = 290;
                EskillE = 350;
                EssB = 545;
                EssE = 560;
                break;
            case "[Pain (Akatsuki)]":
                EbaseB = 115;
                EbaseE = 126;
                EchargeB = 40;
                EchargeE = 60;
                EskillB = 290;
                EskillE = 350;
                EssB = 550;
                EssE = 560;
                break;
        }
    }

    public void fight(HeroInfo hero, EnemyInfo enemy) throws InterruptedException {

        String text = "In 3 2 1 FIGHT!!!";
        int delayInMillis = 0;
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(delayInMillis);
        }
        System.out.println();
        System.out.println();
        while (hero.getCurrentHp() > 0 && enemy.getCurrentHp() > 0) {
            statsDisplay(hero, enemy);
            displaySKills(hero);

            System.out.println();
            System.out.print("Choice: ");
            char choice = sc.next().charAt(0);
            damage(hero,enemy);
            int flag = 0;
            int random;
            switch (choice) {
                case 'Q':
                case 'q':
                    if (hero.getCurrentMana() >= hero.getBaseMana()) {
                        performBaseAttack(hero, enemy);
                    } else {
                        System.out.println("Not enough mana..\n Try another option..");
                        continue;
                    }
                    break;

                case 'W':
                case 'w': performCharge(hero);

                    break;
                case 'E':
                case 'e':
                    if (hero.getCurrentMana() >= hero.getSkillMana()) {
                        performSkillAttack(hero, enemy);
                    } else {
                        System.out.println("Not enough mana..\n Try another option..");
                        continue;
                    }
                    break;
                case 'R':
                case 'r':
                    if (hero.getCurrentMana() >= hero.getSpecialMana()) {
                        performSpecialAttack(hero, enemy);
                    } else {
                        System.out.println("Not enough mana..\n Try another option!..");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid Input..\n Try again!..");
                    continue;
            }
            if (enemy.getCurrentHp() < 0) {
                System.out.println("K.O!!");
                enemy.setCurrentHp(0);
                break;
            }

            int EnemyTurn = rand.nextInt(4) + 1;
            switch (EnemyTurn) {
                case 1:
                    if (enemy.getCurrentMana() >= enemy.getBaseMana()) {
                        random = rand.nextInt(EbaseE - EbaseB + 1) + EbaseB;
                        hero.setCurrentHp(hero.getCurrentHp() - random);
                        enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getBaseMana());
                        System.out.println("Your opponent have used " + "[" + enemy.getBaseAttack() + "]");
                        System.out.println(enemy.getBaseAttackDescription() + " \nDamage: " + random + " Dmg");
                        System.out.println();
                    } else {
                        random = rand.nextInt(EchargeE - EchargeB + 1) + EchargeB;
                        if (enemy.getCurrentMana() < enemy.getMaxMana()) {
                            enemy.setCurrentMana(enemy.getCurrentMana() + random);
                            if (enemy.getCurrentMana() > enemy.getMaxMana()) {
                                enemy.setCurrentMana(enemy.getMaxMana());
                            }
                        }
                        System.out.println("Your opponent have used " + "[" + enemy.getRecharge() + "]" + " +" + random + " Mana");
                        System.out.println();
                    }
                    break;
                case 2:
                    random = rand.nextInt(EchargeE - EchargeB + 1) + EchargeB;
                    if (enemy.getCurrentMana() < enemy.getMaxMana()) {
                        enemy.setCurrentMana(enemy.getCurrentMana() + random);
                        if (enemy.getCurrentMana() > enemy.getMaxMana()) {
                            enemy.setCurrentMana(enemy.getMaxMana());
                        }
                    }
                    System.out.println("Your opponent have used " + "[" + enemy.getRecharge() + "]" + " +" + random + " Mana");
                    System.out.println();
                    break;
                case 3:
                    if (enemy.getCurrentMana() >= enemy.getSkillMana()) {
                        random = rand.nextInt(EskillE - EskillB + 1) + EskillB;
                        hero.setCurrentHp(hero.getCurrentHp() - random);
                        enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getSkillMana());
                        System.out.println("Your opponent have used " + "[" + enemy.getSkillAttack() + "]");
                        System.out.println(enemy.getSkillAttackDescription() + " \nDamage: " + random + " Dmg");
                        System.out.println();
                    } else if (enemy.getCurrentMana() >= enemy.getBaseMana()) {
                        random = rand.nextInt(EbaseE - EbaseB + 1) + EbaseB;
                        hero.setCurrentHp(hero.getCurrentHp() - random);
                        enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getBaseMana());
                        System.out.println("Your opponent have used " + "[" + enemy.getBaseAttack() + "]");
                        System.out.println(enemy.getBaseAttackDescription() + " \nDamage: " + random + " Dmg");
                        System.out.println();
                    } else {
                        random = rand.nextInt(EchargeE - EchargeB + 1) + EchargeB;
                        if (enemy.getCurrentMana() < enemy.getMaxMana()) {
                            enemy.setCurrentMana(enemy.getCurrentMana() + random);
                            if (enemy.getCurrentMana() > enemy.getMaxMana()) {
                                enemy.setCurrentMana(enemy.getMaxMana());
                            }
                        }
                        System.out.println("Your opponent have used " + "[" + enemy.getRecharge() + "]" + " +" + random + " Mana");
                        System.out.println();
                    }
                    break;
                case 4:
                    if (enemy.getCurrentMana() >= enemy.getSpecialMana()) {
                        random = rand.nextInt(EssE - EssB + 1) + EssB;
                        hero.setCurrentHp(hero.getCurrentHp() - random);
                        enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getSpecialMana());
                        System.out.println("Your opponent have used " + "[" + enemy.getSpecialAttack() + "]");
                        System.out.println(enemy.getSpecialAttackDescription() + " \nDamage: " + random + " Dmg");
                        System.out.println();
                    } else if (enemy.getCurrentMana() >= enemy.getSkillMana()) {
                        random = rand.nextInt(EskillE - EskillB + 1) + EskillB;
                        hero.setCurrentHp(hero.getCurrentHp() - random);
                        enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getSkillMana());
                        System.out.println("Your opponent have used " + "[" + enemy.getSkillAttack() + "]");
                        System.out.println(enemy.getSkillAttackDescription() + " \nDamage: " + random + " Dmg");
                        System.out.println();
                    } else if (enemy.getCurrentMana() >= enemy.getBaseMana()) {
                        random = rand.nextInt(EbaseE - EbaseB + 1) + EbaseB;
                        hero.setCurrentHp(hero.getCurrentHp() - random);
                        enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getBaseMana());
                        System.out.println("Your opponent have used " + "[" + enemy.getBaseAttack() + "]");
                        System.out.println(enemy.getBaseAttackDescription() + " \nDamage: " + random + " Dmg");
                        System.out.println();
                    } else {
                        random = rand.nextInt(EchargeE - EchargeB + 1) + EchargeB;
                        if (enemy.getCurrentMana() < enemy.getMaxMana()) {
                            enemy.setCurrentMana(enemy.getCurrentMana() + random);
                            if (enemy.getCurrentMana() > enemy.getMaxMana()) {
                                enemy.setCurrentMana(enemy.getMaxMana());
                            }
                        }
                        System.out.println("Your opponent have used " + "[" + enemy.getRecharge() + "]" + " +" + random + " Mana");
                        System.out.println();
                    }
                    break;
            }
            if (hero.getCurrentHp() < 0) {
                System.out.println("K.O!!");
                hero.setCurrentHp(0);
                break;
            }

        }
        System.out.println("\nHero Hp: " + hero.getCurrentHp() + "\t\t\tEnemy Hp: " + enemy.getCurrentHp());
        System.out.println("Hero Mana: " + hero.getCurrentMana() + "\t\t\tEnemy Mana: " + enemy.getCurrentMana() + "\n");
        if (hero.getCurrentHp() < enemy.getCurrentHp()) {
            System.out.println("You Lost! Try again next time");
            setChecker(0);
            setStage(0);
        } else {
            System.out.println("You Won! Congratulations!");
            setChecker(1);
        }
        System.out.println();

    }

    public void displaySKills(HeroInfo hero) {
        System.out.println("Choose your Attack..");
        System.out.println("[Q] " + hero.getBaseAttack() + " \n    Damage: " + hero.getBaseDmg() + " - 126\n    Mana Cost: " + hero.getBaseMana());
        System.out.println("[W] " + hero.getRecharge());
        System.out.println("[E] " + hero.getSkillAttack() + " \n    Damage: " + hero.getSkillDmg() + " - 350\n    Mana Cost: " + hero.getSkillMana());
        System.out.println("[R] " + hero.getSpecialAttack() + " \n    Damage: " + hero.getSpecialDmg() + " - 560\n    Mana Cost: " + hero.getSpecialMana());

    }

    
    @Override
    public void statsDisplay(HeroInfo hero, EnemyInfo enemy) {
        System.out.println("\n\t\t" + hero.getName() + " V.S " + enemy.getName());
        System.out.println("\nHero Hp: " + hero.getCurrentHp() + "\t\t\tEnemy Hp: " + enemy.getCurrentHp());
        System.out.println("Hero Mana: " + hero.getCurrentMana() + "\t\t\tEnemy Mana: " + enemy.getCurrentMana() + "\n");
    }

   
    @Override
    public void performBaseAttack(HeroInfo hero, EnemyInfo enemy) {
        int random;
            random = rand.nextInt(baseE - baseB + 1) + baseB;
            enemy.setCurrentHp(enemy.getCurrentHp() - random);
            hero.setCurrentMana(hero.getCurrentMana() - hero.getBaseMana());
            if (hero.getCurrentMana() < 0) {
                hero.setCurrentMana(0);
            }
            System.out.println("You have used " + "[" + hero.getBaseAttack() + "]");
            System.out.println(hero.getBaseAttackDescription() + " \nDamage: " + random + " Dmg");
            System.out.println();
    }
    
    @Override
    public void performCharge(HeroInfo hero) {
        int random;
        random = rand.nextInt(chargeE - chargeB + 1) + chargeB;
        hero.setCurrentMana(hero.getCurrentMana() + random);
        System.out.println("You have used " + "[" + hero.getRecharge() + "] +" + random + " Mana");
        System.out.println();
        if (hero.getCurrentMana() > hero.getMaxMana()) {
            hero.setCurrentMana(hero.getMaxMana());
        }
    }

    
    @Override
    public void performSkillAttack(HeroInfo hero, EnemyInfo enemy) {
        int random;
            random = rand.nextInt(skillE - skillB + 1) + skillB;
            enemy.setCurrentHp(enemy.getCurrentHp() - random);
            hero.setCurrentMana(hero.getCurrentMana() - hero.getSkillMana());
            System.out.println("You have used " + "[" + hero.getSkillAttack() + "]");
            System.out.println(hero.getSkillAttackDescription() + " \nDamage: " + random + " Dmg");
            System.out.println();
            if (hero.getCurrentMana() < 0) {
                hero.setCurrentMana(0);
            }
    }

    
    @Override
    public void performSpecialAttack(HeroInfo hero, EnemyInfo enemy) {
        int random;
            random = rand.nextInt(ssE - ssB + 1) + ssB;
            enemy.setCurrentHp(enemy.getCurrentHp() - random);
            hero.setCurrentMana(hero.getCurrentMana() - hero.getSpecialMana());
            System.out.println("You have used " + "[" + hero.getSpecialAttack() + "]");
            System.out.println(hero.getSpecialAttackDescription() + " \nDamage: " + random + " Dmg");
            System.out.println();
            if (hero.getCurrentMana() < 0) {
                hero.setCurrentMana(0);
            }
    }

    public int getChecker() {
        return Checker;
    }
    public void setChecker(int Checker) {
        this.Checker=Checker;
    }

    public int getStage() {
        return Stage;
    }

    public void setStage(int stage) {
        Stage = stage;
    }

    @Override
    public void EperformBaseAttack(HeroInfo hero, EnemyInfo enemy) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void EperformCharge(EnemyInfo enemy) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void EperformSkillAttack(HeroInfo hero, EnemyInfo enemy) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void EperformSpecialAttack(HeroInfo hero, EnemyInfo enemy) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



