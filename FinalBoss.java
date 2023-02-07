/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import static adventuregame.Minions.lala;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bisd988953
 */
public class FinalBoss {

    static int Health;
    static int apply;

    public static void bossHealth() {
        Random health = new Random();
        apply = health.nextInt(350);
        for (int counter = 4; counter < 5; counter++) {

            Health += apply + 250;
            System.out.println("This Bosses health is " + MiniBoss.Health + " health");

        }
    }

    public static void bossDiolog() {
        Delay delay = new Delay();
        System.out.println("You say\"who are you suppost to behhhhhh\"");
        delay.dialogDelay();
        System.out.println("He responds\"kaka karrot cake\"");
        delay.dialogDelay();
        System.out.println("He says\"I am real super sayian legend");
        delay.dialogDelay();
        System.out.println("The defeated Virgina cuts in and says\" kaka karrot kake. When I was little he... he didn't invite me to his birthday party");
        delay.dialogDelay();
        System.out.println("Karrot Cake says\"Your a Monster" + IntroAction.name);
        delay.dialogDelay();
        System.out.println("You reply\"The cake was delicious\"");
        delay.dialogDelay();
        System.out.println("Virgina continues\"Kaka Karmen Electra show him what it means to be super sayian legend...\"" + "\t now im dead(virgina dies)");
        delay.dialogDelay();
        System.out.println("Because of virginas death karrot cake gets mad and screams\"");
        delay.dialogDelay();
        System.out.println("You fake your death and when no one is looking you pop up and kill GooGoo Eyes and Ka-ka-Kristan Stewart");
        delay.dialogDelay();
        System.out.println("With the death of another one of his friends Karrot Cake starts getting really, really angry and starts huffing and puffing.He has transforms into a super sayian, but you mistake it for being gay"
                + " because of his hair changing to yellow and spikey");

    }

    public static void bossDiolog1() {

        System.out.println("You say\"I guess it is true. He is super sayian lesbian\"");
    }

    public static void amountOfturnsSwords() {

        boolean loop = true;
        //lala =0;
        while (loop) {
            Delay delay = new Delay();
            if (Merchant.Health <= 10) {
                System.out.println("WATCH YOUR HEALTH");
            }

            System.out.println("\t\tWhat do you want to do: ");
            System.out.println("\t1.Fight" + "\t\t\t\t" + "Damage = " + Merchant.damage);
            System.out.println("\t2.Flee");
            System.out.println("\t3.Counter" + "\t\t\t\t" + "Health = " + Merchant.Health);
            System.out.println("\t4.Heal");
            System.out.println("Enemy Health = " + FinalBoss.Health );
            Scanner kbReader = new Scanner(System.in);
            int choice = kbReader.nextInt();

            switch (choice) {
                case 1: {

                    if (Merchant.Health <= 0) {
                        System.out.println("You have died");
                        System.out.println("Your final words are\"I guess he really is super sayian legend\"");
                        System.exit(0);
                    }
                    Merchant.swordDamage();
                    FinalBoss.BossDamage();
                    FinalBoss.Health = -Merchant.damage;

                    if (FinalBoss.Health <= 0) {
                        System.exit(0);
                    }
                    break;
                }
                case 2: {
                    Random c = new Random();
                    int maybe = 5;
                    int chance = c.nextInt(10);
                    if (chance >= maybe) {
                        System.out.println("You try fleeing");
                        System.out.println("You succeed");
                        loop = false;
                    } else {
                        System.out.println("You are stuck");
                        System.out.println("You suck");

                        if (FinalBoss.Health <= 0) {
                            System.exit(0);

                        }
                        break;
                    }
                }
                case 3:

                    System.out.println("You ready yourself");
                    delay.dialogDelay();
                    System.out.println("He takes a deep breath " + "as he vaccums the air around him you see white puffs of gas go into his mouth");
                    delay.dialogDelay();
                    System.out.println("As you look for the gas origin you see them come from the clouds" + "They're Angle Souls!!!!!!!!!!!!!!");
                    delay.dialogDelay();
                    System.out.println("You laugh at his stupidity while he gets up");
                    delay.dialogDelay();
                    System.out.println("He sceeches and runs slashing at you with furry ");
                    delay.dialogDelay();
                    System.out.println("You dodge all of his attacks and sweep beneth his feet");
                    delay.dialogDelay();
                    System.out.println("While he is down you stomp on him and say \"   You chose the wrong place\" and you kill him in cold blood");
                    lala++;
                    FinalBoss.Health -= 15;
                    Merchant.Health -= 10;

                    if (Merchant.Health <= 0) {
                        System.out.println("You have died");
                        System.exit(0);
                    }
                    if (FinalBoss.Health <= 0) {
                        System.exit(0);

                    }
                    break;

                case 4: {

                    Berries.berryHeal();
                    System.out.println("You have" + Merchant.Health + "health");
                }
            }

        }
    }

    public static void BossDamage() {
        Random l = new Random();
        int a = l.nextInt(10);
        if (a < 3) {
            System.out.println("Kaka Carrot Cakes screams\"Ima firin my lazer!!!!! bladsjklafjlkdfsjalkfadsjlkdsafj\"");
            Merchant.Health -= 50;
        }
    }
}
