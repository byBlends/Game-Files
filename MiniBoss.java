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
public class MiniBoss {

    static int Health;
    static int apply;

    public static void bossHealth() {
        Random health = new Random();
        apply = health.nextInt(200);
        for (int counter = 4; counter < 5; counter++) {

            Health = apply + 250;
            System.out.println("This Bosses health is " + (apply + 250) + " health");

        }
    }

    public static void miniBossdamage() {
        Random i = new Random();
        int l = i.nextInt(100);
        if (l > 20) {
            Merchant.Health -= 10;
            System.out.println("You have " + Merchant.Health + " health");
        }
    }

    public static void bossDiolog() {
        Delay delay = new Delay();
        delay.dialogDelay();
        System.out.println("AHHHHHHH!!!!!, Daddy, I wanna a big boy hug");
        delay.dialogDelay();
        System.out.println("You punch him away and say, I'm not your father.");
        delay.dialogDelay();
        System.out.println("amsbekfughodgholsdhgol!!!!! I am going to kill you for destroying my dreams");
        delay.dialogDelay();

    }

    public static void bossDiolog1() {
        Delay delay = new Delay();

        System.out.println("You have come across a bolder, but its not just a bolder. Its a rock!!!! Its a rock!!!!!");

        delay.dialogDelay();
        System.out.println("You notice the rock move. You look around it and see kaka carrot cake's brother. Virgina!!!!! ");
        delay.dialogDelay();
        System.out.println("You say: Hanging out with little boys in spandex I see.");
        delay.dialogDelay();
    }

    public static void bossDiolog2() {
        System.out.println("You say\"Whats up?\"");
        System.out.println("He says\"Nothing much\"");
        System.out.println("You reply\"So how are you?\"");
        System.out.println("He waits 3 seconds then says \"Im going to kill you\"");

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
            System.out.println("\t3.Counter" + "\t\t\t" + "Health = " + Merchant.Health);
            System.out.println("\t4.Heal");
            System.out.println("Enemy Health = "+ MiniBoss.Health);
            Scanner kbReader = new Scanner(System.in);
            int choice = kbReader.nextInt();

            switch (choice) {
                case 1: {
                    Merchant.swordDamage();
                    MiniBoss.miniBossdamage();
                    MiniBoss.Health -= Merchant.damage;
                    System.out.println("The boss health is " + MiniBoss.Health + " health");

                    if (Merchant.Health <= 0) {
                        System.out.println("You have died");
                        System.exit(0);
                    }
                    if (MiniBoss.Health <= 0) {
                        loop = false;
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
                        System.out.println("He says\"Dont run away from me boy\"");
                        Random i = new Random();
                        int l = i.nextInt(10);
                        if (l > 8) {
                            MiniBoss.miniBossdamage();
                        }
                        if (Merchant.Health <= 0) {
                            System.out.println("You have died");
                            System.exit(0);
                        }

                        break;
                    }

                }

                case 3:

                    System.out.println("You ready yourself");
                    delay.dialogDelay();
                    System.out.println("He takes a deep breath" + "as he vaccums the air around him you see white puffs of gas go into his mouth");
                    delay.dialogDelay();
                    System.out.println("As you look for the gas origin you see them come from the clouds" + "They're Angle Souls!!!!!!!!!!!!!!");
                    delay.dialogDelay();
                    System.out.println("You laugh at his stupidity while he gets up");
                    delay.dialogDelay();
                    System.out.println("He sceeches and runs slashing at you with furry ");
                    delay.dialogDelay();
                    System.out.println("You dodge all of his attacks and sweep beneth his feet");
                    delay.dialogDelay();
                    System.out.println("While he is down you stomp on him and say " + "You chose the wrong place" + "and you kill him in cold blood");
                    lala++;
                    MiniBoss.Health -= 25;
                    Merchant.Health -= 5;
                    if (MiniBoss.Health <= 0) {
                        loop = false;

                    }
                    if (Merchant.Health <= 0) {
                        System.out.println("You have died");
                        System.exit(0);
                    }
                    break;
                case 4: {
                    Berries.berryHeal();
                    System.out.println("You have " + Merchant.Health + " health");
                    break;
                }
                case 42: {
                    MiniBoss.Health = 0;
                    System.out.println("The Boss was no match for a hacker of your caliber.");
                    delay.dialogDelay();
                    System.out.println("You killed him in no time flat.");

                    loop = false;
                }
            }
        }

    }
}
