/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.Scanner;

/**
 *
 * @author bisd988953
 */
public class AfterMiniBoss {

    public static void AfterMiniBoss() {
        System.out.println("You have the option of:");
        System.out.println("\t1.Look for berries(Healing chance: May find rare berries)");
        System.out.println("\t2.Sword Upgrade");
        System.out.println("\t3.Health Upgrade");
        Scanner k = new Scanner(System.in);
        int choice = k.nextInt();
        switch (choice) {
            case 1: {
                Berries.Berries();
                break;
            }
            case 2: {
                Merchant.swordUpgrade();
                break;
            }
            case 3: {
                Merchant.healthUpgrade();
                break;
            }
            default: {
                System.out.println("Enter 1, 2 ,3");
                break;
            }
        }
    }
}
