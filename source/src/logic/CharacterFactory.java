/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;


import dataobject.EnemyInfo;
import dataobject.HeroInfo;

import java.util.Random;
import javax.swing.ImageIcon;

public class CharacterFactory extends CharacterBackground {

    HeroInfo hero = new HeroInfo();

    public HeroInfo initHeroAttributes(int n) {

        switch (n) {
            case 1:
                hero.setName("[Naruto Uzumaki]");
                hero.setBackground("Naruto, a spirited ninja from the Hidden Leaf Village, holds within him the\n"
                        + "indomitable will to never give up. As a child, he was shunned for being the vessel of\n"
                        + "the Nine-Tailed Fox, but his unwavering determination and kind heart endeared him to\n"
                        + "those around him. With dreams of becoming the strongest ninja and the village's\n"
                        + "leader, Naruto faces challenges head-on, guided by his mantra, \"I won't go back on my\n"
                        + "word, that's my ninja way!\"");
                hero.setMaxHp(1350);
                hero.setCurrentHp(hero.getMaxHp());
                hero.setMaxMana(420);
                hero.setCurrentMana(hero.getMaxMana());
                hero.setBaseAttack("Rasengan");
                hero.setBaseDmg(110);
                hero.setBaseAttackDescription("Unleashes a spinning orb of chakra, dealing moderate damage.");
                hero.setBaseMana(50);
                hero.setRecharge("Chakra Recovery");
                hero.setSkillAttack("Shadow Clone Barrage");
                hero.setSkillDmg(275);
                hero.setSkillAttackDescription("Conjures multiple clones attacking simultaneously, inflicting significant damage.");
                hero.setSkillMana(140);
                hero.setSpecialAttack("Tailed Beast Rasengan");
                hero.setSpecialDmg(495);
                hero.setSpecialAttackDescription("Channels the immense power of the Nine-Tails into a colossal Rasengan, causing very high damage.");
                hero.setSpecialMana(220);

                //Stance for [Naruto] Character
                ImageIcon[] NarutoStanceImages = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Naruto/Stance.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Stance1.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Stance2.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Stance3.png"))
                };
                hero.setHeroStanceImages(NarutoStanceImages);

                ImageIcon[] NarutoBlink = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Naruto/Teleport.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Teleport1.png"))

                };
                hero.setHeroBlinkEffect(NarutoBlink);

