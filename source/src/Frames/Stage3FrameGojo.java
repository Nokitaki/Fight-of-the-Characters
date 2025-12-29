/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import dataobject.EnemyInfo;
import dataobject.HeroInfo;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import logic.CharacterFactory;

/**
 *
 * @author Philip
 */
public class Stage3FrameGojo extends javax.swing.JFrame implements PerformAnimation, Perform {

    private ImageIcon[]  Maps;
    private int heroCurrentImageIndex, enemyCurrentImageIndex, attackCurrentImageIndex;
    private Timer heroAnimationTimer, enemyAnimationTimer, mapAnimationTimer, raikiriTimer;
    private ImageIcon EnemyDamagedEffect, HeroDamagedEffect;
    private int heroSelected, enemySelected;
    private int currentLabelIndex;
    Random rand = new Random();
    int mapIndex = rand.nextInt(4);

    int baseB, baseE;
    int chargeB, chargeE;
    int skillB, skillE;
    int ssB, ssE;
    int EbaseB, EbaseE;
    int EchargeB, EchargeE;
    int EskillB, EskillE;
    int EssB, EssE;
    
    private int Checker = 1;
    private int Stage = 3;
    int currentStage = 1;
    
    
    LeaderboardClass leaderboard = new LeaderboardClass();
    EnterName en = new EnterName();
    Homepage hp = new Homepage(en.getName());
    
    //HERO INSTANTIATE
    CharacterFactory objInfo = new CharacterFactory();
    HeroInfo hero = objInfo.initHeroAttributes(4);
    EnemyInfo enemy = objInfo.initEnemyAttributes(7);
    
    LeaderboardUpdate ldu = new LeaderboardUpdate();
    private String playerName;  

    public Stage3FrameGojo(String name) {
        this.playerName = name;
        initComponents();
        initializeAnimation();
        addKeyListener(new AttackKeyListener());
        setFocusable(true);
        setSize(960, 720); // Set the size of the JFrame to 800x600
        setResizable(false); // Make the JFrame non-resizable
        centerFrame();
    }
    
     private void centerFrame() {
        // Get the screen dimension
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the center position based on the frame size
        int centerX = (int) ((screenSize.getWidth() - getWidth()) / 2);
        int centerY = (int) ((screenSize.getHeight() - getHeight()) / 2);

        // Set the frame location to the center of the screen
        setLocation(centerX, centerY);
    }
    

