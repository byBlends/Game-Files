package adventuregame;

import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Minions {

    static int lala = 0;

    static int apply;
    static int counter;
    static int counter1;
    static int Health;

    static boolean loop = true;

    public static void minionDiolog() {
        Delay delay = new Delay();
        System.out.println("You have run into a Minion!!!");
        delay.dialogDelay();
        System.out.println("He stares deep into you eyes and yells....");
        delay.dialogDelay();
        System.out.println("I'M GONNA KILL YOU!!!");
        delay.dialogDelay();
    }

    public static void minionDiolog1() {
        Delay delay = new Delay();
        System.out.println("You come across this old lady in a wheel chair. " + " You say" + ":what in gods grace is that!!!!");

        delay.dialogDelay();
        System.out.println("You punch her in the face and while on the ground she starts making noise ");
        delay.dialogDelay();
        System.out.println("She has transformed into a minion! ");
        delay.dialogDelay();
    }

    public static void minionHealth() {
        Random health = new Random();
        apply = health.nextInt(9);
        for (int counter = 4; counter < 5; counter++) {

            Health = apply + 25;
            System.out.println("This minions health is " + (apply + 25) + " health");

        }
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
            System.out.println("\t1.Fight" + "\t\t\t\t\t" + "Damage = " + Merchant.damage);
            System.out.println("\t2.Flee");
            System.out.println("\t3.Counter" + "t\t\t\t\t" + "Health = " + Merchant.Health);
            System.out.println("\t4.Heal");
            System.out.println("Enemy Health =" + Minions.Health);
            int l = 0;
            Scanner kbReader = new Scanner(System.in);
            int choice = kbReader.nextInt();

            switch (choice) {
                case 1: {

                    Merchant.minionHit();
                    if (Merchant.Health <= 0) {
                        System.out.println("You have died");
                        System.exit(0);
                    }
                    Merchant.swordDamage();

                    Minions.minionsHealth();

                    if (Minions.Health <= 0) {
                        loop = false;
                        System.out.println("The minion is dead. Good Job!!!");
                    }
                    break;
                }
                case 2: {
                    Merchant.minionHit();
                    Random c = new Random();

                    int chance = c.nextInt(100);
                    if (chance <= 1) {
                        System.out.println("You try fleeing");
                        System.out.println("You succeed");
                        loop = false;

                    } else {
                        System.out.println("You are stuck");

                        Merchant.minionHit();
                        if (Merchant.Health <= 0) {
                            System.out.println("You have died");
                            System.exit(0);
                        }
                        if (Minions.Health <= 0) {
                            loop = false;
                            System.out.println("The minion is dead. Good Job!!!");

                        }

                    }
                    break;
                }
                case 3: {
                    delay.dialogDelay();
                    System.out.println("You see the fire in the minions eyes.");
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

                    Minions.Health -= 3;
                    System.out.println("Minions health is" + Minions.Health);
                    Merchant.Health -= 3;
                    System.out.println("Your health is" + Merchant.Health);
                    if (Merchant.Health <= 0) {
                        System.out.println("You have died");
                        System.exit(0);
                    }
                    if (Minions.Health <= 0) {
                        loop = false;
                        System.out.println("The minion is dead. Good Job!!!");

                    }
                    break;
                }
                case 4: {
                    Berries.berryHeal();
                    System.out.println("You have " + Merchant.Health + " health");

                    break;
                }
                case 42: {
                    Minions.Health = 0;
                    System.out.println("The minion was no match for a hacker of your caliber.");
                    delay.dialogDelay();
                    System.out.println("You killed him in no time flat.");

                    loop = false;
                }
            }

        }
    }

    public static void minionsHealth() {

        System.out.println("The minion has " + (Minions.Health -= Merchant.damage) + " health." + " Keep it up");
    }

    public static void minionTaunt() {
        String[] taunt = {"Roses are red, violet are blue, god made me pretty; what happend to you?", "Your proof god has a sense of humor", "Your proof evolution can go in reverse", "Why dont you check your ebay and see if they have a life for sale", "Other people live and learn you just live", "You couldnt pour water out of a boot if the instructions were on the heel", "So a thought crossed your mind? Must have been a long a lonely journey", "I'll hit you so hard your kids will be born dizzy!"};
        Random la = new Random();
        int saw = la.nextInt(6);
        System.out.println(taunt[saw]);

    }

    public static void diologContin() {
        System.out.println("After the last fight you are scared for your life. The only option you have is to eat berries.");
        System.out.println(" You back travel to some bushes that you saw berries growing on. You eat the berries on top but they are very few. You take some but continue looking for berreies. ");
        System.out.println("While searching for more berries you see a omnificent  glow from behind a bush. You have found a Sword Modifacation(\"denananananna\"(zelda jingle)) ");

    }

}
