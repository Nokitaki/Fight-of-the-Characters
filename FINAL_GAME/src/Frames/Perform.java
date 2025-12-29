package Frames;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Philip
 */

import dataobject.EnemyInfo;
import dataobject.HeroInfo;

interface Perform {
    HeroInfo hero = new HeroInfo();
    EnemyInfo enemy = new EnemyInfo();
    void statsDisplay(HeroInfo hero, EnemyInfo enemy);
    void performBaseAttack(HeroInfo hero, EnemyInfo enemy);
    void performCharge(HeroInfo hero);
    void performSkillAttack(HeroInfo hero, EnemyInfo enemy);
    void performSpecialAttack(HeroInfo hero, EnemyInfo enemy);
    void EperformBaseAttack(HeroInfo hero, EnemyInfo enemy);
    void EperformCharge(EnemyInfo enemy);
    void EperformSkillAttack(HeroInfo hero, EnemyInfo enemy);
    void EperformSpecialAttack(HeroInfo hero, EnemyInfo enemy);
}
