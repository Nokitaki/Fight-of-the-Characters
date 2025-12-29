/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Joel
 */
public class Character {
        private String name;
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


        public Character() {
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
            this.specialDmg =skillDmg;
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
    }
