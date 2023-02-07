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
public class Berries {

    static int rB = 0;
    static int nB = 3;

    public static void Berries() {
        int j = 0;
        Random chance = new Random();
        int l = chance.nextInt(10);
        if (l == 2 || l == 5) {
            System.out.println("You've gotten a rare berry");
            System.out.println("This berry can be used to gain 8 life");
            rB += 1;
        } else if (l == 1 || l == 3) {

            System.out.println("Shouldnt have been looking for so many Berreis berries");
            System.out.println("While looking for berries you hear a voice");
            System.out.println("Berry snake\"You is selfish\"");
            System.out.println("The berry snake bit you in the butt");
            System.out.println("Now you gonna die");
            System.out.println("(You have now died. Please try again)");
            System.exit(0);
        } else if ((l > 5)) {
            System.out.println("You have found a berry. This can be used to gain 2 life");
            nB += 1;
        } else {
            System.out.println("You found nothing");
        }
    }

    public static void berryHeal() {

        Berries l = new Berries();
        System.out.println("Which berry do you want to use :");
        System.out.println("\t1.Normal Berry" + "\t\t\t\t\t\t\t" + "You have " + nB + " normal berries");
        System.out.println("\t2.Rare Berry" + "\t\t\t\t\t\t\t" + "You have " + rB + " rare berries");
        Scanner k = new Scanner(System.in);
        int choice = k.nextInt();
        switch (choice) {
            case 1: {
                if (nB >= 1) {
                    Merchant.Health += 2;
                    nB -= 1;
                    System.out.println("You now have " + nB);

                } else {
                    System.out.println("You dont have these berries");
                }
                break;
            }
            case 2: {
                if (rB >= 1) {
                    Merchant.Health += 8;
                    rB -= 1;
                    System.out.println("You now have " + rB);

                } else {
                    System.out.println("You dont have these berries");
                }
            }

        }

    }

    public static void berrySearchoption() {
        boolean loop = true;
        while (loop) {

            System.out.println("Do you want to search for berries?");
            System.out.println("\t1.Search for Berries");
            System.out.println("\t2. Continue on Adventure");
            Scanner k = new Scanner(System.in);
            int choice = k.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Be warned when looking for berries");

                    Berries.Berries();
                    break;
                }
                case 2: {
                    loop = false;

                }
            }
            if (Merchant.Health == 0) {
                AdventureGame.loop = false;
            }

        }
    }
}
