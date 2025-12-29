/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataobject;

/**
 *
 * @author Philip
 */
import javax.swing.ImageIcon;
import logic.CharacterBackground;

public class HeroInfo extends CharacterBackground {         //Inheritance

    private String name;
    private String background;
    private int maxHp;
    private int currentHp;
    private int maxMana;
    private int currentMana;
    private String baseAttack;
    private int baseMana;
    private String recharge;
    private String skillAttack;
    private int skillMana;
    private String specialAttack;
    private int specialMana;
    private String baseAttackDescription;
    private String skillAttackDescription;
    private String specialAttackDescription;
    private int baseDmg;
    private int skillDmg;
    private int specialDmg;
    private ImageIcon[] HeroStanceImages;
    private ImageIcon[] HeroIntroTrans;
    private ImageIcon[] HeroIntroTrans2;
    private ImageIcon[] HeroBasicAttack;
    private ImageIcon[] HeroBasicAttack2;
    private ImageIcon[] HeroBasicEffect;
    private ImageIcon[] HeroBasicEffect2;
    private ImageIcon[] HeroChargeEffect;
    private ImageIcon[] HeroSkillAttack;
    private ImageIcon[] HeroSkillEffect;
    private ImageIcon[] HeroSkillEffect3;

    private ImageIcon[] HeroSkillEffect2;
    
    
    private ImageIcon[] HeroSpecialAttack;
    private ImageIcon[] HeroSpecialEffect;
    private ImageIcon[] HeroSpecialEffect2;
    private ImageIcon[] HeroSpecialEffect3;
    private ImageIcon[] HeroBlinkEffect;
    private ImageIcon[] HeroSpecialAttackTransform;
    private ImageIcon[] HeroSpecialAttackTransform2;

