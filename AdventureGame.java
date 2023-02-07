/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import static adventuregame.Minions.counter1;
import static adventuregame.Minions.counter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author bisd988953
 */
public class AdventureGame {

    /**
     * @param args the command line arguments
     */
    static boolean loop = true;

    public static void main(String[] args) throws IOException {

        while (loop) {

            System.out.println("Hello and Welcome Welcome Welcome to the Ultimate Adventure Game of CPC");
            System.out.println("\t\tPick the path you want to travel on : ");
            System.out.println("(You need to put the number)");
            System.out.println("\t1.Start");
            System.out.println("\t2.Side game");
            System.out.println("\t3.End Program");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("\t4.(Save Point) Before First MiniBoss");
            System.out.println("\t5.(Save Point) Chapter 2 Start");
            System.out.println("\t6.(Save Point) Before Second MiniBoss");

            Scanner kbReader = new Scanner(System.in);

            int choice = kbReader.nextInt();

            switch (choice) {

                case 1: {

                    Story.Intro();
                    Story.firstFight();
                    Story.secondFight();
                    saveMethod.saveRandom();
                    Story.miniBoss();
                    Story.Chapter2();
                    Story.c2MinionFight();
                    Story.c2MinionFight2();
                    Story.c2miniBoss();
                    Story.finalBoss();
                    
                }break;

                default: {

                    Story.Intro();

                    Story.firstFight();
                    Story.secondFight();
                    Story.miniBoss();
                    
                }break;

                case 2: {
                    System.out.println("Be warned.... your data does not save after exit");
                    ButtonClick myWindow = new ButtonClick("ButtonClick the Game");
                    myWindow.setSize(650, 300);
                    myWindow.setVisible(true);
                    if (ButtonClick.numClicks == 100) {
                        System.out.println("Why....");

                    }
                    if (ButtonClick.numClicks == 404) {
                        System.out.println("Achevement not found");

                    }

                    if (ButtonClick.numClicks == 1000) {
                        System.out.println("You havent even tried have you?");

                    }
                    if (ButtonClick.numClicks == 1001) {
                        System.out.println("You have won...... banana");

                    }
                    if (ButtonClick.numClicks == 1500) {
                        System.out.println("You have the stuffs.... but what is you weapon in the game..banana?");

                    }
                    
                }break;
                case 3: {
                    loop = false;
                }
                case 4: {
                    saveMethod.saveRandom();
                    MiniBoss.bossDiolog1();
                    MiniBoss.bossHealth();
                    MiniBoss.amountOfturnsSwords();
                    System.out.println("After his defeat he says\"A true sayian always sprinkles when he tinkles\"");
                    AfterMiniBoss.AfterMiniBoss();
                    Berries.berrySearchoption();
                    saveMethod.saveRandom();
                    Skeleton.chapter2intro();
                    Skeleton.skeleton();

                    Skeleton.amountOfturnsSwords();
                    Skeleton.skeleton();
                    Skeleton.amountOfturnsSwords();
                    MiniBoss.bossDiolog2();
                    MiniBoss.bossHealth();
                    MiniBoss.amountOfturnsSwords();
                    System.out.println("\"you aren’t the first to beat me in combat and you won't be the last./"
                            + "\"you’re still weak! You won’t beat my master, meat sack!\""
                            + "Player: “ Oh yes, I will just like i slaughtered your skeletons before!”\n"
                            + "Boss: “ HAHA….I would like to see you try.” ");
                    AfterMiniBoss.AfterMiniBoss();
                    Story.finalBoss();
                }break;

                case 5: {
                    saveMethod.saveRandom();
                    Skeleton.chapter2intro();
                    Skeleton.skeleton();

                    Skeleton.amountOfturnsSwords();
                    Skeleton.skeleton();
                    Skeleton.amountOfturnsSwords();
                    MiniBoss.bossDiolog2();
                    MiniBoss.bossHealth();
                    MiniBoss.amountOfturnsSwords();
                    System.out.println("\"you aren’t the first to beat me in combat and you won't be the last./"
                            + "\"you’re still weak! You won’t beat my master, meat sack!\""
                            + "Player: “ Oh yes, I will just like i slaughtered your skeletons before!”\n"
                            + "Boss: “ HAHA….I would like to see you try.” ");
                    AfterMiniBoss.AfterMiniBoss();
                    Story.finalBoss();

                }break;
                case 6: {
                    saveMethod.saveRandom();
                    MiniBoss.bossDiolog2();
                    MiniBoss.bossHealth();
                    MiniBoss.amountOfturnsSwords();
                    System.out.println("\"you aren’t the first to beat me in combat and you won't be the last./"
                            + "\"you’re still weak! You won’t beat my master, meat sack!\""
                            + "Player: “ Oh yes, I will just like i slaughtered your skeletons before!”\n"
                            + "Boss: “ HAHA….I would like to see you try.” ");
                    AfterMiniBoss.AfterMiniBoss();
                    Story.finalBoss();
                }break;
            }
        }
    }
}
