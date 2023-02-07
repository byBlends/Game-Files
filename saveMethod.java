/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author bisd988953
 */
public class saveMethod {

    public static void save(int health, int damage, int nB, int rB) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Public\\Documents\\AdventureGame Addons\\Save 1.txt");
        PrintWriter output = new PrintWriter(fw);
        output.println(health);
        output.println(damage);
        output.println(nB);
        output.println(rB);
        output.close();
        fw.close();
    }

    public static void save1(int health, int damage, int nB, int rB) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Public\\Documents\\AdventureGame Addons\\Save 2.txt");
        PrintWriter output = new PrintWriter(fw);
        output.println(health);
        output.println(damage);
        output.println(nB);
        output.println(rB);
        output.close();
        fw.close();
    }

    public static void load() throws IOException {
        Scanner sf = new Scanner(new File("C:\\Users\\Public\\Documents\\AdventureGame Addons\\Save 1.txt"));
        Merchant.Health = sf.nextInt();
        Merchant.damage = sf.nextInt();
        Berries.nB = sf.nextInt();
        Berries.rB = sf.nextInt();
        sf.close();
    }

    public static void load1() throws IOException {
        Scanner sf = new Scanner(new File("C:\\Users\\Public\\Documents\\AdventureGame Addons\\Save 2.txt"));
        Merchant.Health = sf.nextInt();
        Merchant.damage = sf.nextInt();
        Berries.nB = sf.nextInt();
        Berries.rB = sf.nextInt();
        sf.close();
    }

    public static void minibossConintue() throws IOException {
        boolean loop = true;
        while (loop) {
            System.out.println("\t1.Damage Upgrade");
            System.out.println("\t2.Health Upgrade");
            System.out.println("\t3.Continue");
            Scanner l = new Scanner(System.in);
            int choice = l.nextInt();
            switch (choice) {
                case 1: {
                    Merchant.swordUpgrade();
                    loop = false;
                }
                case 2: {
                    Merchant.healthUpgrade();
                    loop = false;
                }

                case 3: {
                    loop = false;
                }

            }

        }
    }

    public static void saveRandom() throws IOException {
        System.out.println("\t1.Save");

        System.out.println("\t2.Load");
        System.out.println("\t3.Continue");
        boolean loop = true;
        while (loop) {
            Scanner l = new Scanner(System.in);
            int choice = l.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("\t1.Save 1");
                    System.out.println("\t2.Save 2");
                    Scanner q = new Scanner(System.in);
                    int a = q.nextInt();
                    switch (a) {
                        case 1: {
                            saveMethod.save(Merchant.Health, Merchant.damage, Berries.nB, Berries.rB);
                            
                        }break;
                        case 2: {
                            saveMethod.save1(Merchant.Health, Merchant.damage, Berries.nB, Berries.rB);
                            
                        }break;

                    }

                }break;
                case 2: {
                    System.out.println("\t1.Load 1");
                    System.out.println("\t2.Load 2");
                    Scanner q = new Scanner(System.in);
                    int a = q.nextInt();
                    switch (a) {
                        case 1: {
                            saveMethod.load();
                            
                        }break;
                        case 2: {
                            saveMethod.load1();
                            
                        }break;

                    }

                }

                case 3: {
                    loop = false;
                }

            }
        }
    }
}
