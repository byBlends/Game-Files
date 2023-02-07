package adventuregame;

import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nick
 */
public class Story {
    
    static String name; 
    static int sidepath = 0;
    public static void Intro() throws IOException{
        
        IntroAction.intro();
    }
    
    public static void firstFight(){
        System.out.println("After the merchant passes you go ahead down the trail");
        System.out.println("You hear ruffling in the bushes and prepare to attack");
        Minions.minionDiolog();
        System.out.println("He says:");
        Minions.minionTaunt();
        Minions.minionHealth();
        System.out.println("You have 3 turns to kill him");
        
        Minions.amountOfturnsSwords();
        Berries.berrySearchoption();
        
    }
    public static void secondFight() throws IOException{
        System.out.println("With blood on your hands you continue your adventure");         
        Minions.minionDiolog1();
        System.out.println("He says\"");
        Minions.minionTaunt();
        Minions.minionHealth();
        System.out.println("You have 3 turns to kill him");
        
        Minions.amountOfturnsSwords();
        System.out.println("You are hit");
        Minions.minionTaunt();
        Berries.berrySearchoption();
        Minions.diologContin();
       
        saveMethod.minibossConintue();
   
    }
    public static void miniBoss(){
        MiniBoss.bossDiolog1();
        MiniBoss.bossHealth();
        MiniBoss.amountOfturnsSwords();
        System.out.println("After his defeat he says\"A true sayian always sprinkles when he tinkles\"");
        AfterMiniBoss.AfterMiniBoss();
        
    }
    public static void Chapter2() throws IOException{
        saveMethod.saveRandom();
         Skeleton.chapter2intro();
         
         
         
    }
    public static void c2MinionFight(){
        Skeleton.skeleton();
        
        Skeleton.amountOfturnsSwords();
    }
    public static void c2MinionFight2(){
        Skeleton.skeleton();
        Skeleton.amountOfturnsSwords();
    }
    public static void c2miniBoss(){
        MiniBoss.bossDiolog2();
        MiniBoss.bossHealth();
        MiniBoss.amountOfturnsSwords();
        System.out.println("\"you aren’t the first to beat me in combat and you won't be the last./"
                + "\"you’re still weak! You won’t beat my master, meat sack!\""
                + "Player: “ Oh yes, I will just like i slaughtered your skeletons before!”\n"
                + "Boss: “ HAHA….I would like to see you try.” ");
        AfterMiniBoss.AfterMiniBoss();
    }
    public static void finalBoss(){
        FinalBoss.bossDiolog();
        FinalBoss.bossHealth();
        FinalBoss.amountOfturnsSwords();
        
    }






}
