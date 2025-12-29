/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataobject;

/**
 *
 * @author Joel
 */
import javax.swing.ImageIcon;
import logic.CharacterBackground;

public class EnemyInfo extends CharacterBackground {            //Inheritance
    private String name;
    private String background;
    private int maxHp;
    private int currentHp;
    private int maxMana;
    private int currentMana;
    private String baseAttack;
    private String baseAttackDescription;
    private int baseDmg;
    private int baseMana;
    private String recharge;
    private String skillAttack;
    private String skillAttackDescription;
    private int skillDmg;
    private int skillMana ;
    private String specialAttack;
    private int specialDmg;
    private String specialAttackDescription;
    private int specialMana;
    private ImageIcon[] EnemyStanceImages;
    private ImageIcon[] EnemyBasicAttack;  //no basic attack effect
    private ImageIcon[] EnemySkillAttack;
    private ImageIcon[] EnemySkillEffect;
    private ImageIcon[] EnemyChargeEffect;
    private ImageIcon[] EnemyChargeEffect2;
    private ImageIcon[] EnemySpecialAttack;
    private ImageIcon[] EnemySpecialEffect;
    private ImageIcon[] EnemySpecialEffect2;


    public EnemyInfo(){

    }
    public EnemyInfo(String name,String background, int maxHp,int currentHp, int maxMana,int currentMana, String baseAttack,String baseAttackDescription, int baseMana, String recharge, String skillAttack,String skillAttackDescription, int skillMana, String specialAttack,String specialAttackDescription,int specialMana, int baseDmg, int skillDmg, int specialDmg) {
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
        this.skillDmg= skillDmg;
        this.specialDmg =specialDmg;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getMaxHp(){
        return maxHp;
    }
    public void setMaxHp(int maxHp){
        this.maxHp = maxHp;
    }
    public int getCurrentHp(){
        return currentHp;
    }
    public void setCurrentHp(int currentHp){
        this.currentHp = currentHp;
    }
    public int getCurrentMana(){
        return currentMana;
    }
    public void setCurrentMana(int currentMana){
        this.currentMana = currentMana;
    }

    public int getMaxMana(){
        return maxMana;
    }
    public void setMaxMana(int maxMana){
        this.maxMana = maxMana;
    }
    public String getBaseAttack(){
        return baseAttack;
    }
    public void setBaseAttack(String baseAttack){
        this.baseAttack = baseAttack;
    }
    public int getBaseMana(){
        return baseMana;
    }
    public void setBaseMana(int baseMana){
        this.baseMana = baseMana;
    }
    public String getRecharge(){
        return recharge;
    }
    public void setRecharge(String recharge){
        this.recharge = recharge;
    }
    public String getSkillAttack(){
        return skillAttack;
    }
    public void setSkillAttack(String skillAttack) {
        this.skillAttack = skillAttack;
    }
    public int getSkillMana(){
        return skillMana;
    }
    public void setSkillMana(int skillMana){
        this.skillMana = skillMana;
    }
    public String getSpecialAttack(){
        return specialAttack;
    }
    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }
    public int getSpecialMana(){
        return specialMana;
    }
    public void setSpecialMana(int specialMana){
        this.specialMana = specialMana;
    }
    public String getBaseAttackDescription(){
        return baseAttackDescription;
    }
    public String getSkillAttackDescription(){
        return skillAttackDescription;
    }
    public String getSpecialAttackDescription(){
        return specialAttackDescription;
    }
    public void setBaseAttackDescription(String baseAttackDescription){
        this.baseAttackDescription = baseAttackDescription;
    }
    public void setSkillAttackDescription(String skillAttackDescription){
        this.skillAttackDescription = skillAttackDescription;
    }
    public void setSpecialAttackDescription(String specialAttackDescription){
        this.specialAttackDescription = specialAttackDescription;
    }
    public int getBaseDmg(){
        return baseDmg;
    }
    public void setBaseDmg(int baseDmg){
        this.baseDmg = baseDmg;
    }
    public int getSkillDmg(){
        return skillDmg;
    }
    public void setSkillDmg(int skillDmg){
        this.skillDmg = skillDmg;
    }
    public int getSpecialDmg(){
        return specialDmg;
    }
    public void setSpecialDmg(int specialDmg){
        this.specialDmg = specialDmg;
    }
    public void setBackground(String background){
        this.background = background;
    }
    public String getBackground(){
        return background;
    }
    
    public void setEnemyBasicAttack(ImageIcon[] EnemyBasicAttack){
        this.EnemyBasicAttack = EnemyBasicAttack;
    }

    public ImageIcon[] getEnemyBasicAttack(){
        return EnemyBasicAttack;
    }


    public void setEnemySkillAttack(ImageIcon[] EnemySkillAttack){
        this.EnemySkillAttack = EnemySkillAttack;
    }

    public ImageIcon[] getEnemySkillAttack(){
        return EnemySkillAttack;
    }

    public void setEnemySkillEffect(ImageIcon[] EnemySkillEffect){
        this.EnemySkillEffect = EnemySkillEffect;
    }

    public ImageIcon[] getEnemySkillEffect(){
        return EnemySkillEffect;
    }
    
    public void setEnemyStanceImages(ImageIcon[] EnemyStanceImages){
        this.EnemyStanceImages = EnemyStanceImages;
    }

    public ImageIcon[] getEnemyStanceImages(){
        return EnemyStanceImages;
    }
    
    public ImageIcon[] getEnemyChargeEffect() {
        return EnemyChargeEffect;
    }

    public void setEnemyChargeEffect(ImageIcon[] EnemyChargeEffect) {
        this.EnemyChargeEffect = EnemyChargeEffect;
    }
    
    public ImageIcon[] getEnemyChargeEffect2() {
        return EnemyChargeEffect2;
    }

    public void setEnemyChargeEffect2(ImageIcon[] EnemyChargeEffect2) {
        this.EnemyChargeEffect2 = EnemyChargeEffect2;
    }
    
    public ImageIcon[] getEnemySpecialAttack() {
        return EnemySpecialAttack;
    }

    public void setEnemySpecialAttack(ImageIcon[] EnemySpecialAttack) {
        this.EnemySpecialAttack = EnemySpecialAttack;
    }
    
    public ImageIcon[] getEnemySpecialEffect() {
        return EnemySpecialEffect;
    }

    public void setEnemySpecialEffect(ImageIcon[] EnemySpecialEffect) {
        this.EnemySpecialEffect = EnemySpecialEffect;
    }
    
     public ImageIcon[] getEnemySpecialEffect2() {
        return EnemySpecialEffect2;
    }

    public void setEnemySpecialEffect2(ImageIcon[] EnemySpecialEffect2) {
        this.EnemySpecialEffect2 = EnemySpecialEffect2;
    }
    
   
    public void displayBackground(EnemyInfo enemy){
        for (char c : enemy.getBackground().toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

