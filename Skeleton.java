/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bisd988953
 */
public class Skeleton {

    static int Health;

    public static void skeleton() {
        Delay delay = new Delay();
        System.out.println("I'm going to take my arm off and kill you with it...MEATSACK!!!");
        delay.dialogDelay();
        Random l = new Random();
        int i = l.nextInt(20);
        Health = i + 25;
        System.out.println("Skeleton has " + " " + Health + " health");

    }

    public static void skeleDamage() {

        Delay delay = new Delay();
        Random i = new Random();
        double maybe = i.nextInt(100);
        if (maybe > 10) {
            Merchant.Health -= 9;
            System.out.println("Im gonna rip off your flesh and eat it");
        }

    }

    public static void amountOfturnsSwords() {

        boolean loop = true;
        //lala =0;
        while (loop) {
            Delay delay = new Delay();

            System.out.println("\t\tWhat do you want to do: ");
            System.out.println("\t1.Fight" + "\t\t\t\t\t" + "Damage = " + Merchant.damage);
            System.out.println("\t2.Flee");
            System.out.println("\t3.Counter" + "\t\t\t\t" + "Health = " + Merchant.Health);
            System.out.println("\t4.Heal");
            System.out.println("Enemy Health = "+ Skeleton.Health);

            Scanner kbReader = new Scanner(System.in);
            int choice = kbReader.nextInt();

            switch (choice) {
                case 1: {
                    Merchant.skeletonHit();
                    if (Merchant.Health <= 0) {
                        System.out.println("You have died");
                        System.exit(0);
                    }
                    
                    Skeleton.Health -= Merchant.damage;

                    System.out.println("The skeleton has " + Skeleton.Health + " health");

                    if (Skeleton.Health <= 0) {
                        loop = false;
                        System.out.println("The skeleton is dead. Good Job!!!");
                    }
                    break;
                }
                case 2: {
                    Merchant.skeletonHit();
                    Random c = new Random();
                    int maybe = 5;
                    int chance = c.nextInt();
                    if (chance <= maybe) {
                        System.out.println("You try fleeing");
                        System.out.println("You succeed");
                        loop = false;

                    } else {
                        Merchant.skeletonHit();
                        System.out.println("You are stuck");

                        Merchant.skeletonHit();
                        if (Merchant.Health <= 0) {
                            System.out.println("You have died");
                            System.exit(0);
                        }
                        if (Skeleton.Health <= 0) {
                            loop = false;
                            System.out.println("The minion is dead. Good Job!!!");

                        }
                        break;
                    }
                }
                case 3: {
                    delay.dialogDelay();
                    System.out.println("You see the fire in the skeleton eyes.");
                    delay.dialogDelay();
                    System.out.println("He makes a move to swing and you twist your body, moving out of the path of the sword.");
                    delay.dialogDelay();
                    System.out.println("As it swings past you it skims your body leaving a shallow cut. A moment of silence sweeps over both of you as you tighten your grip on your sword.");
                    delay.dialogDelay();
                    System.out.println("He swings with the intent to kill and you dodge all swipes until he catches you in your arm.");
                    delay.dialogDelay();
                    System.out.println("His sword is stuck in your arm, so you take your sword and stab him in his back.");
                    delay.dialogDelay();
                    System.out.println("Blood is gushing from both your wounds and is mixing. You might have herpes now.");

                    Skeleton.Health -= 4;
                    System.out.println("Minions health is" + Skeleton.Health);
                    Merchant.Health -= 4;
                    System.out.println("Your health is" + Merchant.Health);
                    if (Merchant.Health <= 0) {
                        System.out.println("You have died");
                        System.exit(0);
                    }
                    if (Skeleton.Health <= 0) {
                        loop = false;
                        System.out.println("The skeleton is dead. Good Job!!!");

                    }
                    break;
                }
                case 4: {
                    Berries.berryHeal();
                    System.out.println("You have" + Merchant.Health + "health");

                    break;
                }
                case 42: {
                    Skeleton.Health = 0;
                    System.out.println("The minion was no match for a hacker of your caliber.");
                    delay.dialogDelay();
                    System.out.println("You killed him in no time flat.");

                    loop = false;
                }
            }
        }
    }

    public static void chapter2intro() {
        Delay delay = new Delay();
        System.out.println("You keep on your journey until…..Floop!");
        delay.dialogDelay1();
        System.out.println("The ground falls in underneath you and land on a pile of bones.");
        delay.dialogDelay1();
        System.out.println("You look around in terror till you find a metallic object...  a Flashlight!");
        delay.dialogDelay2();
        System.out.println("You turn in on and see that there is a door at the bottom of the pile.");
        delay.dialogDelay2();
        System.out.println("You try to get yourself up but end up falling down and then tumbling down the pile of bones.");
        delay.dialogDelay2();
        System.out.println("BAMMM! you hit Your head on the door.");
        delay.dialogDelay();
        System.out.println("You get up, in pain, and open the door.");
        delay.dialogDelay();
        System.out.println("Only to see a light from the end of a long and narrow hallway.");
        delay.dialogDelay1();
        System.out.println("You limp towards the light, until………");
        delay.dialogDelay();
    }
}
