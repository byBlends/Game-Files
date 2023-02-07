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
public class Merchant {

    static int apply;
    static int apply1;
    static int Health = 20;
    static int damage;

    public static void merchant() {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("A shadow creeps out from behind a tree. A  masked figure stands before you cloaked in black. Looking around you see no one so you regard the man with caution and  take a step forward.");
        System.out.println("Hello young one");
        System.out.println("You say \"Who are you?\"");
        System.out.println("My name means nothing but i might have some items you would want");
        System.out.println("Come take a look");
        System.out.println("(put ok if loaded file)");
        System.out.println("(buy or no buy)");
        String input = kbReader.next();
        if (input.equalsIgnoreCase("buy")) {
            System.out.println("Oh good! I hope we can do this again sometime!");
            System.out.println("          ^");
            System.out.println("         ^ ^");
            System.out.println("         [ ]");
            System.out.println("         [ ]");
            System.out.println("         [ ]");
            System.out.println("         [ ]");
            System.out.println("         [ ]");
            System.out.println("         [ ]");
            System.out.println("         [ ]");
            System.out.println("         [ ]");
            System.out.println("|<<<<<<<<-O->>>>>>>>|");
            System.out.println("         #+#");
            System.out.println("         #+#");
            System.out.println("         #+#");
            System.out.println("         #+#");
            System.out.println("         #+#");
            System.out.println("         ( )");
            System.out.println("          *");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            sellingSword();

        } else if (input.equalsIgnoreCase("banana")) {
            System.out.println(" ||");
            System.out.println(" ||");
            System.out.println("|||||");
            System.out.println("\\\\\\");
            System.out.println(" \\\\\\");
            System.out.println("  \\\\\\\\");
            System.out.println("  ||||||||");
            System.out.println("  ||||||||");
            System.out.println("  ||||||||");
            System.out.println("  ||||||||");
            System.out.println("  ||||||||");
            System.out.println("  ||||||||");
            System.out.println("  ||||||||");
            System.out.println("  ||||||||");
            System.out.println("  ////////");
            System.out.println("///////");
            System.out.println("///////");
            System.out.println("/////");
            System.out.println("///");
            System.out.println("//");
            System.out.println("/");

            damage = 999;
            System.out.println(damage);
        } else {

            System.out.println("Hope you loaded your stuff");
        }

    }

    public static void sellingSword() {
        Random a = new Random();
        apply = a.nextInt(6);
        for (int counter = 4; counter < 5; counter++) {
            damage = +apply + 8;
            System.out.println("Your Sword has : " + (damage) + " damage");

        }
    }

    public static void swordDamage() {

        System.out.println("You did " + damage + " damage");

    }

    public static void fist() {
        Random damage1 = new Random();
        int apply2;
        for (int counter = 4; counter < 5; counter++) {
            apply2 = damage1.nextInt(5);
            String display = "Your fist do : " + (apply2 + 4) + " damage";
            System.out.println(display);
        }
    }
//    public static void health(){
//        Health = 20;
//    }

    public static void minionHit() {
        Random i = new Random();

        double maybe = i.nextInt(100);
        if (maybe > 10) {
            Random a = new Random();
            int s = a.nextInt(4);

            System.out.println("You have been hit");
            Health -= s + 2;
            System.out.println("You have " + Health + " health");
            System.out.println("He says\"");
            Minions.minionTaunt();
            System.out.println("\"");
        }
    }

    public static void swordUpgrade() {
        Random upgrade = new Random();
        int la = upgrade.nextInt(60);
        damage = apply + la + 20;
        System.out.println("You do " + damage + " this much damage " + " good for you ");
    }

    public static void merchantTwodiolog() {
        Delay delay = new Delay();
        Scanner kbReader1 = new Scanner(System.in);
        System.out.println("You are approched by a traveling merchant");
        delay.dialogDelay();
        System.out.println("He gives you an option to upgrade a sword");
        delay.dialogDelay();
        System.out.println("(upgrade or no upgrade)");
        String input = kbReader1.next();

        if (input.equals("upgrade")) {
            delay.dialogDelay();
            System.out.println("People will bow before your great sword ..... Thats what she said");
            swordUpgrade();

        }
    }

    public static void healthUpgrade() {
        Health += 30;
        System.out.println("Your health is " + Merchant.Health);
    }

    public static void skeletonHit() {
        Random i = new Random();

        double maybe = i.nextInt(100);
        if (maybe > 10) {
            Random a = new Random();
            int s = a.nextInt(3);
            Merchant.Health -= s+7;
        }
    }

}