                //Basic Attack Animation for [Naruto] Character
                ImageIcon[] NarutoBasicAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Naruto/Smash.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Smash1.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Smash2.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Smash3.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Smash4.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Smash5.png"))

                };
                hero.setHeroBasicAttack(NarutoBasicAttack);

                // Basic Attack [Effects] Animation
                ImageIcon[] NarutoBasicEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Naruto/Explosion.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Explosion1.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Explosion2.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Explosion3.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Explosion4.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Explosion5.png"))

                };
                hero.setHeroBasicEffect(NarutoBasicEffect);
                //Skill Attack
                ImageIcon[] NarutoSkillAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Naruto/Rasengan.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Rasengan1.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Rasengan2.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Rasengan3.png"))

                };
                hero.setHeroSkillAttack(NarutoSkillAttack);

                ImageIcon[] NarutoSkillEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Naruto/RasenEffect.png")),
                    new ImageIcon(getClass().getResource("/Naruto/RasenEffect1.png")),
                    new ImageIcon(getClass().getResource("/Naruto/RasenEffect2.png")),
                    new ImageIcon(getClass().getResource("/Naruto/RasenEffect3.png")),
                    new ImageIcon(getClass().getResource("/Naruto/RasenEffect4.png")),
                    new ImageIcon(getClass().getResource("/Naruto/RasenEffect5.png"))
                };
                hero.setHeroSkillEffect(NarutoSkillEffect);

                ImageIcon[] NarutoChargeEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Naruto/Recharge1.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Recharge2.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Recharge3.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Recharge4.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Recharge5.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Recharge6.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Recharge7.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Recharge8.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Recharge9.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Recharge10.png"))
                };
                hero.setHeroChargeEffect(NarutoChargeEffect);

                ImageIcon[] NarutoSpecialAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Naruto/Special.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Special1.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Special2.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Special3.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Special4.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Special5.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Special6.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Special7.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Special8.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Special9.png")),
                    new ImageIcon(getClass().getResource("/Naruto/Special10.png"))
                };
                hero.setHeroSpecialAttack(NarutoSpecialAttack);

                ImageIcon[] NarutoSpecialEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Naruto/SpecialEffect.png")),
                    new ImageIcon(getClass().getResource("/Naruto/SpecialEffect1.png")),
                    new ImageIcon(getClass().getResource("/Naruto/SpecialEffect2.png")),
                    new ImageIcon(getClass().getResource("/Naruto/SpecialEffect3.png"))
                };
                hero.setHeroSpecialEffect(NarutoSpecialEffect);

                break;





            case 2:
                hero.setName("[Sasuke Uchiha]");
                hero.setBackground("Sasuke, from the prestigious Uchiha clan, seeks vengeance for the tragic fate of his\n"
                        + "family. Driven by a thirst for power and a desire for retribution against his brother,\n"
                        + "Itachi, Sasuke's journey is one of turmoil and conflict. His prodigious talent in\n"
                        + "ninjutsu and his brooding demeanor conceal the turmoil within, as he treads a path to discover his true purpose.\n");
                hero.setMaxHp(1300);
                hero.setCurrentHp(hero.getMaxHp());
                hero.setMaxMana(380);
                hero.setCurrentMana(hero.getMaxMana());
                hero.setBaseAttack("Chidori");
                hero.setBaseDmg(110);
                hero.setBaseAttackDescription("Executes a swift and precise thrust of lightning, dealing moderate lightning-based damage.");
                hero.setBaseMana(50);
                hero.setRecharge("Chakra Infusion");
                hero.setSkillAttack("Amaterasu");
                hero.setSkillDmg(275);
                hero.setSkillAttackDescription("Unleashes unquenchable black flames dealing significant damage.");
                hero.setSkillMana(120);
                hero.setSpecialAttack("Indra's Arrow");
                hero.setSpecialDmg(495);
                hero.setSpecialAttackDescription("Releases an immense arrow of lightning for very high damage.");
                hero.setSpecialMana(200);

                //Sasuke
                ImageIcon[] SasukeStanceImages = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Sasuke/stance1.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/stance2.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/stance3.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/stance4.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/stance5.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/stance6.png"))
                };
                hero.setHeroStanceImages(SasukeStanceImages);

                ImageIcon[] SasukeBlink = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Sasuke/chidori11.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori12.png"))

                };
                hero.setHeroBlinkEffect(SasukeBlink);

                //Basic Attack Animation for [Naruto] Character
                ImageIcon[] SasukeBasicAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Sasuke/chidori1.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori2.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori3.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori4.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori5.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori6.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori7.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori8.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori9.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori10.png"))
                    
                    
                };
                hero.setHeroBasicAttack(SasukeBasicAttack);

                // Basic Attack [Effects] Animation
                ImageIcon[] SasukeBasicEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Sasuke/chidori12.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori13.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori14.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori15.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori16.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori17.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori18.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori19.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori20.png"))

                };
                hero.setHeroBasicEffect(SasukeBasicEffect);
                
                ImageIcon[] SasukeBasicEffect2 = new ImageIcon[]{
                   new ImageIcon(getClass().getResource("/Sasuke/chidori21.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori22.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori21.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori22.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori21.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/chidori22.png"))
                    

                };
                hero.setHeroBasicEffect2(SasukeBasicEffect2);
                
                
                //Skill Attack
                ImageIcon[] SasukeSkillAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Sasuke/amat1.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/amat2.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/amat3.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/amat4.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/amat5.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/amat6.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/amat7.png"))

                };
                hero.setHeroSkillAttack(SasukeSkillAttack);

                ImageIcon[] SasukeSkillEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Sasuke/terasu1.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/terasu2.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/terasu3.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/terasu4.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/terasu5.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/terasu6.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/terasu7.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/terasu8.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/terasu9.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/terasu10.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/terasu11.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/terasu12.png")),
                };
                hero.setHeroSkillEffect(SasukeSkillEffect);

                ImageIcon[] SasukeChargeEffect = new ImageIcon[]{
                   new ImageIcon(getClass().getResource("/Sasuke/ss8.png")),
                   new ImageIcon(getClass().getResource("/Sasuke/ss9.png")),
                   new ImageIcon(getClass().getResource("/Sasuke/ss10.png")),
                   new ImageIcon(getClass().getResource("/Sasuke/ss11.png")),
                   new ImageIcon(getClass().getResource("/Sasuke/ss12.png")),
                };
                hero.setHeroChargeEffect(SasukeChargeEffect);

                ImageIcon[] SasukeSpecialAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Sasuke/ss1.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss2.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss3.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss4.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss5.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss6.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss7.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss8.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss9.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss10.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss12.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss13.png"))
                };
                hero.setHeroSpecialAttack(SasukeSpecialAttack);
                
                ImageIcon[] SasukeSpecialAttackTransform = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Sasuke/ss16.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss17.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss18.png")),
                    
                };
                
                hero.setHeroSpecialAttackTransform(SasukeSpecialAttackTransform);
                
                ImageIcon[] SasukeSpecialAttackTransform2 = new ImageIcon[]{
                     new ImageIcon(getClass().getResource("/Sasuke/ss26.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss25.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss19.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss20.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss22.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss23.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss24.png"))
                    
                };
                hero.setHeroSpecialAttackTransform2(SasukeSpecialAttackTransform2);
                
               
                
                ImageIcon[] SasukeSpecialEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Sasuke/ss27.png")),
                    
                };
                hero.setHeroSpecialEffect(SasukeSpecialEffect);
                
                ImageIcon[] SasukeSpecialEffect2 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Sasuke/ss28.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss29.png")),
                    new ImageIcon(getClass().getResource("/Sasuke/ss30.png")),
                    
                };
                hero.setHeroSpecialEffect2(SasukeSpecialEffect2);
                
                
                break;
            case 3:
                hero.setName("[Monkey D. Luffy]");
                hero.setBackground("Luffy, the captain of the Straw Hat Pirates, dreams of finding the legendary One Piece\n"
                        + "and becoming the Pirate King. Possessing an insatiable appetite and an unwavering\n"
                        + "sense of loyalty to his crew, Luffy's defining trait is his fearlessness. With his\n"
                        + "elastic abilities gained from consuming a Devil Fruit, he sets sail across the Grand\n"
                        + "Line, making allies and enemies alike on his adventurous quest.");
                hero.setMaxHp(1310);
                hero.setCurrentHp(hero.getMaxHp());
                hero.setMaxMana(370);
                hero.setCurrentMana(hero.getMaxMana());
                hero.setBaseAttack("Gomu Gomu no Pistol");
                hero.setBaseDmg(120);
                hero.setBaseAttackDescription("Unleashes a swift and forceful punch dealing moderate physical damage.");
                hero.setBaseMana(50);
                hero.setRecharge("Haki Focus");
                hero.setSkillAttack("Gear Third");
                hero.setSkillDmg(280);
                hero.setSkillAttackDescription("Expands body parts to increase damage and attacks, inflicting significant damage.");
                hero.setSkillMana(105);
                hero.setSpecialAttack("Gear Fourth: Boundman");
                hero.setSpecialDmg(500);
                hero.setSpecialAttackDescription("Transforms into a hulking form to deliver very high damage.");
                hero.setSpecialMana(200);
                break;
            case 4:
                hero.setName("[Gojo Saturo]");
                hero.setBackground("Gojo, a renowned sorcerer from Jujutsu High, is hailed as one of the strongest. With\n"
                        + "his enigmatic personality, playful nature, and iconic blindfold, Gojo possesses\n"
                        + "unparalleled skills in jujutsu. His dedication to protecting others is matched only by\n"
                        + "his enigmatic aura and the mysteries surrounding his true intentions.");
                hero.setMaxHp(1290);
                hero.setCurrentHp(hero.getMaxHp());
                hero.setMaxMana(415);
                hero.setCurrentMana(hero.getMaxMana());
                hero.setBaseAttack("Cursed Energy Blast");
                hero.setBaseDmg(120);
                hero.setBaseAttackDescription("Unleashes a ranged burst of cursed energy, dealing moderate damage.");
                hero.setBaseMana(50);
                hero.setRecharge("Mana Restoration");
                hero.setSkillAttack("Cursed Reversed Technique: Red");
                hero.setSkillDmg(300);
                hero.setSkillAttackDescription("Unleashes immense explosive force instantly, dealing significant damage.");
                hero.setSkillMana(150);
                hero.setSpecialAttack("Hollow Purple");
                hero.setSpecialDmg(550);
                hero.setSpecialAttackDescription("Unleashes a massive, unavoidable wave of cursed energy, dealing a high damage.");
                hero.setSpecialMana(250);
                
                
                //Stance for [Gojo] Character
                ImageIcon[] GojoStanceImages = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Gojo/stance1.png")),
                    new ImageIcon(getClass().getResource("/Gojo/stance2.png")),
                    new ImageIcon(getClass().getResource("/Gojo/stance3.png")),
                    new ImageIcon(getClass().getResource("/Gojo/stance4.png")),
                    new ImageIcon(getClass().getResource("/Gojo/stance5.png"))
                };
                hero.setHeroStanceImages(GojoStanceImages);

                // Basic Attack [Effects] Animation
                ImageIcon[] GojoBasicEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Gojo/attack1.png")),
                    new ImageIcon(getClass().getResource("/Gojo/attack2.png")),
                    new ImageIcon(getClass().getResource("/Gojo/attack3.png")),
                    new ImageIcon(getClass().getResource("/Gojo/attack4.png")),
                    new ImageIcon(getClass().getResource("/Gojo/attack5.png")),
                    new ImageIcon(getClass().getResource("/Gojo/attack6.png"))

                };
                hero.setHeroBasicEffect(GojoBasicEffect);
                //Skill Attack
                ImageIcon[] GojoSkillAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Gojo/skill1.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skill2.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skill3.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skill4.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skill5.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skill6.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skill7.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skill8.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skill10.png")),
                    
                };
                hero.setHeroSkillAttack(GojoSkillAttack);

                ImageIcon[] GojoSkillEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Gojo/skillef2_1.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef1.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef2_2.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef2.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef2_3.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef3.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef2_4.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef4.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef2_5.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef5.png")),
                    
                    
                };
                hero.setHeroSkillEffect(GojoSkillEffect);
                
                ImageIcon[] GojoSkillEffect2 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Gojo/skillef2_6.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef6.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef2_7.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef7.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef2_8.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef8.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef2_9.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef8.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef2_9.png")),
                    new ImageIcon(getClass().getResource("/Gojo/skillef8.png"))
                    
                    
                };
                hero.setHeroSkillEffect2(GojoSkillEffect2);

                ImageIcon[] GojoChargeEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Gojo/charge1.png")),
                    new ImageIcon(getClass().getResource("/Gojo/charge1.png")),
                    new ImageIcon(getClass().getResource("/Gojo/charge1.png")),
                    new ImageIcon(getClass().getResource("/Gojo/charge1.png")),
                    new ImageIcon(getClass().getResource("/Gojo/charge1.png")),
                    new ImageIcon(getClass().getResource("/Gojo/charge1.png"))
                    
                };
                
                hero.setHeroChargeEffect(GojoChargeEffect);

                ImageIcon[] GojoSpecialAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Gojo/ss1.png")),
                    new ImageIcon(getClass().getResource("/Gojo/ss2.png")),
                    new ImageIcon(getClass().getResource("/Gojo/ss3.png")),
                    new ImageIcon(getClass().getResource("/Gojo/ss4.png")),
                    new ImageIcon(getClass().getResource("/Gojo/ss5.png"))
                };
                hero.setHeroSpecialAttack(GojoSpecialAttack);

                ImageIcon[] GojoSpecialEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Gojo/ss6.png")),
                    new ImageIcon(getClass().getResource("/Gojo/ss7.png")),
                    new ImageIcon(getClass().getResource("/Gojo/ss8.png")),
                    new ImageIcon(getClass().getResource("/Gojo/ss9.png"))

                    
                };
                hero.setHeroSpecialEffect(GojoSpecialEffect);
                
                ImageIcon[] GojoSpecialEffect2 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Gojo/ss6.png")),
                    new ImageIcon(getClass().getResource("/Gojo/ss7.png")),
                    new ImageIcon(getClass().getResource("/Gojo/pain.png")),
                    new ImageIcon(getClass().getResource("/Gojo/ss_pain.png"))

                };
                hero.setHeroSpecialEffect2(GojoSpecialEffect2);
                
                ImageIcon[] GojoSpecialEffect3 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Gojo/ss6.png")),
                    new ImageIcon(getClass().getResource("/Gojo/ss7.png")),
                    new ImageIcon(getClass().getResource("/Gojo/yuji.png")),
                    new ImageIcon(getClass().getResource("/Gojo/ss_yuji.png"))

                };
                hero.setHeroSpecialEffect3(GojoSpecialEffect3);
                

                break;
            case 5:
                hero.setName("[Madara Uchiha]");
                hero.setBackground("Madara, a legendary figure in the shinobi world, seeks to establish a world of order\n"
                        + "through dominance. His mastery of Uchiha abilities and immense power make him a\n"
                        + "formidable adversary. Driven by a vision of peace through strength, Madara's history\n"
                        + "is intertwined with the complexities of the ninja world and the tragedies that\n"
                        + "shaped his ambitions.");
                hero.setMaxHp(1300);
                hero.setCurrentHp(hero.getMaxHp());
                hero.setMaxMana(380);
                hero.setCurrentMana(hero.getMaxMana());
                hero.setBaseAttack("Fire Style: Fireball Jutsu");
                hero.setBaseAttackDescription("Unleashes a fire-based attack, dealing moderate damage.");
                hero.setBaseMana(50);
                hero.setRecharge("Chakra Focus");
                hero.setSkillAttack("Susanoo");
                hero.setSkillAttackDescription("Summons a spectral warrior for high melee damage and attacks, dealing significant damage.");
                hero.setSkillMana(145);
                hero.setSpecialAttack("Tengai Shinsei");
                hero.setSpecialAttackDescription("Summons a colossal meteor from the sky, causing massive damage to crash down onto the battlefield.");
                hero.setSpecialMana(200);
                hero.setBaseDmg(112);
                hero.setSkillDmg(280);
                hero.setSpecialDmg(540);
                break;
            case 6:
                hero.setName("[Ichigo Kurosaki]");
                hero.setBackground("Ichigo Kurosaki is a high school student who is thrust into the world of soul reapers and hollows after gaining the powers of a Soul Reaper himself. Despite his initially brash and impulsive nature, Ichigo is fiercely protective of his friends and family, making him a formidable ally in battles against evil spirits. With his Zanpakuto, Zangetsu, and his Hollow powers, Ichigo faces numerous challenges to protect both the living and the dead.");
                hero.setMaxHp(1300);
                hero.setCurrentHp(hero.getMaxHp());
                hero.setMaxMana(400);
                hero.setCurrentMana(hero.getMaxMana());
                hero.setBaseAttack("Getsuga Tensho");
                hero.setBaseAttackDescription("Unleashes a powerful wave of spiritual energy in the form of a slashing projectile.");
                hero.setBaseMana(50);
                hero.setRecharge("Reiatsu Regeneration");
                hero.setSkillAttack("Forward Slash");
                hero.setSkillAttackDescription("Performs a swift and precise sword strike, dealing damage to enemies in front.");
                hero.setSkillMana(135);
                hero.setSpecialAttack("Vastro Lorde Blast");
                hero.setSpecialAttackDescription("Channels his inner Hollow powers to unleash a devastating blast of dark energy, causing massive damage to all foes.");
                hero.setSpecialMana(250);
                hero.setBaseDmg(112);
                hero.setSkillDmg(260);
                hero.setSpecialDmg(530);
                
                
                //intro transformation
                ImageIcon[] IchigoIntroTrans = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/intro1.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro2.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro3.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro4.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro5.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro6.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro7.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro8.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro9.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro10.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro11.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro12.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro13.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro14.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro15.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro16.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro17.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro18.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro19.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro20.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro21.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro22.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/intro23.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch1.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch2.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch3.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch4.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch5.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch6.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch7.png"))
                    
                };
                hero.setHeroIntroTrans(IchigoIntroTrans);
                
                //Trans2 for [Ichigo] Character
                ImageIcon[] IchigoIntroTrans2  = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/catch1.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch2.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch3.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch4.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch5.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch6.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/catch7.png"))
                };
                hero.setHeroIntroTrans2(IchigoIntroTrans2);

                //Stance for [Gojo] Character
                ImageIcon[] IchigoStanceImages = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/idle.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/idle2.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/idle3.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/idle4.png")),
                };
                hero.setHeroStanceImages(IchigoStanceImages);
                
                
                ImageIcon[] IchigoBlink = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/blink.png")),
                    
                };
                hero.setHeroBlinkEffect(IchigoBlink);
                
                
                // Basic Attack Animation
                ImageIcon[] IchigoBasicAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/attack1.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/attack2.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/attack3.png"))

                };
                hero.setHeroBasicAttack(IchigoBasicAttack);
                
                ImageIcon[] IchigoBasicAttack2 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/attack4.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/attack5.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/attack6.png"))

                };
                hero.setHeroBasicAttack2(IchigoBasicAttack2);
                /*
                ImageIcon[] IchigoBasicEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/attack4.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/attack5.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/attack6.png"))

                };
                hero.setHeroBasicEffect(IchigoBasicEffect);
                */
                ImageIcon[] IchigoBasicEffect2 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/suga1.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/suga2.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/suga3.png"))

                };
                hero.setHeroBasicEffect2(IchigoBasicEffect2);
                
                
                ImageIcon[] IchigoChargeEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/1.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/2.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/3.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/4.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/5.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/6.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/7.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/8.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/9.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/10.png")),
                    
                    

                };
                hero.setHeroChargeEffect(IchigoChargeEffect);
                
                ImageIcon[] IchigoSkillAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/blink.png")),
                };
                hero.setHeroSkillAttack(IchigoSkillAttack);
                
                 ImageIcon[] IchigoSkillEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/skill1.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/skill2.png")),

                };
                hero.setHeroSkillEffect(IchigoSkillEffect);
                
                ImageIcon[] IchigoSkillEffect2 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/skill3.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/skill4.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/skill6.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/skill7.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/skill8.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/skill9.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/skill10.png"))
                    

                };
                hero.setHeroSkillEffect2(IchigoSkillEffect2);
                
                
                
                ImageIcon[] IchigoSkillEffect3 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/skill11.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/skill12.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/skill13.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/skill14.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/skill15.png"))
                    

                };
                hero.setHeroSkillEffect3(IchigoSkillEffect3);
                
                ImageIcon[] IchigoSpecialAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/blink.png")),
                };
                hero.setHeroSpecialAttack(IchigoSpecialAttack);
                
                ImageIcon[] IchigoSpecialEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Ichigo/ss1.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/ss2.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/ss3.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/ss4.png"))
                };
                hero.setHeroSpecialEffect(IchigoSpecialEffect);
                
                ImageIcon[] IchigoSpecialEffect2 = new ImageIcon[]{
                   //Bomb
                    new ImageIcon(getClass().getResource("/Ichigo/ss6.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/ss7.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/ss8.png")),
                    new ImageIcon(getClass().getResource("/Ichigo/sss9.png"))
                    
                };
                hero.setHeroSpecialEffect2(IchigoSpecialEffect2);
             
                

                break;
   
            case 7:
                hero.setName("[Sukuna (King of Curses)]");
                hero.setBackground("Sukuna, the ancient and malevolent King of Curses, harbors immense power and malice.\n"
                        + "Revered for his unmatched strength and feared for his ruthlessness, Sukuna's\n"
                        + "existence poses a grave threat to both sorcerers and humanity. His inscrutable\n"
                        + "motives and sheer strength make him an enigmatic and terrifying entity.");
                hero.setMaxHp(1450);
                hero.setCurrentHp(hero.getMaxHp());
                hero.setMaxMana(420);
                hero.setCurrentMana(hero.getMaxMana());
                hero.setBaseAttack("Cursed Energy Slash");
                hero.setBaseAttackDescription("Unleashes a moderate cursed energy wave for moderate damage.");
                hero.setBaseMana(50);
                hero.setRecharge("Cursed Technique Restoration");
                hero.setSkillAttack("Great Dismantle");
                hero.setSkillAttackDescription("Targets the opponent's space, cutting through the very concept of space itself, dealing significant damage.");
                hero.setSkillMana(150);
                hero.setSpecialAttack("Domain Expansion: Malevolent Shrine");
                hero.setSpecialAttackDescription("Creates an overwhelming domain of cursed energy, causing devastation with a very high damage.");
                hero.setSpecialMana(230);
                hero.setSpecialMana(250);
                hero.setBaseDmg(112);
                hero.setSkillDmg(290);
                hero.setSpecialDmg(545);
                break;
            case 8:
                hero.setName("[Pain (Akatsuki)]");
                hero.setBackground("Sukuna, the ancient and malevolent King of Curses, harbors immense power and malice.\n"
                        + "Revered for his unmatched strength and feared for his ruthlessness, Sukuna's\n"
                        + "existence poses a grave threat to both sorcerers and humanity. His inscrutable\n"
                        + "motives and sheer strength make him an enigmatic and terrifying entity.");
                hero.setMaxHp(1400);
                hero.setCurrentHp(hero.getMaxHp());
                hero.setMaxMana(400);
                hero.setCurrentMana(hero.getMaxMana());
                hero.setBaseAttack("Almighty Push");
                hero.setBaseAttackDescription("Unleashes a moderate force-based attack dealing moderate damage.");
                hero.setBaseMana(50);
                hero.setRecharge("Chakra Infusion");
                hero.setSkillAttack("Shinra Tensei");
                hero.setSkillAttackDescription("Generates a massive repulsive force for significant  damage.");
                hero.setSkillMana(140);
                hero.setSpecialAttack("Chibaku Tensei");
                hero.setSpecialAttackDescription("Summons a celestial body to crush enemies, causing very high damage.");
                hero.setSpecialMana(220);
                hero.setBaseDmg(120);
                hero.setSkillDmg(290);
                hero.setSpecialDmg(550);
                break;
        }
        return hero;

    }

    public EnemyInfo initEnemyAttributes(int n) {
        EnemyInfo enemy = new EnemyInfo();
        switch (n) {
            case 1:
                enemy.setName("[Naruto Uzumaki]");
                enemy.setBackground("Naruto, a spirited ninja from the Hidden Leaf Village, holds within him the\n"
                        + "indomitable will to never give up. As a child, he was shunned for being the vessel of\n"
                        + "the Nine-Tailed Fox, but his unwavering determination and kind heart endeared him to\n"
                        + "those around him. With dreams of becoming the strongest ninja and the village's\n"
                        + "leader, Naruto faces challenges head-on, guided by his mantra, \"I won't go back on my\n"
                        + "word, that's my ninja way!\"\n");
                enemy.setMaxHp(1375);
                enemy.setCurrentHp(enemy.getMaxHp());
                enemy.setMaxMana(420);
                enemy.setCurrentMana(enemy.getMaxMana());
                enemy.setBaseAttack("Rasengan");
                enemy.setBaseAttackDescription("Unleashes a spinning orb of chakra, dealing moderate damage.");
                enemy.setBaseMana(50);
                enemy.setRecharge("Chakra Recovery");
                enemy.setSkillAttack("Shadow Clone Barrage");
                enemy.setSkillAttackDescription("Conjures multiple clones attacking simultaneously, inflicting significant damage.");
                enemy.setSkillMana(140);
                enemy.setSpecialAttack("Tailed Beast Rasengan");
                enemy.setSpecialAttackDescription("Channels the immense power of the Nine-Tails into a colossal Rasengan, causing very high damage.");
                enemy.setSpecialMana(220);
                enemy.setSpecialMana(220);
                enemy.setBaseDmg(110);
                enemy.setSkillDmg(275);
                enemy.setSpecialDmg(495);
                break;
            case 2:
                enemy.setName("[Sasuke Uchiha]");
                enemy.setBackground("Sasuke, from the prestigious Uchiha clan, seeks vengeance for the tragic fate of his\n"
                        + "family. Driven by a thirst for power and a desire for retribution against his brother,\n"
                        + "Itachi, Sasuke's journey is one of turmoil and conflict. His prodigious talent in\n"
                        + "ninjutsu and his brooding demeanor conceal the turmoil within, as he treads a path to discover his true purpose.\n");
                enemy.setMaxHp(1375);
                enemy.setCurrentHp(enemy.getMaxHp());
                enemy.setMaxMana(380);
                enemy.setCurrentMana(enemy.getMaxMana());
                enemy.setBaseAttack("Chidori");
                enemy.setBaseAttackDescription("Executes a swift and precise thrust of lightning, dealing moderate lightning-based damage.");
                enemy.setBaseMana(50);
                enemy.setRecharge("Chakra Infusion");
                enemy.setSkillAttack("Amaterasu");
                enemy.setSkillAttackDescription("Unleashes unquenchable black flames dealing significant damage.");
                enemy.setSkillMana(120);
                enemy.setSpecialAttack("Indra's Arrow");
                enemy.setSpecialAttackDescription("Releases an immense arrow of lightning for very high damage.");
                enemy.setSpecialMana(200);
                enemy.setBaseDmg(110);
                enemy.setSkillDmg(275);
                enemy.setSpecialDmg(495);
                break;
            case 3:
                enemy.setName("[Monkey D. Luffy]");
                enemy.setBackground("Luffy, the captain of the Straw Hat Pirates, dreams of finding the legendary One Piece\n"
                        + "and becoming the Pirate King. Possessing an insatiable appetite and an unwavering\n"
                        + "sense of loyalty to his crew, Luffy's defining trait is his fearlessness. With his\n"
                        + "elastic abilities gained from consuming a Devil Fruit, he sets sail across the Grand\n"
                        + "Line, making allies and enemies alike on his adventurous quest.\n");
                enemy.setMaxHp(1410);
                enemy.setCurrentHp(enemy.getMaxHp());
                enemy.setMaxMana(370);
                enemy.setCurrentMana(enemy.getMaxMana());
                enemy.setBaseAttack("Gomu Gomu no Pistol");
                enemy.setBaseAttackDescription("Unleashes a swift and forceful punch dealing moderate physical damage.");
                enemy.setBaseMana(50);
                enemy.setRecharge("Haki Focus");
                enemy.setSkillAttack("Gear Third");
                enemy.setSkillAttackDescription("Expands body parts to increase damage and attacks, inflicting significant damage.");
                enemy.setSkillMana(105);
                enemy.setSpecialAttack("Gear Fourth: Boundman");
                enemy.setSpecialAttackDescription("Transforms into a hulking form to deliver very high damage.");
                enemy.setSpecialMana(200);
                enemy.setBaseDmg(120);
                enemy.setSkillDmg(280);
                enemy.setSpecialDmg(500);
                break;
            case 4:
                enemy.setName("[Gojo Saturo]");
                enemy.setBackground("Gojo, a renowned sorcerer from Jujutsu High, is hailed as one of the strongest. With\n"
                        + "his enigmatic personality, playful nature, and iconic blindfold, Gojo possesses\n"
                        + "unparalleled skills in jujutsu. His dedication to protecting others is matched only by\n"
                        + "his enigmatic aura and the mysteries surrounding his true intentions.\n");
                enemy.setMaxHp(1435);
                enemy.setCurrentHp(enemy.getMaxHp());
                enemy.setMaxMana(415);
                enemy.setCurrentMana(enemy.getMaxMana());
                enemy.setBaseAttack("Cursed Energy Blast");
                enemy.setBaseAttackDescription("Unleashes a ranged burst of cursed energy, dealing moderate damage.");
                enemy.setBaseMana(50);
                enemy.setRecharge("Mana Restoration");
                enemy.setSkillAttack("Cursed Reversed Technique: Red");
                enemy.setSkillAttackDescription("Unleashes immense explosive force instantly, dealing significant damage.");
                enemy.setSkillMana(150);
                enemy.setSpecialAttack("Hollow Purple");
                enemy.setSpecialAttackDescription("Unleashes a massive, unavoidable wave of cursed energy, dealing a high damage.");
                enemy.setSpecialMana(250);
                enemy.setBaseDmg(120);
                enemy.setSkillDmg(300);
                enemy.setSpecialDmg(550);
                break;
            case 5:
                enemy.setName("[Madara Uchiha]");
                enemy.setBackground("Madara, a legendary figure in the shinobi world, seeks to establish a world of order\n"
                        + "through dominance. His mastery of Uchiha abilities and immense power make him a\n"
                        + "formidable adversary. Driven by a vision of peace through strength, Madara's history\n"
                        + "is intertwined with the complexities of the ninja world and the tragedies that\n"
                        + "shaped his ambitions.\n");
                enemy.setMaxHp(1390);
                enemy.setCurrentHp(enemy.getMaxHp());
                enemy.setMaxMana(380);
                enemy.setCurrentMana(enemy.getMaxMana());
                enemy.setBaseAttack("Fire Style: Fireball Jutsu");
                enemy.setBaseAttackDescription("Unleashes a fire-based attack, dealing moderate damage.");
                enemy.setBaseMana(50);
                enemy.setRecharge("Chakra Focus");
                enemy.setSkillAttack("Susanoo");
                enemy.setSkillAttackDescription("Summons a spectral warrior for high melee damage and attacks, dealing significant damage.");
                enemy.setSkillMana(145);
                enemy.setSpecialAttack("Tengai Shinsei");
                enemy.setSpecialAttackDescription("Summons a colossal meteor from the sky, causing massive damage to crash down onto the battlefield.");
                enemy.setSpecialMana(200);
                enemy.setBaseDmg(112);
                enemy.setSkillDmg(280);
                enemy.setSpecialDmg(540);

                //Stance for [Naruto] Character
                
                ImageIcon[] EnemyStanceImages = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Idle.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Idle1.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Idle2.png"))
                };
                enemy.setEnemyStanceImages(EnemyStanceImages);
                

                //Basic Attack Animation for [Naruto] Character
                ImageIcon[] EnemyBasicAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu1.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu3.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu4.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu5.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu6.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu7.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu8.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu9.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu10.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu11.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu12.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu13.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu14.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu15.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu16.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu17.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu18.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu19.png"))
                };
                enemy.setEnemyBasicAttack(EnemyBasicAttack);

                //Skill Attack Animation
                ImageIcon[] EnemySkillAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu1.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Katon_ Gōkakyū No Jutsu2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Senpo_ Ranton Koga.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Senpo_ Ranton Koga2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Senpo_ Ranton Koga3.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Senpo_ Ranton Koga4.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Senpo_ Ranton Koga5.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Senpo_ Ranton Koga6.png"))
                };
                enemy.setEnemySkillAttack(EnemySkillAttack);

                // Skill Attack [Effects] Animation
                ImageIcon[] EnemySkillEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Capture2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Capture3.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Capture4.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Capture5.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Capture6.png"))
                };
                enemy.setEnemySkillEffect(EnemySkillEffect);
                
                   
                ImageIcon[] EnemyChargeEffect = new ImageIcon[]{
                   new ImageIcon(getClass().getResource("/MadaraEnemy/char1.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/char2.png")),
                      new ImageIcon(getClass().getResource("/MadaraEnemy/char4.png")),
                       new ImageIcon(getClass().getResource("/MadaraEnemy/char5.png")),
                        new ImageIcon(getClass().getResource("/MadaraEnemy/char6.png")),
                         new ImageIcon(getClass().getResource("/MadaraEnemy/char7.png")),
                         new ImageIcon(getClass().getResource("/MadaraEnemy/char8.png")),
                         
                   
                };
                enemy.setEnemyChargeEffect(EnemyChargeEffect);
                
                ImageIcon[] EnemyChargeEffect2 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff1.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff3.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff3.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff3.png"))
                };
                
                enemy.setEnemyChargeEffect2(EnemyChargeEffect2);
                
                ImageIcon[] EnemySpecialAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Chibaku Tensei.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Chibaku Tensei1.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Chibaku Tensei2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Chibaku Tensei3.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/Chibaku Tensei4.png"))
                };
                
                enemy.setEnemySpecialAttack(EnemySpecialAttack);
                
                 ImageIcon[] EnemySpecialEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/MadaraEnemy/ss1.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/ss2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/ss3.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/ss4.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/ss7.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/ss8.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/ss9.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/ss10.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/ss11.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/ss12.png"))
                };
                
                enemy.setEnemySpecialEffect(EnemySpecialEffect);
                
                ImageIcon[] EnemySpecialEffect2 = new ImageIcon[]{
                  new ImageIcon(getClass().getResource("/MadaraEnemy/ss12.png")),
                  new ImageIcon(getClass().getResource("/MadaraEnemy/bom1.png")),
                  new ImageIcon(getClass().getResource("/MadaraEnemy/bom2.png")),
                  new ImageIcon(getClass().getResource("/MadaraEnemy/bom3.png")),
                  new ImageIcon(getClass().getResource("/MadaraEnemy/bom4.png")),
                  new ImageIcon(getClass().getResource("/MadaraEnemy/bom5.png")),
                  new ImageIcon(getClass().getResource("/MadaraEnemy/bom6.png")),
         
                };
                
                enemy.setEnemySpecialEffect2(EnemySpecialEffect2);
                
                
                
                
                
                
                
                
                
                
                break;

            case 6:
                enemy.setName("[Megumi Fushiguro]");
                enemy.setBackground("Megumi, a student at Tokyo Metropolitan Curse Technical College, is a reserved yet\n"
                        + "principled sorcerer. Possessing unique abilities to control shikigami, he grapples with his past while navigating the dangers of cursed spirits. His sense of justice\n"
                        + "and loyalty to his friends drive him to become a formidable force in the world of\n"
                        + "curses.");
                enemy.setMaxHp(1380);
                enemy.setCurrentHp(enemy.getMaxHp());
                enemy.setMaxMana(400);
                enemy.setCurrentMana(enemy.getMaxMana());
                enemy.setBaseAttack("Shikigami Strike");
                enemy.setBaseAttackDescription("Executes a moderate damage strike using Shikigami.");
                enemy.setBaseMana(50);
                enemy.setRecharge("Cursed Technique Restoration");
                enemy.setSkillAttack("Ten Shadows Technique: Divine Dog");
                enemy.setSkillAttackDescription("Summons two divine Shikigami dogs that execute attacks for significant damage.");
                enemy.setSkillMana(135);
                enemy.setSpecialAttack("Eight-Handled Sword Divergent Sila Divine General Mahoraga");
                enemy.setSpecialAttackDescription("Summons the Divine General Mahoraga, an immensely powerful and versatile Shikigami, dealing extremely high damage in a single attack.");
                enemy.setSpecialMana(250);
                enemy.setBaseDmg(112);
                enemy.setSkillDmg(260);
                enemy.setSpecialDmg(530);
                break;
            case 7:
                enemy.setName("[Yuji]");
                enemy.setBackground("Sukuna, the ancient and malevolent King of Curses, harbors immense power and malice.\n"
                        + "Revered for his unmatched strength and feared for his ruthlessness, Sukuna's\n"
                        + "existence poses a grave threat to both sorcerers and humanity. His inscrutable\n"
                        + "motives and sheer strength make him an enigmatic and terrifying entity.\n");
                enemy.setMaxHp(1450);
                enemy.setCurrentHp(enemy.getMaxHp());
                enemy.setMaxMana(420);
                enemy.setCurrentMana(enemy.getMaxMana());
                enemy.setBaseAttack("Cursed Energy Slash");
                enemy.setBaseAttackDescription("Unleashes a moderate cursed energy wave for moderate damage.");
                enemy.setBaseMana(50);
                enemy.setRecharge("Cursed Technique Restoration");
                enemy.setSkillAttack("Great Dismantle");
                enemy.setSkillAttackDescription("Targets the opponent's space, cutting through the very concept of space itself, dealing significant damage.");
                enemy.setSkillMana(150);
                enemy.setSpecialAttack("Domain Expansion: Malevolent Shrine");
                enemy.setSpecialAttackDescription("Creates an overwhelming domain of cursed energy, causing devastation with a very high damage.");
                enemy.setSpecialMana(230);
                enemy.setBaseDmg(112);
                enemy.setSkillDmg(290);
                enemy.setSpecialDmg(545);
                
                ImageIcon[] YujiStanceImages = new ImageIcon[]{
                  new ImageIcon(getClass().getResource("/Yuji/stand1.png")),
                  new ImageIcon(getClass().getResource("/Yuji/stand2.png")),
                  new ImageIcon(getClass().getResource("/Yuji/stand3.png")),
                  new ImageIcon(getClass().getResource("/Yuji/stand4.png")),
                };
                
                enemy.setEnemyStanceImages(YujiStanceImages);
                
                //Basic Attack Animation for [Pain] Character
                ImageIcon[] YujiBasicAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Yuji/yujibasic1.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujibasic2.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujibasic3.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujibasic4.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujibasic5.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujibasic6.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujibasic7.png"))
                    
                };
                enemy.setEnemyBasicAttack(YujiBasicAttack);
                
                //Skill Attack Animation
                ImageIcon[] YujiSkillAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Yuji/yujiskill1.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujiskill2.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujiskill3.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujiskill4.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujiskill5.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujiskill6.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujiskill7.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujiskill8.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujiskill9.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujiskill10.png"))

                    
                };
                enemy.setEnemySkillAttack(YujiSkillAttack);
                
                // Skill Attack [Effects] Animation
                ImageIcon[] YujiSkillEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Pain/skilleffect1.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect2.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect3.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect4.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect5.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect6.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect7.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect8.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect9.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect10.png")),
                };
                enemy.setEnemySkillEffect(YujiSkillEffect);
                
                ImageIcon[] YujiSpecialAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Yuji/sp1.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp2.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp3.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp4.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp5.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp6.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp7.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp8.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp9.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp10.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp11.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp12.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp13.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp14.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp15.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp16.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp17.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp19.png"))
                    
                };
                
                enemy.setEnemySpecialAttack(YujiSpecialAttack);
                
                 ImageIcon[] YujiSpecialEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Yuji/sp20.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp21.png"))
              
                };
                
                enemy.setEnemySpecialEffect(YujiSpecialEffect);
                
                ImageIcon[] YujiSpecialEffect2 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Yuji/sp22.png")),
                    new ImageIcon(getClass().getResource("/Yuji/sp23.png"))
                    
         
                };
                
                enemy.setEnemySpecialEffect2(YujiSpecialEffect2);
                
                ImageIcon[] YujiChargeEffect = new ImageIcon[]{
                    
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge1.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge2.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge3.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge4.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge5.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge6.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge7.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge8.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge9.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge10.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge5.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge4.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge3.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge2.png")),
                    new ImageIcon(getClass().getResource("/Yuji/yujicharge1.png"))
                         
                   
                };
                enemy.setEnemyChargeEffect(YujiChargeEffect);
                
                ImageIcon[] YujiChargeEffect2 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff1.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff3.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff3.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff3.png"))
                };
                
                enemy.setEnemyChargeEffect2(YujiChargeEffect2);
                
                break;
            case 8:
                enemy.setName("[Pain (Akatsuki)]");
                enemy.setBackground("Pain, a formidable enigma within the Akatsuki, embodies a haunting legacy forged by\n"
                        + "relentless strife and anguish. Born amidst the chaos of conflict and loss, Pain's\n"
                        + "past is veiled in tragedy, shaping his unwavering pursuit of a distorted peace.\n");
                enemy.setMaxHp(1400);
                enemy.setCurrentHp(enemy.getMaxHp());
                enemy.setMaxMana(400);
                enemy.setCurrentMana(enemy.getMaxMana());
                enemy.setBaseAttack("Almighty Push");
                enemy.setBaseAttackDescription("Unleashes a moderate force-based attack dealing moderate damage.");
                enemy.setBaseMana(50);
                enemy.setRecharge("Chakra Infusion");
                enemy.setSkillAttack("Shinra Tensei");
                enemy.setSkillAttackDescription("Generates a massive repulsive force for significant  damage.");
                enemy.setSkillMana(140);
                enemy.setSpecialAttack("Chibaku Tensei");
                enemy.setSpecialAttackDescription("Summons a celestial body to crush enemies, causing very high damage.");
                enemy.setSpecialMana(220);
                enemy.setBaseDmg(120);
                enemy.setSkillDmg(290);
                enemy.setSpecialDmg(550);
                
                ImageIcon[] PainStanceImages = new ImageIcon[]{
                  new ImageIcon(getClass().getResource("/Pain/Stance1.png")),
                  new ImageIcon(getClass().getResource("/Pain/Stance2.png")),
                  new ImageIcon(getClass().getResource("/Pain/Stance3.png")),
                  new ImageIcon(getClass().getResource("/Pain/Stance4.png")),
                };
                
                enemy.setEnemyStanceImages(PainStanceImages);
                
                //Basic Attack Animation for [Pain] Character
                ImageIcon[] PainBasicAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Pain/Air combo1.png")),
                    new ImageIcon(getClass().getResource("/Pain/Air combo2.png")),
                    new ImageIcon(getClass().getResource("/Pain/Air combo3.png")),
                    new ImageIcon(getClass().getResource("/Pain/Air combo4.png")),
                    new ImageIcon(getClass().getResource("/Pain/Air combo5.png")),
                    new ImageIcon(getClass().getResource("/Pain/Air combo6.png")),
                    new ImageIcon(getClass().getResource("/Pain/Air combo7.png")),
                    new ImageIcon(getClass().getResource("/Pain/Air combo8.png")),
                    new ImageIcon(getClass().getResource("/Pain/Air combo9.png")),
                    new ImageIcon(getClass().getResource("/Pain/Air combo10.png")),
                    new ImageIcon(getClass().getResource("/Pain/Air combo11.png")),
                    new ImageIcon(getClass().getResource("/Pain/Air combo12.png")),
                };
                enemy.setEnemyBasicAttack(PainBasicAttack);
                
                //Skill Attack Animation
                ImageIcon[] PainSkillAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Pain/5th sp1.png")),
                    new ImageIcon(getClass().getResource("/Pain/5th sp2.png")),

                    
                };
                enemy.setEnemySkillAttack(PainSkillAttack);
                
                // Skill Attack [Effects] Animation
                ImageIcon[] PainSkillEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Pain/skilleffect1.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect2.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect3.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect4.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect5.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect6.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect7.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect8.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect9.png")),
                    new ImageIcon(getClass().getResource("/Pain/skilleffect10.png")),
                };
                enemy.setEnemySkillEffect(PainSkillEffect);
                
                ImageIcon[] PainSpecialAttack = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Pain/special1.png")),
                    new ImageIcon(getClass().getResource("/Pain/special2.png")),
                    
                };
                
                enemy.setEnemySpecialAttack(PainSpecialAttack);
                
                 ImageIcon[] PainSpecialEffect = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Pain/special3.png")),
                    new ImageIcon(getClass().getResource("/Pain/special4.png")),
                    
                    
                    
                };
                
                enemy.setEnemySpecialEffect(PainSpecialEffect);
                
                ImageIcon[] PainSpecialEffect2 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/Pain/special5.png")),
                    new ImageIcon(getClass().getResource("/Pain/special6.png")),
                    new ImageIcon(getClass().getResource("/Pain/special7.png")),
                    new ImageIcon(getClass().getResource("/Pain/special8.png")),
                    new ImageIcon(getClass().getResource("/Pain/special9.png")),
                    
         
                };
                
                enemy.setEnemySpecialEffect2(PainSpecialEffect2);
                
                ImageIcon[] PainChargeEffect = new ImageIcon[]{
                    
                    new ImageIcon(getClass().getResource("/Pain/special1.png")),
                    new ImageIcon(getClass().getResource("/Pain/special2.png")),
                         
                   
                };
                enemy.setEnemyChargeEffect(PainChargeEffect);
                
                ImageIcon[] PainChargeEffect2 = new ImageIcon[]{
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff1.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff3.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff3.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff2.png")),
                    new ImageIcon(getClass().getResource("/MadaraEnemy/chargeEff3.png"))
                };
                
                enemy.setEnemyChargeEffect2(PainChargeEffect2);
                
                
                
                
                
                
                
                
                break;
        }
        return enemy;

    }

    public void displayInfo(HeroInfo heroInfo) {
        String name = "";
        int maxHp = 0;
        int currentHp = 0;
        int maxMana = 0;
        int currentMana = 0;
        String baseAttack = "";
        int baseMana = 0;
        String recharge = "";
        String skillAttack = "";
        int skillMana = 0;
        String specialAttack = "";
        int specialMana = 0;
        String baseAttackDescription = "";
        String skillAttackDescription = "";
        String specialAttackDescription = "";
        int baseDmg = 0;
        int skillDmg = 0;
        int specialDmg = 0;

        if (heroInfo != null) {
            name = heroInfo.getName();
            maxHp = heroInfo.getMaxHp();
            maxMana = heroInfo.getMaxMana();
            baseAttack = heroInfo.getBaseAttack();
            baseAttackDescription = heroInfo.getBaseAttackDescription();
            baseDmg = heroInfo.getBaseDmg();
            baseMana = heroInfo.getBaseMana();
            skillAttack = heroInfo.getSkillAttack();
            skillAttackDescription = heroInfo.getSkillAttackDescription();
            skillDmg = heroInfo.getSkillDmg();
            skillMana = heroInfo.getSkillMana();
            specialAttack = heroInfo.getSpecialAttack();
            specialAttackDescription = heroInfo.getSpecialAttackDescription();
            specialDmg = heroInfo.getSpecialDmg();
            specialMana = heroInfo.getSpecialMana();
            recharge = heroInfo.getRecharge();
        }

        System.out.println(name + "\n"
                + "Maximum HP: " + maxHp + "\n"
                + "Maximum HP: " + maxHp + "\n"
                + "Maximum Mana: " + maxMana + "\n"
                + "Skills:\n"
                + "Basic Attack (" + baseAttack + "): " + baseAttackDescription + "\n"
                + "Damage: " + baseDmg + " - 126 damage\n"
                + "Mana cost: " + baseMana + "\n"
                + "Recharge (" + recharge + "): Restores 40-60 mana.\n"
                + "Skill (" + skillAttack + "): " + skillAttackDescription + " \n"
                + "Dmg: " + skillDmg + " - 350  \n"
                + "Mana cost: " + skillMana + "\n"
                + "Special Skill (" + specialAttack + "): " + specialAttackDescription + " \n"
                + "Dmg: " + specialDmg + " - 560\n"
                + "Mana Cost: " + specialMana + "\n");
    }

    public void displayInfo(EnemyInfo enemyInfo) {
        String name = "";
        int maxHp = 0;
        int currentHp = 0;
        int maxMana = 0;
        int currentMana = 0;
        String baseAttack = "";
        int baseMana = 0;
        String recharge = "";
        String skillAttack = "";
        int skillMana = 0;
        String specialAttack = "";
        int specialMana = 0;
        String baseAttackDescription = "";
        String skillAttackDescription = "";
        String specialAttackDescription = "";
        int baseDmg = 0;
        int skillDmg = 0;
        int specialDmg = 0;

        if (enemyInfo != null) {
            name = enemyInfo.getName();
            maxHp = enemyInfo.getMaxHp();
            maxMana = enemyInfo.getMaxMana();
            baseAttack = enemyInfo.getBaseAttack();
            baseAttackDescription = enemyInfo.getBaseAttackDescription();
            baseDmg = enemyInfo.getBaseDmg();
            baseMana = enemyInfo.getBaseMana();
            skillAttack = enemyInfo.getSkillAttack();
            skillAttackDescription = enemyInfo.getSkillAttackDescription();
            skillDmg = enemyInfo.getSkillDmg();
            skillMana = enemyInfo.getSkillMana();
            specialAttack = enemyInfo.getSpecialAttack();
            specialAttackDescription = enemyInfo.getSpecialAttackDescription();
            specialDmg = enemyInfo.getSpecialDmg();
            specialMana = enemyInfo.getSpecialMana();
            recharge = enemyInfo.getRecharge();
        }

        System.out.println(name + "\n"
                + "Maximum HP: " + maxHp + "\n"
                + "Maximum Mana: " + maxMana + "\n"
                + "Skills:\n"
                + "Basic Attack (" + baseAttack + "): " + baseAttackDescription + "\n"
                + "Damage: " + baseDmg + " - 126 damage\n"
                + "Mana cost: " + baseMana + "\n"
                + "Recharge (" + recharge + "): Restores 40-60 mana.\n"
                + "Skill (" + skillAttack + "): " + skillAttackDescription + " \n"
                + "Dmg: " + skillDmg + " - 350  \n"
                + "Mana cost: " + skillMana + "\n"
                + "Special Skill (" + specialAttack + "): " + specialAttackDescription + " \n"
                + "Dmg: " + specialDmg + " - 560\n"
                + "Mana Cost: " + specialMana + "\n");
    }
}
