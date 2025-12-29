
import dataobject.EnemyInfo;
import Frames.*;
import dataobject.HeroInfo;
import java.util.Random;
import java.util.Scanner;
import logic.CharacterBackground;
import logic.CharacterFactory;
/*
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Welcome welcomeFrame = new Welcome();
        EnterName enterNameFrame = new EnterName();
        Homepage homePageFrame = new Homepage(enterNameFrame.getName());
        //SelectionFrame selectionFrame = new SelectionFrame();
        
        
        
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        welcomeFrame.setVisible(true);
        Leaderboard leaderboard = new Leaderboard();
        String userName = "";
        
        int flag = 0;
        boolean continuePlaying = true; // updated 01/05/2024 - kenji

        while (continuePlaying) { //updated 01/05/2024 -kenji
            if (flag == 0) {
                System.out.print("Enter your name: ");
                userName = scanner.nextLine();
                leaderboard.addPlayer(userName);
                System.out.println("\nWelcome to the Game " + userName + "!");
                System.out.println("\nPress any key to Start...");
                scanner.nextLine();
            }

            int heroInput;
            while (true) {
                //selectionFrame.setVisible(true);
                
                //heroInput= selectionFrame.getHeroSelected();
                //System.out.print(heroInput);
                CharacterFactory objInfo = new CharacterFactory(); // instantiate obj for CharFactory

                HeroInfo hero = objInfo.initHeroAttributes(heroInput); // initialize hero]

                CharacterBackground objBackHero = new HeroInfo(); // Polymorphism 1
                System.out.println("\nHero Info:");
                //objBackHero.displayBackground(hero);
                System.out.println();
                System.out.println();
                objInfo.displayInfo(hero); // displays hero information
                
                // Track the highest stage reached
                int highestStageReached = 0;

                while (true) {
                  
                        EnemyInfo enemy = objInfo.initEnemyAttributes(5); // initialize opponent
                        System.out.println("\nOpponent Info:");
                        CharacterBackground objBackEnemy = new EnemyInfo(); // Polymorphism 2
                       // objBackEnemy.displayBackground(enemy);
                        System.out.println();
                        objInfo.displayInfo(enemy);

                        PlayGame game = new PlayGame();
                        while (game.getStage() != 0) {
                            // game.damage(hero, enemy);
                            game.setStage(1);
                            System.out.println("Stage " + game.getStage());
                            // stage 1
                            game.fight(hero, enemy);
                            
                            // Update highestStageReached if the current stage is higher
                            if (game.getStage() > highestStageReached) {
                                highestStageReached = game.getStage();
                            }
                            if (hero.getCurrentHp() == 0) {
                                break;
                            }
                            // stage 2
                            game.setStage(2);
                            System.out.println("Stage " + game.getStage());
                            hero.setCurrentHp(hero.getMaxHp());
                            hero.setCurrentMana(hero.getMaxMana());
                            enemy = objInfo.initEnemyAttributes(5);
                            game.fight(hero, enemy);
                            if (game.getStage() > highestStageReached) {
                                highestStageReached = game.getStage();
                            }
                            if (hero.getCurrentHp() == 0) {
                                break;
                            }
                            // stage 3
                            game.setStage(3);
                            System.out.println("Stage " + game.getStage());
                            hero.setCurrentHp(hero.getMaxHp());
                            hero.setCurrentMana(hero.getMaxMana());
                            enemy = objInfo.initEnemyAttributes(7);
                            game.fight(hero, enemy);
                            if (game.getStage() > highestStageReached) {
                                highestStageReached = game.getStage();
                            }
                            if (hero.getCurrentHp() == 0) {
                                break;
                            }
                            break;

                        }

                        // Update the player's stage with the highest stage reached
                        leaderboard.updatePlayerStage(userName, highestStageReached);

                        break;
                }
                leaderboard.displayLeaderboard();

                // Error handling loop
                boolean isValidInput = false;
                int count = 2;
                flag = 0;
                while (!isValidInput) {
                    System.out.println("Would you like to play again? [Y/N]");

                    char ans = scanner.next().charAt(0);
                    scanner.nextLine(); // Consume newline character

                    int random = rand.nextInt(3) + 1;

                    switch (ans) {
                        case 'Y':
                        case 'y':
                            System.out.print("Enter your name: ");
                            userName = scanner.nextLine(); // Input new name
                            leaderboard.addPlayer(userName);
                            System.out.println("\nWelcome to the Game " + userName + "!");
                            switch (random) {
                                case 1:
                                    System.out.println("\nThat's the spirit!\nFighting Spirit: Mode ON");
                                    System.out.println();
                                    break;
                                case 2:
                                    System.out.println("\nGame on! Get ready to dive back into the game");
                                    System.out.println();
                                    break;
                                case 3:
                                    System.out.println("\nTatakae! Tatakae!");
                                    System.out.println();
                                    break;
                            }
                            isValidInput = true;
                            break;
                        case 'N':
                        case 'n':
                            flag = 1;
                            continuePlaying = false; // updated 01/05/2024 - kenji
                            isValidInput = true;
                            break;
                        default:
                            System.out.println("Invalid input..");
                            break;
                    }
                }
                if (flag == 1) {
                    break; // Exit the main loop if the user chooses not to play again
                }
            }
        }
        System.out.println("Goodbye, have a nice day!..."); //updated 01/05/2024 - kenji
    }
}
*/