    private void initializeAnimation() {
        // Load all the stance images

        Maps = new ImageIcon[]{
            new ImageIcon(getClass().getResource("/images/DragonMap.gif")),
            new ImageIcon(getClass().getResource("/images/LavaMap.gif")),
            new ImageIcon(getClass().getResource("/images/MedievalMap.gif")),
            new ImageIcon(getClass().getResource("/images/NightMap.gif")),
            new ImageIcon(getClass().getResource("/images/RainMap.gif"))
        };
        
        
        

        EnemyDamagedEffect = new ImageIcon(getClass().getResource("/Yuji/hit.png"));
        HeroDamagedEffect = new ImageIcon(getClass().getResource("/Gojo/attack1.png"));

        
        enemyCurrentImageIndex = 0;
        heroCurrentImageIndex = 0;

        // Create a timer to change the image every 200 milliseconds
        heroAnimationTimer = new Timer(150, e -> {
            heroCurrentImageIndex = (heroCurrentImageIndex + 1) % hero.getHeroStanceImages().length;
            lblHero.setIcon(hero.getHeroStanceImages()[heroCurrentImageIndex]);
        });

        // Create a timer to change the image every 200 milliseconds
        enemyAnimationTimer = new Timer(150, e -> {
            enemyCurrentImageIndex = (enemyCurrentImageIndex + 1) % enemy.getEnemyStanceImages().length;
            lblEnemy.setIcon(enemy.getEnemyStanceImages()[enemyCurrentImageIndex]);
        });
        
        
     
        lblMap.setIcon(Maps[mapIndex]);
        // Start the animation timer
        heroAnimationTimer.start();
        enemyAnimationTimer.start();

        //
        lblHeroBlinkEffect.setVisible(false);
        lblHeroBasicAttack.setVisible(false);
        lblHeroBasicEffect.setVisible(false);
        lblHeroBasicEffect2.setVisible(false);
        lblHeroChargeEffect.setVisible(false);
        lblHeroSkillEffect.setVisible(false);
        lblHeroSkillEffect2.setVisible(false);
        lblHeroSkillAttack.setVisible(false);
        lblHeroSpecialAttack.setVisible(false);
        lblHeroSpecialEffect.setVisible(false);
        lblHeroSpecialEffect2.setVisible(false);
        lblHeroSpecialAttackTransform.setVisible(false);
        lblHeroSpecialAttackTransform2.setVisible(false);
        
        
        
        lblEnemyBasicAttack.setVisible(false);
        lblEnemySkillAttack.setVisible(false);
        lblEnemySkillEffect.setVisible(false);
        lblEnemyChargeEffect.setVisible(false);
        lblEnemyChargeEffect2.setVisible(false);
        lblEnemySpecialAttack.setVisible(false);
        lblEnemySpecialEffect.setVisible(false);
        lblEnemySpecialEffect2.setVisible(false);
        
        lblEnemyDead.setVisible(false);
        lblHeroDead.setVisible(false);
        
        hero.setCurrentHp(hero.getMaxHp());
        hero.setCurrentMana(hero.getMaxMana());
        
        enemy.setCurrentHp(enemy.getMaxHp());
        enemy.setCurrentMana(enemy.getMaxMana());
        
        lblStageNumber.setText("Stage "+Stage);
        
        lblHeroHp.setText(""+hero.getMaxHp());
        lblEnemyHp.setText(""+enemy.getMaxHp());
        lblHeroMana.setText(""+hero.getMaxMana());
        lblEnemyMana.setText(""+enemy.getMaxMana());
        
        lblHeroName.setText(""+hero.getName());
        lblEnemyName.setText(""+enemy.getName());
                

    }
    public void HeroBlinkEffectAnimation(){
        lblHeroBlinkEffect.setVisible(true);
        attackCurrentImageIndex = 0; // Reset the attack frame index
        lblHeroBlinkEffect.setIcon(hero.getHeroBlinkEffect()[attackCurrentImageIndex]);
        Timer blinkTimer = new Timer(150, e -> {
            if (attackCurrentImageIndex >= hero.getHeroBlinkEffect().length) {
                 lblHeroBlinkEffect.setVisible(false);
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            lblHeroBlinkEffect.setIcon(hero.getHeroBlinkEffect()[attackCurrentImageIndex]);
            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        blinkTimer.start(); // Start the RasenEffect animation timer
    }
    

    @Override
    public void HeroBasicAttackAnimation() {
     lblHero.setVisible(false);
     lblHeroBasicEffect.setVisible(true);
     HeroBasicEffectAnimation();

        
    }
    
    @Override
    public void HeroBasicEffectAnimation() {
        attackCurrentImageIndex = 0; // Reset the attack frame index
        lblHeroBasicEffect.setIcon(hero.getHeroBasicEffect()[attackCurrentImageIndex]);
        Timer explosionTimer = new Timer(200, e -> {
            
            if (attackCurrentImageIndex >= hero.getHeroBasicEffect().length) {
                
                lblHeroBasicEffect.setVisible(false);
                lblHero.setVisible(true);
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }
            
            if(attackCurrentImageIndex==3||attackCurrentImageIndex==4){
                lblEnemy.setIcon(EnemyDamagedEffect);
            }

            // Update hero's label with the current RasenEffect frame
            lblHeroBasicEffect.setIcon(hero.getHeroBasicEffect()[attackCurrentImageIndex]);

            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        explosionTimer.start(); // Start the RasenEffect animation timer
        
    }
    public void HeroBasicEffect2Animation() {
        attackCurrentImageIndex = 0; // Reset the attack frame index
        lblHeroBasicEffect2.setIcon(hero.getHeroBasicEffect2()[attackCurrentImageIndex]);
        lblHeroBasicEffect2.setVisible(true);
        Timer effect2Timer = new Timer(30, e -> {
            lblEnemy.setIcon(EnemyDamagedEffect);
            // Check if all RasenEffect frames have been shown
            if (attackCurrentImageIndex >= hero.getHeroBasicEffect2().length) {
                // If RasenEffect animation is complete, switch back to Hero's stance
                lblHeroBasicEffect2.setVisible(false);
                lblEnemy.setIcon(EnemyDamagedEffect);
                lblHero.setVisible(true);
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }
            

            // Update hero's label with the current RasenEffect frame
            lblHeroBasicEffect2.setIcon(hero.getHeroBasicEffect2()[attackCurrentImageIndex]);

            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        effect2Timer.start(); // Start the RasenEffect animation timer
        
    }
    
    @Override
    public void HeroChargeEffectAnimation() {
        lblHero.setVisible(false);
        lblHeroChargeEffect.setVisible(true);
        attackCurrentImageIndex = 0; // Reset the attack frame index
        
        lblHeroChargeEffect.setIcon(hero.getHeroChargeEffect()[attackCurrentImageIndex]);
        
        Timer chargeHero = new Timer(150, e -> {
            // Check if all RasenEffect frames have been shown
            if (attackCurrentImageIndex >= hero.getHeroChargeEffect().length) {
                // If RasenEffect animation is complete, switch back to Hero's stance
                lblHero.setVisible(true);
                lblHeroChargeEffect.setVisible(false);
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            // Update hero's label with the current RasenEffect frame
            lblHeroChargeEffect.setIcon(hero.getHeroChargeEffect()[attackCurrentImageIndex]);

            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        chargeHero.start(); // Start the RasenEffect animation timer
    }
    
    @Override
    public void HeroSkillAttackAnimation() {
        lblHeroSkillAttack.setVisible(true);
        lblHero.setVisible(false);
        attackCurrentImageIndex = 0; // Reset the attack frame index
        lblHeroSkillAttack.setIcon(hero.getHeroSkillAttack()[attackCurrentImageIndex]);
        Timer skillAttackTimer = new Timer(250, e -> {
            // Check if all attack frames have been shown
            if (attackCurrentImageIndex >= hero.getHeroSkillAttack().length) {
                // If HeroBasicAttack animation is complete, switch to RasenEffect animation

                HeroSkillEffectAnimation();
                
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            // Update hero's label with the current attack frame
            lblHeroSkillAttack.setIcon(hero.getHeroSkillAttack()[attackCurrentImageIndex]);

            // Increment the attack frame index
            attackCurrentImageIndex++;
        });

        skillAttackTimer.start(); // Start the attack animation timer
    }
    
    @Override
    public void HeroSkillEffectAnimation(){
        lblHeroSkillEffect.setVisible(true);
        attackCurrentImageIndex = 0; // Reset the attack frame index
        lblHeroSkillEffect.setIcon(hero.getHeroSkillEffect()[attackCurrentImageIndex]);
        Timer rasenTimer = new Timer(100, e -> {
            
            if (attackCurrentImageIndex >= hero.getHeroSkillEffect().length) {
                // If RasenEffect animation is complete, switch back to Hero's stance
                lblHeroSkillEffect.setVisible(false);
                HeroSkillEffectAnimation2();
                lblEnemy.setIcon(EnemyDamagedEffect);
               
                
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }
               
            // Update hero's label with the current RasenEffect frame
            lblHeroSkillEffect.setIcon(hero.getHeroSkillEffect()[attackCurrentImageIndex]);

            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        rasenTimer.start(); // Start the RasenEffect animation timer
        
    }
    public void HeroSkillEffectAnimation2(){
        lblHeroSkillEffect2.setVisible(true);
        attackCurrentImageIndex = 0; // Reset the attack frame index
        lblHeroSkillEffect2.setIcon(hero.getHeroSkillEffect2()[attackCurrentImageIndex]);
        Timer rasenTimer = new Timer(50, e -> {
            
            if (attackCurrentImageIndex >= hero.getHeroSkillEffect2().length) {
                // If RasenEffect animation is complete, switch back to Hero's stance
                lblHeroSkillAttack.setVisible(false);
                 lblHero.setVisible(true);
                lblHeroSkillEffect2.setVisible(false);
               
                
                lblEnemy.setIcon(EnemyDamagedEffect);
                lblEnemy.setIcon(EnemyDamagedEffect);
                lblEnemy.setIcon(EnemyDamagedEffect);
                lblEnemy.setIcon(EnemyDamagedEffect);
                lblEnemy.setIcon(EnemyDamagedEffect);
                lblEnemy.setIcon(EnemyDamagedEffect);
                lblEnemy.setIcon(EnemyDamagedEffect);
                lblEnemy.setIcon(EnemyDamagedEffect);
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            // Update hero's label with the current RasenEffect frame
            lblHeroSkillEffect2.setIcon(hero.getHeroSkillEffect2()[attackCurrentImageIndex]);

            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        rasenTimer.start(); // Start the RasenEffect animation timer
        
    }
    
   
    
    @Override
    public void HeroSpecialAttackAnimation(){
        lblHero.setVisible(false);
        
        lblHeroSpecialAttack.setVisible(true);
        
        attackCurrentImageIndex = 0; // Reset the attack frame index
        
        lblHeroSpecialAttack.setIcon(hero.getHeroSpecialAttack()[attackCurrentImageIndex]);
       
        
        Timer SpecialattackTimer = new Timer(150, e -> {
            // Check if all attack frames have been shown
            if (attackCurrentImageIndex >= hero.getHeroSpecialAttack().length) {
               lblHeroSpecialAttack.setVisible(false);
                //lblEnemy.setIcon(EnemyDamagedEffect);
                //HeroSpecialAttackTransform();
                //HeroSpecialAttackTransform2();
                HeroSpecialEffectAnimation();
                
                
                Thread raikiriThread = new Thread(() -> {
                try {
                    // Introduce a delay of 200 milliseconds
                    Thread.sleep(1050);
                    // Execute EnemySkillAttackAnimation()
                    lblHero.setVisible(true);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                });
                raikiriThread.start();
                
                ((Timer) e.getSource()).stop(); // Stop the timer
                
                return;
                
            }

            // Update hero's label with the current attack frame
            lblHeroSpecialAttack.setIcon(hero.getHeroSpecialAttack()[attackCurrentImageIndex]);
            
            // Increment the attack frame index
            attackCurrentImageIndex++;
        });

        SpecialattackTimer.start(); // Start the attack animation timer
    
    }
    
    @Override
    public void HeroSpecialEffectAnimation(){
        lblHeroSpecialEffect.setVisible(true);
        attackCurrentImageIndex = 0; // Reset the attack frame index
        lblHeroSpecialEffect.setIcon(hero.getHeroSpecialEffect3()[attackCurrentImageIndex]);
        Timer blastTimer = new Timer(900, e -> {
            // Check if all RasenEffect frames have been shown
            lblEnemy.setIcon(EnemyDamagedEffect);
            if (attackCurrentImageIndex >= hero.getHeroSpecialEffect3().length) {
                lblHeroSpecialEffect.setVisible(false);
                //HeroSpecialEffect2();
  
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }
            if (attackCurrentImageIndex > 0 && attackCurrentImageIndex < 4) {
                
            } 
               

            // Update hero's label with the current RasenEffect frame
            lblHeroSpecialEffect.setIcon(hero.getHeroSpecialEffect3()[attackCurrentImageIndex]);

            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        blastTimer.start(); // Start the RasenEffect animation timer
    }
    public void HeroSpecialAttackTransform(){
        lblHeroSpecialAttackTransform.setVisible(true);
        
        attackCurrentImageIndex = 0; // Reset the attack frame index
        
        lblHeroSpecialAttackTransform.setIcon(hero.getHeroSpecialAttackTransform()[attackCurrentImageIndex]);
       
        
        Timer transformTimer = new Timer(150, e -> {
            // Check if all attack frames have been shown
            if (attackCurrentImageIndex >= hero.getHeroSpecialAttackTransform().length) {
               lblHeroSpecialAttackTransform.setVisible(false);
                
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            // Update hero's label with the current attack frame
            lblHeroSpecialAttackTransform.setIcon(hero.getHeroSpecialAttackTransform()[attackCurrentImageIndex]);
            
            // Increment the attack frame index
            attackCurrentImageIndex++;
        });

        transformTimer.start(); // Start the attack animation timer
        
    }
    
    public void HeroSpecialEffect2(){
        lblHeroSpecialEffect2.setVisible(true);
        attackCurrentImageIndex = 0; // Reset the attack frame index
        
        lblHeroSpecialEffect2.setIcon(hero.getHeroSpecialEffect2()[attackCurrentImageIndex]);
       
        
        Timer effect2Timer = new Timer(150, e -> {
            lblEnemy.setIcon(EnemyDamagedEffect);
            // Check if all attack frames have been shown
            if (attackCurrentImageIndex >= hero.getHeroSpecialEffect2().length) {
               lblHeroSpecialEffect2.setVisible(false);
                //lblEnemy.setIcon(EnemyDamagedEffect);
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            // Update hero's label with the current attack frame
            lblHeroSpecialEffect2.setIcon(hero.getHeroSpecialEffect2()[attackCurrentImageIndex]);
            
            // Increment the attack frame index
            attackCurrentImageIndex++;
        });

        effect2Timer.start(); // Start the attack animation timer
        
    }
    
    
    public void HeroSpecialAttackTransform2(){
        lblHeroSpecialAttackTransform2.setVisible(true);
        
        attackCurrentImageIndex = 0; // Reset the attack frame index
        
        lblHeroSpecialAttackTransform2.setIcon(hero.getHeroSpecialAttackTransform2()[attackCurrentImageIndex]);
       
        
        Timer transform2Timer = new Timer(150, e -> {
            // Check if all attack frames have been shown
            if (attackCurrentImageIndex >= hero.getHeroSpecialAttackTransform2().length) {
                lblHeroSpecialAttackTransform2.setVisible(false);
                //lblEnemy.setIcon(EnemyDamagedEffect);
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            // Update hero's label with the current attack frame
            lblHeroSpecialAttackTransform2.setIcon(hero.getHeroSpecialAttackTransform2()[attackCurrentImageIndex]);
            
            // Increment the attack frame index
            attackCurrentImageIndex++;
        });

        transform2Timer.start(); // Start the attack animation timer
        
    }
    
   

    @Override
    public void EnemyBasicAttackAnimation() {

        lblEnemyBasicAttack.setVisible(true);
        lblEnemy.setVisible(false);

        // Reset the attack frame index
        attackCurrentImageIndex = 0;
        lblEnemyBasicAttack.setIcon(enemy.getEnemyBasicAttack()[attackCurrentImageIndex]);
        Timer enemyAttackTimer = new Timer(100, e -> {

            // Check if all attack frames have been shown
            if (attackCurrentImageIndex >= enemy.getEnemyBasicAttack().length) {
                // If all frames have been shown, switch back to enemy's stance
                lblEnemy.setVisible(true);
                lblHero.setIcon(HeroDamagedEffect);
                lblEnemyBasicAttack.setVisible(false);
                lblHero.setIcon(HeroDamagedEffect);
                ((Timer) e.getSource()).stop(); // Stop the timer
                
                
                return;
            }

            // Update enemy's label with the current attack frame
            lblEnemyBasicAttack.setIcon(enemy.getEnemyBasicAttack()[attackCurrentImageIndex]);

            // Increment the attack frame index
            attackCurrentImageIndex++;
        });

        enemyAttackTimer.start(); // Start the attack animation timer
    }
    @Override
    public void EnemyBasicEffectAnimation() {

    }
    
    @Override
    public void EnemyChargeEffectAnimation() {
         lblEnemy.setVisible(false);
        lblEnemyChargeEffect.setVisible(true);
        attackCurrentImageIndex = 0; // Reset the attack frame index
        
        lblEnemyChargeEffect.setIcon(enemy.getEnemyChargeEffect()[attackCurrentImageIndex]);
        
        Timer chargeHero = new Timer(150, e -> {
            // Check if all RasenEffect frames have been shown
            if (attackCurrentImageIndex >= enemy.getEnemyChargeEffect().length) {
                // If RasenEffect animation is complete, switch back to Hero's stance
                
                lblEnemyChargeEffect.setVisible(false);
                lblEnemy.setVisible(true);
                
                
                
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            // Update hero's label with the current RasenEffect frame
            lblEnemyChargeEffect.setIcon(enemy.getEnemyChargeEffect()[attackCurrentImageIndex]);

            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        chargeHero.start(); // Start the RasenEffect animation timer
    }
    
    public void EnemyChargeEffectAnimation2() {
        //lblEnemyChargeEffect2.setVisible(true);
        attackCurrentImageIndex = 0; // Reset the attack frame index
        
        lblEnemyChargeEffect2.setIcon(enemy.getEnemyChargeEffect2()[attackCurrentImageIndex]);
        
        Timer chargeHero = new Timer(150, e -> {
            // Check if all RasenEffect frames have been shown
            if (attackCurrentImageIndex >= enemy.getEnemyChargeEffect2().length) {
                // If RasenEffect animation is complete, switch back to Hero's stance
                lblEnemy.setVisible(true);
                
                
                lblEnemyChargeEffect2.setVisible(false);
                lblEnemyChargeEffect.setVisible(false);
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            // Update hero's label with the current RasenEffect frame
           // lblEnemyChargeEffect2.setIcon(enemy.getEnemyChargeEffect2()[attackCurrentImageIndex]);

            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        chargeHero.start(); // Start the RasenEffect animation timer
   
    }
    
    
    
    int i =0;
    @Override
    public void EnemySkillAttackAnimation() {
        
        lblEnemy.setVisible(false);
        lblEnemySkillAttack.setVisible(true);
        

        // Reset the attack frame index
        attackCurrentImageIndex = 0;
        lblEnemySkillAttack.setIcon(enemy.getEnemySkillAttack()[attackCurrentImageIndex]);

        Timer enemySkillAttackTimer = new Timer(100, e -> {

            // Check if all attack frames have been shown
            if (attackCurrentImageIndex >= enemy.getEnemySkillAttack().length) {
                // If all frames have been shown, switch back to enemy's stance
                lblEnemy.setVisible(true);
                lblHero.setIcon(HeroDamagedEffect);
                lblEnemySkillAttack.setVisible(false);
                lblEnemySkillEffect.setVisible(false);
                lblHero.setIcon(HeroDamagedEffect);
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }
            if (attackCurrentImageIndex > 2 && attackCurrentImageIndex < 9 && i < 5) {
                lblEnemySkillEffect.setVisible(true);
                lblEnemySkillEffect.setIcon(enemy.getEnemySkillEffect()[i]);
                i++;
            }
            
            // Update enemy's label with the current attack frame
            lblEnemySkillAttack.setIcon(enemy.getEnemySkillAttack()[attackCurrentImageIndex]);
            
            // Increment the attack frame index
            attackCurrentImageIndex++;
        });

        enemySkillAttackTimer.start(); // Start the attack animation timer
    }
    
    @Override
    public void EnemySkillEffectAnimation() {

    }
    
   @Override
    public void EnemySpecialAttackAnimation() {
        lblEnemy.setVisible(false);
        lblEnemySpecialAttack.setVisible(true);
        
        attackCurrentImageIndex = 0;
        lblEnemySpecialAttack.setIcon(enemy.getEnemySpecialAttack()[attackCurrentImageIndex]);
        
        Timer specialAttackMadara = new Timer(150, e -> {
            // Check if all RasenEffect frames have been shown
            if (attackCurrentImageIndex >= enemy.getEnemySpecialAttack().length) {
 
               EnemySpecialEffectAnimation();
                
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            // Update hero's label with the current RasenEffect frame
            lblEnemySpecialAttack.setIcon(enemy.getEnemySpecialAttack()[attackCurrentImageIndex]);

            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        specialAttackMadara.start(); // Start the RasenEffect animation timer
    }

    
    @Override
    public void EnemySpecialEffectAnimation() {
        lblEnemySpecialEffect.setVisible(true);
        
        attackCurrentImageIndex = 0;
        lblEnemySpecialEffect.setIcon(enemy.getEnemySpecialEffect()[attackCurrentImageIndex]);
        
        Timer specialAttackMadara = new Timer(150, e -> {
            // Check if all RasenEffect frames have been shown
            if (attackCurrentImageIndex >= enemy.getEnemySpecialEffect().length) {
 
                EnemySpecialEffectAnimation2();
                lblHero.setIcon(HeroDamagedEffect);
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            // Update hero's label with the current RasenEffect frame
            lblEnemySpecialEffect.setIcon(enemy.getEnemySpecialEffect()[attackCurrentImageIndex]);

            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        specialAttackMadara.start(); // Start the RasenEffect animation timer
    }
    

    public void EnemySpecialEffectAnimation2() {

        lblEnemySpecialEffect.setVisible(false);
        lblEnemySpecialEffect2.setVisible(true);
        attackCurrentImageIndex = 0;
        lblEnemySpecialEffect2.setIcon(enemy.getEnemySpecialEffect2()[attackCurrentImageIndex]);
        
        Timer specialAttackMadara = new Timer(150, e -> {
            // Check if all RasenEffect frames have been shown
            if (attackCurrentImageIndex >= enemy.getEnemySpecialEffect2().length) {
                lblEnemySpecialAttack.setVisible(false);
                lblEnemySpecialEffect2.setVisible(false);
                lblEnemy.setVisible(true);
                lblHero.setIcon(HeroDamagedEffect);
                ((Timer) e.getSource()).stop(); // Stop the timer
                return;
            }

            // Update hero's label with the current RasenEffect frame
            lblEnemySpecialEffect2.setIcon(enemy.getEnemySpecialEffect2()[attackCurrentImageIndex]);

            // Increment the RasenEffect frame index
            attackCurrentImageIndex++;
        });

        specialAttackMadara.start(); // Start the RasenEffect animation timer
    }
    

    private class AttackKeyListener implements KeyListener {
        
        
        @Override
        public void keyTyped(KeyEvent e) {
            // Not needed for this implementation
        }

            @Override
       public void keyPressed(KeyEvent e) {
           
           damage(hero,enemy);
            
           switch (e.getKeyCode()) {
               
               case KeyEvent.VK_Q:
                   
                if (hero.getCurrentMana() >= hero.getBaseMana()) {
                    HeroBasicAttackAnimation();
                    performBaseAttack(hero, enemy);
                    if (enemy.getCurrentHp() <= 0) {
                    System.out.println("K.O!!");
                    enemy.setCurrentHp(0);
                    lblEnemy.setVisible(false);
                    lblEnemyDead.setVisible(true);
                    lblEnemyHp.setText(""+enemy.getCurrentHp());
                    JOptionPane.showMessageDialog(null, "You won!, Congratulations you completed the whole stage!");
                    ldu.updateStage(playerName,Stage);
                    openNextStageFrame();
                    }
                    simulateEnemyTurn(hero, enemy);
                    if (hero.getCurrentHp() <= 0) {
                    System.out.println("K.O!!");
                    hero.setCurrentHp(0);
                    lblHero.setVisible(false);
                    lblHeroDead.setVisible(true);
                    lblHeroHp.setText(""+hero.getCurrentHp());
                    JOptionPane.showMessageDialog(null, "You Lost!, Try again.");
                  
                    LooseFrame();
                    }
                    
                        
                    } else {
                        System.out.println("Not enough mana..\n Try another option..");
                    }
                    break;
               case KeyEvent.VK_W:
                   if (hero.getCurrentMana() >= hero.getSkillMana()) {
                       HeroSkillAttackAnimation();
                       performSkillAttack(hero, enemy);
                       if (enemy.getCurrentHp() <= 0) {
                        System.out.println("K.O!!");
                        enemy.setCurrentHp(0);
                        lblEnemy.setVisible(false);
                        lblEnemyDead.setVisible(true);
                        lblEnemyHp.setText(""+enemy.getCurrentHp());
                        JOptionPane.showMessageDialog(null, "You won!, Congratulations you completed the whole stage!");
                        ldu.updateStage(playerName,Stage);
                        openNextStageFrame();
                       }
                       new Thread(() -> {
                           try {
                               Thread.sleep(2500); // Adjust the delay as needed
                               simulateEnemyTurn(hero, enemy);
                           } catch (InterruptedException ex) {
                               Logger.getLogger(Stage1FrameGojo.class.getName()).log(Level.SEVERE, null, ex);
                           }
                        }).start();
                       if (hero.getCurrentHp() <= 0) {
                        System.out.println("K.O!!");
                        hero.setCurrentHp(0);
                        lblHero.setVisible(false);
                        lblHeroDead.setVisible(true);
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        JOptionPane.showMessageDialog(null, "You Lost!, Try again.");
                       
                        LooseFrame();
                        }
                   } else {
                       System.out.println("Not enough mana..\n Try another option..");
                   }
                   break;
               case KeyEvent.VK_E:
                   HeroChargeEffectAnimation();
                   performCharge(hero);
     
                   simulateEnemyTurn(hero, enemy);
                   if (hero.getCurrentHp() <= 0) {
                    System.out.println("K.O!!");
                    hero.setCurrentHp(0);
                    lblHero.setVisible(false);
                    lblHeroDead.setVisible(true);
                    lblHeroHp.setText(""+hero.getCurrentHp());
                    JOptionPane.showMessageDialog(null, "You Lost!, Try again.");
                    LooseFrame(); 
                   }
                   break;
               case KeyEvent.VK_R:
                   if (hero.getCurrentMana() >= hero.getSpecialMana()) {
                       HeroSpecialAttackAnimation();
                       performSpecialAttack(hero, enemy);
                       if (enemy.getCurrentHp() <= 0) {
                        System.out.println("K.O!!");
                        enemy.setCurrentHp(0);
                        lblEnemy.setVisible(false);
                        lblEnemyDead.setVisible(true);
                        lblEnemyHp.setText(""+enemy.getCurrentHp());
                        JOptionPane.showMessageDialog(null, "You won!, Congratulations you completed the whole stage!");
                        ldu.updateStage(playerName,Stage);
                        openNextStageFrame();
 
                        }
                       new Thread(() -> {
                           try {
                               Thread.sleep(3500); // Adjust the delay as needed
                               simulateEnemyTurn(hero, enemy);
                           } catch (InterruptedException ex) {
                               Logger.getLogger(Stage1FrameGojo.class.getName()).log(Level.SEVERE, null, ex);
                           }
                        }).start();

                       if (hero.getCurrentHp() <= 0) {
                        System.out.println("K.O!!");
                        hero.setCurrentHp(0);
                        lblHero.setVisible(false);
                        lblHeroDead.setVisible(true);                        
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        JOptionPane.showMessageDialog(null, "You Lost!, Try again.");
                       
                        LooseFrame();
                       }
                       
                   } else {
                       System.out.println("Not enough mana..\n Try another option!..");
                   }
                   break;
               default:
                   break;
           }
       }


        @Override
        public void keyReleased(KeyEvent e) {
            // Not needed for this implementation
        }
    }
     private void openNextStageFrame() {
        leaderboard wc = new leaderboard();
        ldu.updateStage(playerName,Stage);
        lblHeroHp.setText(""+hero.getMaxHp());
        lblHeroMana.setText(""+hero.getMaxMana());
        //Testing 
        this.setVisible(false);
        wc.setVisible(true);
    }
    private void LooseFrame() {
       leaderboard ld = new leaderboard();
        this.setVisible(false);
        ld.setVisible(true);
    }
    
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
            case "[Yuji]":
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
    private void simulateEnemyTurn(HeroInfo hero, EnemyInfo enemy) {
    // Simulate enemy's turn with a delay
    new Thread(() -> {
        try {
            Thread.sleep(3000); // Adjust the delay as needed
            handleEnemyTurn(hero, enemy); // Perform the enemy's action
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }).start();
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
           
            lblHeroMana.setText(""+hero.getCurrentMana());
            lblEnemyHp.setText(""+enemy.getCurrentHp());
            
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
        lblHeroMana.setText(""+hero.getCurrentMana());
        
    }
    @Override
    public void performSkillAttack(HeroInfo hero, EnemyInfo enemy) {
        int random;
            random = rand.nextInt(skillE - skillB + 1) + skillB;
            enemy.setCurrentHp(enemy.getCurrentHp() - random);
            hero.setCurrentMana(hero.getCurrentMana() - hero.getSkillMana());
            System.out.println("You have used " + "[" + hero.getSkillAttack() + "]");
            System.out.println(hero.getSkillAttackDescription() + " \nDamage: " + random + " Dmg");
            lblHeroMana.setText(""+hero.getCurrentMana());
            lblEnemyHp.setText(""+enemy.getCurrentHp());
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
            lblHeroMana.setText(""+hero.getCurrentMana());
            lblEnemyHp.setText(""+enemy.getCurrentHp());
            System.out.println();
            if (hero.getCurrentMana() < 0) {
                hero.setCurrentMana(0);
            }
    
    }
        //Enemy
            @Override
        public void EperformBaseAttack(HeroInfo enemy, EnemyInfo hero) {
            int random;
           
            random = rand.nextInt(EbaseE - EbaseB + 1) + EbaseB;
            hero.setCurrentHp(hero.getCurrentHp() - random);
            enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getBaseMana());
            System.out.println("Your opponent have used " + "[" + enemy.getBaseAttack() + "]");
            System.out.println(enemy.getBaseAttackDescription() + " \nDamage: " + random + " Dmg");
            System.out.println();
            lblEnemyMana.setText(""+enemy.getCurrentMana());
            lblHeroHp.setText(""+hero.getCurrentHp());
                   
        }

        @Override
        public void EperformCharge(EnemyInfo enemy) {
            int random;
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

        @Override
        public void EperformSkillAttack(HeroInfo enemy, EnemyInfo hero) {
            int random;
            random = rand.nextInt(skillE - skillB + 1) + skillB;
            hero.setCurrentHp(hero.getCurrentHp() - random);
            enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getSkillMana());
            System.out.println("Your opponent has used " + "[" + enemy.getSkillAttack() + "]");
            System.out.println(enemy.getSkillAttackDescription() + " \nDamage: " + random + " Dmg");
            lblEnemyMana.setText("" + enemy.getCurrentMana());
            lblHeroHp.setText("" + hero.getCurrentHp());
            System.out.println();
            if (enemy.getCurrentMana() < 0) {
                enemy.setCurrentMana(0);
            }

        }

        @Override
        public void EperformSpecialAttack(HeroInfo enemy, EnemyInfo hero) {
            int random;
             
            random = rand.nextInt(EssE - EssB + 1) + EssB;
            hero.setCurrentHp(hero.getCurrentHp() - random);
            enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getSpecialMana());
            System.out.println("Your opponent have used " + "[" + enemy.getSpecialAttack() + "]");
            System.out.println(enemy.getSpecialAttackDescription() + " \nDamage: " + random + " Dmg");
            System.out.println();

        }
    
    
    private void handleEnemyTurn(HeroInfo hero, EnemyInfo enemy) {
    damage(hero,enemy);
    int enemyTurn = rand.nextInt(4) + 1;
    int random;
    switch (enemyTurn) {
        case 1:
            if (enemy.getCurrentMana() >= enemy.getBaseMana()) {
                        random = rand.nextInt(EbaseE - EbaseB + 1) + EbaseB;
                        hero.setCurrentHp(hero.getCurrentHp() - random);
                        enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getBaseMana());
                        System.out.println("Your opponent have used " + "[" + enemy.getBaseAttack() + "]");
                        System.out.println(enemy.getBaseAttackDescription() + " \nDamage: " + random + " Dmg");
                        lblEnemyMana.setText(""+enemy.getCurrentMana());
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        
                        EnemyBasicAttackAnimation();
                        if (hero.getCurrentHp() <= 0) {
                        System.out.println("K.O!!");
                        hero.setCurrentHp(0);
                        lblHero.setVisible(false);
                        lblHeroDead.setVisible(true);
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        JOptionPane.showMessageDialog(null, "You Lost!, Try again.");
                      
                        LooseFrame();
                        }
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
                        EnemyChargeEffectAnimation();
                        lblEnemyMana.setText(""+enemy.getCurrentMana());
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
                    lblEnemyMana.setText(""+enemy.getCurrentMana());
                    EnemyChargeEffectAnimation();
                    System.out.println();
                    break;
        case 3:
            if (enemy.getCurrentMana() >= enemy.getSkillMana()) {
                        random = rand.nextInt(EskillE - EskillB + 1) + EskillB;
                        hero.setCurrentHp(hero.getCurrentHp() - random);
                        enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getSkillMana());
                        System.out.println("Your opponent have used " + "[" + enemy.getSkillAttack() + "]");
                        System.out.println(enemy.getSkillAttackDescription() + " \nDamage: " + random + " Dmg");
                        lblEnemyMana.setText(""+enemy.getCurrentMana());
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        EnemySkillAttackAnimation();
                        if (hero.getCurrentHp() <= 0) {
                        System.out.println("K.O!!");
                        hero.setCurrentHp(0);
                        lblHero.setVisible(false);
                        lblHeroDead.setVisible(true);
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        JOptionPane.showMessageDialog(null, "You Lost!, Try again.");
                       
                        LooseFrame();
                        }
                        System.out.println();
                        
                    } else if (enemy.getCurrentMana() >= enemy.getBaseMana()) {
                        random = rand.nextInt(EbaseE - EbaseB + 1) + EbaseB;
                        hero.setCurrentHp(hero.getCurrentHp() - random);
                        enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getBaseMana());
                        System.out.println("Your opponent have used " + "[" + enemy.getBaseAttack() + "]");
                        System.out.println(enemy.getBaseAttackDescription() + " \nDamage: " + random + " Dmg");
                        lblEnemyMana.setText(""+enemy.getCurrentMana());
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        EnemyBasicAttackAnimation();
                        if (hero.getCurrentHp() <= 0) {
                        System.out.println("K.O!!");
                        hero.setCurrentHp(0);
                        lblHero.setVisible(false);
                        lblHeroDead.setVisible(true);
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        JOptionPane.showMessageDialog(null, "You Lost!, Try again.");
                       
                        LooseFrame();
                        }
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
                        lblEnemyMana.setText(""+enemy.getCurrentMana());
                        EnemyChargeEffectAnimation();
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
                        lblEnemyMana.setText(""+enemy.getCurrentMana());
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        EnemySpecialAttackAnimation();
                        if (hero.getCurrentHp() <= 0) {
                        System.out.println("K.O!!");
                        hero.setCurrentHp(0);
                        lblHero.setVisible(false);
                        lblHeroDead.setVisible(true);
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        JOptionPane.showMessageDialog(null, "You Lost!, Try again.");
                     
                        LooseFrame();
                        }
                        System.out.println();
                    } else if (enemy.getCurrentMana() >= enemy.getSkillMana()) {
                        random = rand.nextInt(EskillE - EskillB + 1) + EskillB;
                        hero.setCurrentHp(hero.getCurrentHp() - random);
                        enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getSkillMana());
                        System.out.println("Your opponent have used " + "[" + enemy.getSkillAttack() + "]");
                        System.out.println(enemy.getSkillAttackDescription() + " \nDamage: " + random + " Dmg");
                        lblEnemyMana.setText(""+enemy.getCurrentMana());
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        EnemySkillAttackAnimation();
                        if (hero.getCurrentHp() <= 0) {
                        System.out.println("K.O!!");
                        hero.setCurrentHp(0);
                        lblHero.setVisible(false);
                        lblHeroDead.setVisible(true);
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        JOptionPane.showMessageDialog(null, "You Lost!, Try again.");
                        
                        LooseFrame();
                        }
                        System.out.println();
                    } else if (enemy.getCurrentMana() >= enemy.getBaseMana()) {
                        random = rand.nextInt(EbaseE - EbaseB + 1) + EbaseB;
                        hero.setCurrentHp(hero.getCurrentHp() - random);
                        enemy.setCurrentMana(enemy.getCurrentMana() - enemy.getBaseMana());
                        System.out.println("Your opponent have used " + "[" + enemy.getBaseAttack() + "]");
                        System.out.println(enemy.getBaseAttackDescription() + " \nDamage: " + random + " Dmg");
                        EnemyBasicAttackAnimation();
                        lblEnemyMana.setText(""+enemy.getCurrentMana());
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        if (hero.getCurrentHp() <= 0) {
                        System.out.println("K.O!!");
                        hero.setCurrentHp(0);
                        lblHero.setVisible(false);
                        lblHeroDead.setVisible(true);
                        lblHeroHp.setText(""+hero.getCurrentHp());
                        JOptionPane.showMessageDialog(null, "You Lost!, Try again.");
                       
                        LooseFrame();
                        }
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
                        lblEnemyMana.setText(""+enemy.getCurrentMana());
                        EnemyChargeEffectAnimation();
                        System.out.println();
                    }
                    break;
                    
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeroSpecialEffect = new javax.swing.JLabel();
        lblHeroSpecialAttack = new javax.swing.JLabel();
        lblEnemySpecialEffect = new javax.swing.JLabel();
        lblEnemySpecialEffect2 = new javax.swing.JLabel();
        lblEnemyChargeEffect2 = new javax.swing.JLabel();
        lblEnemySpecialAttack = new javax.swing.JLabel();
        lblEnemySkillAttack = new javax.swing.JLabel();
        lblEnemyBasicAttack = new javax.swing.JLabel();
        lblEnemyChargeEffect = new javax.swing.JLabel();
        lblStageNumber = new javax.swing.JLabel();
        lblHeroName = new javax.swing.JLabel();
        lblHP = new javax.swing.JLabel();
        lblHeroHp = new javax.swing.JLabel();
        lblHeroMana = new javax.swing.JLabel();
        lblMana = new javax.swing.JLabel();
        lblEnemyName = new javax.swing.JLabel();
        lblHP1 = new javax.swing.JLabel();
        lblEnemyHp = new javax.swing.JLabel();
        lblMana1 = new javax.swing.JLabel();
        lblEnemyMana = new javax.swing.JLabel();
        lblHeroChargeEffect = new javax.swing.JLabel();
        lblHeroSkillEffect = new javax.swing.JLabel();
        lblHeroSkillAttack = new javax.swing.JLabel();
        lblHeroBasicEffect = new javax.swing.JLabel();
        lblHeroSkillEffect2 = new javax.swing.JLabel();
        lblHeroSpecialAttackTransform2 = new javax.swing.JLabel();
        lblHeroSpecialAttackTransform = new javax.swing.JLabel();
        lblHeroSpecialEffect2 = new javax.swing.JLabel();
        lblQ = new javax.swing.JLabel();
        lblW = new javax.swing.JLabel();
        lblE = new javax.swing.JLabel();
        lblR = new javax.swing.JLabel();
        lblHeroBasicEffect2 = new javax.swing.JLabel();
        lblHeroBasicAttack = new javax.swing.JLabel();
        lblEnemySkillEffect = new javax.swing.JLabel();
        lblHeroBlinkEffect = new javax.swing.JLabel();
        lblEnemyDead = new javax.swing.JLabel();
        lblEnemy = new javax.swing.JLabel();
        lblHero = new javax.swing.JLabel();
        lblHeroDead = new javax.swing.JLabel();
        lblMap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeroSpecialEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroSpecialEffect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gojo/ss9.png"))); // NOI18N
        lblHeroSpecialEffect.setToolTipText("");
        getContentPane().add(lblHeroSpecialEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, -130, 1710, 970));

        lblHeroSpecialAttack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroSpecialAttack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gojo/ss5.png"))); // NOI18N
        lblHeroSpecialAttack.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblHeroSpecialAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 460, 560));

        lblEnemySpecialEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnemySpecialEffect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Yuji/sp20.png"))); // NOI18N
        getContentPane().add(lblEnemySpecialEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, 180, 1150, 680));

        lblEnemySpecialEffect2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnemySpecialEffect2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Yuji/sp22.png"))); // NOI18N
        lblEnemySpecialEffect2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblEnemySpecialEffect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 60, 850, 600));

        lblEnemyChargeEffect2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnemyChargeEffect2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff1.png"))); // NOI18N
        getContentPane().add(lblEnemyChargeEffect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 670, 470));

        lblEnemySpecialAttack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnemySpecialAttack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Yuji/sp1.png"))); // NOI18N
        getContentPane().add(lblEnemySpecialAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 380, 280));

        lblEnemySkillAttack.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnemySkillAttack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Yuji/yujiskill1.png"))); // NOI18N
        getContentPane().add(lblEnemySkillAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 260, 680, 600));

        lblEnemyBasicAttack.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnemyBasicAttack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Yuji/yujibasic1.png"))); // NOI18N
        getContentPane().add(lblEnemyBasicAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 430, 680, 250));

        lblEnemyChargeEffect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Yuji/yujicharge1.png"))); // NOI18N
        getContentPane().add(lblEnemyChargeEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 320, 280));

        lblStageNumber.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        lblStageNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblStageNumber.setText("Stage 2");
        getContentPane().add(lblStageNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        lblHeroName.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        lblHeroName.setForeground(new java.awt.Color(255, 255, 255));
        lblHeroName.setText("Naruto");
        getContentPane().add(lblHeroName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        lblHP.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        lblHP.setForeground(new java.awt.Color(255, 255, 255));
        lblHP.setText("Health:");
        getContentPane().add(lblHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        lblHeroHp.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        lblHeroHp.setForeground(new java.awt.Color(255, 255, 255));
        lblHeroHp.setText("1430");
        getContentPane().add(lblHeroHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        lblHeroMana.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        lblHeroMana.setForeground(new java.awt.Color(255, 255, 255));
        lblHeroMana.setText("100");
        getContentPane().add(lblHeroMana, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        lblMana.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        lblMana.setForeground(new java.awt.Color(255, 255, 255));
        lblMana.setText("Mana:");
        getContentPane().add(lblMana, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        lblEnemyName.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        lblEnemyName.setForeground(new java.awt.Color(255, 255, 255));
        lblEnemyName.setText("Madara");
        getContentPane().add(lblEnemyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, -1));

        lblHP1.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        lblHP1.setForeground(new java.awt.Color(255, 255, 255));
        lblHP1.setText("Health:");
        getContentPane().add(lblHP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, -1, -1));

        lblEnemyHp.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        lblEnemyHp.setForeground(new java.awt.Color(255, 255, 255));
        lblEnemyHp.setText("1430");
        getContentPane().add(lblEnemyHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, -1, -1));

        lblMana1.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        lblMana1.setForeground(new java.awt.Color(255, 255, 255));
        lblMana1.setText("Mana:");
        getContentPane().add(lblMana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, -1));

        lblEnemyMana.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        lblEnemyMana.setForeground(new java.awt.Color(255, 255, 255));
        lblEnemyMana.setText("100");
        getContentPane().add(lblEnemyMana, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, -1, -1));

        lblHeroChargeEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroChargeEffect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gojo/charge1.png"))); // NOI18N
        lblHeroChargeEffect.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblHeroChargeEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, 360));

        lblHeroSkillEffect.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHeroSkillEffect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gojo/skillef1.png"))); // NOI18N
        getContentPane().add(lblHeroSkillEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 700, 590));

        lblHeroSkillAttack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroSkillAttack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gojo/skill10.png"))); // NOI18N
        getContentPane().add(lblHeroSkillAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 510, 210));

        lblHeroBasicEffect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroBasicEffect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gojo/attack1.png"))); // NOI18N
        lblHeroBasicEffect.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblHeroBasicEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 190, 220));

        lblHeroSkillEffect2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHeroSkillEffect2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gojo/skillef2_9.png"))); // NOI18N
        lblHeroSkillEffect2.setToolTipText("");
        getContentPane().add(lblHeroSkillEffect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 740, 600));

        lblHeroSpecialAttackTransform2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHeroSpecialAttackTransform2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sasuke/ss19.png"))); // NOI18N
        lblHeroSpecialAttackTransform2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblHeroSpecialAttackTransform2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -50, 1070, 730));

        lblHeroSpecialAttackTransform.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHeroSpecialAttackTransform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sasuke/ss18.png"))); // NOI18N
        lblHeroSpecialAttackTransform.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblHeroSpecialAttackTransform, new org.netbeans.lib.awtextra.AbsoluteConstraints(-340, -50, 1140, 740));

        lblHeroSpecialEffect2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroSpecialEffect2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sasuke/ss28.png"))); // NOI18N
        lblHeroSpecialEffect2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblHeroSpecialEffect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 580, 430));

        lblQ.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        lblQ.setForeground(new java.awt.Color(255, 255, 255));
        lblQ.setText("[Q] - Basic Attack");
        getContentPane().add(lblQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lblW.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        lblW.setForeground(new java.awt.Color(255, 255, 255));
        lblW.setText("[E] - Recharge");
        getContentPane().add(lblW, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        lblE.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        lblE.setForeground(new java.awt.Color(255, 255, 255));
        lblE.setText("[R] - Special Skill");
        getContentPane().add(lblE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        lblR.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        lblR.setForeground(new java.awt.Color(255, 255, 255));
        lblR.setText("[W] - Skill Attack");
        getContentPane().add(lblR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblHeroBasicEffect2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroBasicEffect2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sasuke/chidori21.png"))); // NOI18N
        getContentPane().add(lblHeroBasicEffect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 790, 650));

        lblHeroBasicAttack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sasuke/chidori1.png"))); // NOI18N
        getContentPane().add(lblHeroBasicAttack, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, 180));

        lblEnemySkillEffect.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnemySkillEffect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MadaraEnemy/Capture2.png"))); // NOI18N
        getContentPane().add(lblEnemySkillEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 460, 680, 220));

        lblHeroBlinkEffect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Naruto/Stance.png"))); // NOI18N
        getContentPane().add(lblHeroBlinkEffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, 180));

        lblEnemyDead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dyingImages/yujidead.png"))); // NOI18N
        lblEnemyDead.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblEnemyDead, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 150, 190));

        lblEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Yuji/stand1.png"))); // NOI18N
        getContentPane().add(lblEnemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 120, 190));

        lblHero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gojo/stance1.png"))); // NOI18N
        getContentPane().add(lblHero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 140, -1));

        lblHeroDead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeroDead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dyingImages/gojodead.png"))); // NOI18N
        getContentPane().add(lblHeroDead, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 160, -1));

        lblMap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DragonMap.gif"))); // NOI18N
        getContentPane().add(lblMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stage3FrameGojo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stage3FrameGojo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stage3FrameGojo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stage3FrameGojo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        String defaultPlayerName = "";
        Stage3FrameGojo sl = new Stage3FrameGojo(defaultPlayerName);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sl.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblE;
    private javax.swing.JLabel lblEnemy;
    private javax.swing.JLabel lblEnemyBasicAttack;
    private javax.swing.JLabel lblEnemyChargeEffect;
    private javax.swing.JLabel lblEnemyChargeEffect2;
    private javax.swing.JLabel lblEnemyDead;
    private javax.swing.JLabel lblEnemyHp;
    private javax.swing.JLabel lblEnemyMana;
    private javax.swing.JLabel lblEnemyName;
    private javax.swing.JLabel lblEnemySkillAttack;
    private javax.swing.JLabel lblEnemySkillEffect;
    private javax.swing.JLabel lblEnemySpecialAttack;
    private javax.swing.JLabel lblEnemySpecialEffect;
    private javax.swing.JLabel lblEnemySpecialEffect2;
    private javax.swing.JLabel lblHP;
    private javax.swing.JLabel lblHP1;
    private javax.swing.JLabel lblHero;
    private javax.swing.JLabel lblHeroBasicAttack;
    private javax.swing.JLabel lblHeroBasicEffect;
    private javax.swing.JLabel lblHeroBasicEffect2;
    private javax.swing.JLabel lblHeroBlinkEffect;
    private javax.swing.JLabel lblHeroChargeEffect;
    private javax.swing.JLabel lblHeroDead;
    private javax.swing.JLabel lblHeroHp;
    private javax.swing.JLabel lblHeroMana;
    private javax.swing.JLabel lblHeroName;
    private javax.swing.JLabel lblHeroSkillAttack;
    private javax.swing.JLabel lblHeroSkillEffect;
    private javax.swing.JLabel lblHeroSkillEffect2;
    private javax.swing.JLabel lblHeroSpecialAttack;
    private javax.swing.JLabel lblHeroSpecialAttackTransform;
    private javax.swing.JLabel lblHeroSpecialAttackTransform2;
    private javax.swing.JLabel lblHeroSpecialEffect;
    private javax.swing.JLabel lblHeroSpecialEffect2;
    private javax.swing.JLabel lblMana;
    private javax.swing.JLabel lblMana1;
    private javax.swing.JLabel lblMap;
    private javax.swing.JLabel lblQ;
    private javax.swing.JLabel lblR;
    private javax.swing.JLabel lblStageNumber;
    private javax.swing.JLabel lblW;
    // End of variables declaration//GEN-END:variables

}