    public HeroInfo() {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        this.maxMana = maxMana;
        this.currentMana = currentMana;
        this.baseAttack = baseAttack;
        this.baseAttackDescription = baseAttackDescription;
        this.baseMana = baseMana;
        this.recharge = recharge;
        this.skillAttack = skillAttack;
        this.skillAttackDescription = skillAttackDescription;
        this.skillMana = skillMana;
        this.specialAttack = specialAttack;
        this.specialAttackDescription = specialAttackDescription;
        this.specialMana = specialMana;
        this.baseDmg = baseDmg;
        this.skillDmg = skillDmg;
        this.specialDmg = specialDmg;
        this.background = background;
        this.HeroStanceImages = HeroStanceImages;
        this.HeroBasicAttack = HeroBasicAttack;
        this.HeroBasicEffect = HeroBasicEffect;
        this.HeroStanceImages = HeroStanceImages;
        this.HeroBasicAttack = HeroBasicAttack;
        this.HeroBasicEffect = HeroBasicEffect;
        this.HeroBasicEffect2 = HeroBasicEffect2;
        this.HeroChargeEffect = HeroChargeEffect;
        this.HeroSkillAttack = HeroSkillAttack;
        this.HeroSkillEffect = HeroSkillEffect;
        this.HeroSkillEffect2 = HeroSkillEffect2;
        this.HeroSkillEffect3 = HeroSkillEffect3;
        this.HeroSpecialAttack = HeroSpecialAttack;
        this.HeroSpecialEffect = HeroSpecialEffect;
        this.HeroBlinkEffect = HeroBlinkEffect;
        this.HeroSpecialAttackTransform = HeroSpecialAttackTransform;
        this.HeroSpecialAttackTransform2 = HeroSpecialAttackTransform2;
        this.HeroSpecialEffect2 =HeroSpecialEffect2;
        this.HeroIntroTrans = HeroIntroTrans;
        this.HeroIntroTrans2 = HeroIntroTrans2;
        this.HeroBasicAttack2 = HeroBasicAttack2;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public String getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(String baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getBaseMana() {
        return baseMana;
    }

    public void setBaseMana(int baseMana) {
        this.baseMana = baseMana;
    }

    public String getRecharge() {
        return recharge;
    }

    public void setRecharge(String recharge) {
        this.recharge = recharge;
    }

    public String getSkillAttack() {
        return skillAttack;
    }

    public void setSkillAttack(String skillAttack) {
        this.skillAttack = skillAttack;
    }

    public int getSkillMana() {
        return skillMana;
    }

    public void setSkillMana(int skillMana) {
        this.skillMana = skillMana;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }

    public int getSpecialMana() {
        return specialMana;
    }

    public void setSpecialMana(int specialMana) {
        this.specialMana = specialMana;
    }

    public String getBaseAttackDescription() {
        return baseAttackDescription;
    }

    public String getSkillAttackDescription() {
        return skillAttackDescription;
    }

    public String getSpecialAttackDescription() {
        return specialAttackDescription;
    }

    public void setBaseAttackDescription(String baseAttackDescription) {
        this.baseAttackDescription = baseAttackDescription;
    }

    public void setSkillAttackDescription(String skillAttackDescription) {
        this.skillAttackDescription = skillAttackDescription;
    }

    public void setSpecialAttackDescription(String specialAttackDescription) {
        this.specialAttackDescription = specialAttackDescription;
    }

    public int getBaseDmg() {
        return baseDmg;
    }

    public void setBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
    }

    public int getSkillDmg() {
        return skillDmg;
    }

    public void setSkillDmg(int skillDmg) {
        this.skillDmg = skillDmg;
    }

    public int getSpecialDmg() {
        return specialDmg;
    }

    public void setSpecialDmg(int specialDmg) {
        this.specialDmg = specialDmg;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getBackground() {
        return background;
    }

    public void setHeroStanceImages(ImageIcon[] HeroStanceImages) {
        this.HeroStanceImages = HeroStanceImages;
    }

    public ImageIcon[] getHeroStanceImages() {
        return HeroStanceImages;
    }

    public void setEnemyStanceImages(ImageIcon[] HeroStanceImages) {
        this.HeroStanceImages = HeroStanceImages;
    }

    public ImageIcon[] getEnemyStanceImages() {
        return HeroStanceImages;
    }

    public void setHeroBasicAttack(ImageIcon[] HeroBasicAttack) {
        this.HeroBasicAttack = HeroBasicAttack;
    }

    public ImageIcon[] getHeroBasicAttack() {
        return HeroBasicAttack;
    }

    public void setHeroBasicEffect(ImageIcon[] HeroBasicEffect) {
        this.HeroBasicEffect = HeroBasicEffect;
    }

    public ImageIcon[] getHeroBasicEffect() {
        return HeroBasicEffect;
    }

    public void setHeroBasicEffect2(ImageIcon[] HeroBasicEffect2) {
        this.HeroBasicEffect2 = HeroBasicEffect2;
    }

    public ImageIcon[] getHeroBasicEffect2() {
        return HeroBasicEffect2;
    }

    public ImageIcon[] getHeroChargeEffect() {
        return HeroChargeEffect;
    }

    public void setHeroChargeEffect(ImageIcon[] HeroChargeEffect) {
        this.HeroChargeEffect = HeroChargeEffect;
    }

    // Getter and setter for HeroSkillAttack
    public ImageIcon[] getHeroSkillAttack() {
        return HeroSkillAttack;
    }

    public void setHeroSkillAttack(ImageIcon[] HeroSkillAttack) {
        this.HeroSkillAttack = HeroSkillAttack;
    }

    // Getter and setter for HeroSkillEffect
    public ImageIcon[] getHeroSkillEffect() {
        return HeroSkillEffect;
    }

    public void setHeroSkillEffect(ImageIcon[] HeroSkillEffect) {
        this.HeroSkillEffect = HeroSkillEffect;
    }
    
    public ImageIcon[] getHeroSkillEffect2() {
        return HeroSkillEffect2;
    }

    public void setHeroSkillEffect2(ImageIcon[] HeroSkillEffect2) {
        this.HeroSkillEffect2 = HeroSkillEffect2;
    }

    // Getter and setter for HeroSpecialAttack
    public ImageIcon[] getHeroSpecialAttack() {
        return HeroSpecialAttack;
    }

    public void setHeroSpecialAttack(ImageIcon[] HeroSpecialAttack) {
        this.HeroSpecialAttack = HeroSpecialAttack;
    }

    // Getter and setter for HeroSpecialEffect
    public ImageIcon[] getHeroSpecialEffect() {
        return HeroSpecialEffect;
    }

    public void setHeroSpecialEffect(ImageIcon[] HeroSpecialEffect) {
        this.HeroSpecialEffect = HeroSpecialEffect;
    }

    public ImageIcon[] getHeroBlinkEffect() {
        return HeroBlinkEffect;
    }

    public void setHeroBlinkEffect(ImageIcon[] HeroBlinkEffect) {
        this.HeroBlinkEffect = HeroBlinkEffect;
    }

    public ImageIcon[] getHeroSpecialAttackTransform() {
        return HeroSpecialAttackTransform;
    }

    public void setHeroSpecialAttackTransform(ImageIcon[] HeroSpecialAttackTransform) {
        this.HeroSpecialAttackTransform = HeroSpecialAttackTransform;
    }

    public ImageIcon[] getHeroSpecialAttackTransform2() {
        return HeroSpecialAttackTransform2;
    }

    public void setHeroSpecialAttackTransform2(ImageIcon[] HeroSpecialTransform2) {
        this.HeroSpecialAttackTransform2 = HeroSpecialTransform2;
    }
    public ImageIcon[] getHeroSpecialEffect2() {
        return HeroSpecialEffect2;
    }

    public void setHeroSpecialEffect2(ImageIcon[] HeroSpecialEffect2) {
        this.HeroSpecialEffect2 = HeroSpecialEffect2;
    }
    
    public ImageIcon[] getHeroSpecialEffect3() {
        return HeroSpecialEffect3;
    }

    public void setHeroSpecialEffect3(ImageIcon[] HeroSpecialEffect3) {
        this.HeroSpecialEffect3 = HeroSpecialEffect3;
    }
    
    
    public ImageIcon[] getHeroIntroTrans() {
        return HeroIntroTrans;
    }

    public void setHeroIntroTrans(ImageIcon[] HeroIntroTrans) {
        this.HeroIntroTrans = HeroIntroTrans;
    }
    
    public ImageIcon[] getHeroIntroTrans2() {
        return HeroIntroTrans2;
    }

    public void setHeroIntroTrans2(ImageIcon[] HeroIntroTrans2) {
        this.HeroIntroTrans2 = HeroIntroTrans2;
    }
    
    public void setHeroBasicAttack2(ImageIcon[] HeroBasicAttack2) {
        this.HeroBasicAttack2 = HeroBasicAttack2;
    }

    public ImageIcon[] getHeroBasicAttack2() {
        return HeroBasicAttack2;
    }
    
    public void setHeroSkillEffect3(ImageIcon[] HeroSkillEffect3) {
        this.HeroSkillEffect3 = HeroSkillEffect3;
    }

    public ImageIcon[] getHeroSkillEffect3() {
        return HeroSkillEffect3;
    }
    
    
    
    

    public void displayBackground(HeroInfo hero) {
        for (char c : hero.getBackground().toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
