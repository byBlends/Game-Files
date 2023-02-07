/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bisd988953
 */
public class IntroAction {

    static String name;
    static String h, k;
    static int a = 0, x = 0;

    public static void intro() throws IOException {

        Delay delay = new Delay();
        System.out.println("Type your name here:");

        Scanner kbReader = new Scanner(System.in);
        name = kbReader.next();

        saveMethod.saveRandom();
        delay.dialogDelay();
        System.out.println("Are you Male or Female?");
        System.out.println("\t1.Male");
        System.out.println("\t2.Female");
        int m = 0;
        int f = 0;
        int i = kbReader.nextInt();
        switch (i) {
            case 1: {
                m++;
            }
            case 2: {
                f++;
            }
        }
        delay.dialogDelay();
        if (m == 1) {
            h = "You are male";
            a++;
        }
        if (f == 1) {
            k = "You are felmale";
            x++;
        }

        System.out.println("Do you want to change your name back or your gender?");
        System.out.println("\t1. Name");
        System.out.println("\t2. Gender");
        System.out.println("\t3. NO!!!");
        int w = kbReader.nextInt();
        boolean loop = true;
        while (loop) {
            switch (w) {
                case 1: {
                    System.out.println("Type your name");
                    kbReader.next();
                    System.out.println("Did you really think we'd let you change it back. Funny");
                    loop = false;

                }
                case 2: {
                    if (a == 1) {
                        System.out.println("You are male");

                    }
                    if (x == 1) {
                        System.out.println("You are female");
                    }
                    System.out.println("\t\tWhat is your gender");

                    System.out.println("\t1.Male");
                    System.out.println("\t2.Female");
                    int o = kbReader.nextInt();

                    switch (o) {
                        case 1: {
                            System.out.println("Ha, ya right");

                            break;
                        }
                        case 2: {
                            System.out.println("Your kidding me? Arent you?");

                            break;
                        }
                        default: {
                            System.out.println("I guess your gender isn't on the list");
                            loop = false;
                            break;
                        }
                    }
                }

                case 3: {
                    loop = false;
                }

            }

            System.out.println("Continue on your Adventure?(yes or no)");
            String line = kbReader.next();
            while (!line.equalsIgnoreCase("no") || !line.equalsIgnoreCase("yes")) {
                if (line.equalsIgnoreCase("yes") || line.equalsIgnoreCase("no")) {

                    break;
                }
                System.out.println("Enter \"yes\"or\"no\"");
                line = kbReader.next();

            }

            String l = line;

            if (l.equalsIgnoreCase("No")) {

//            System.out.println("Too bad your stuck and ");
                System.out.println("Since you think your better than me. Ill put you on the Death Trail");
                System.out.println("and I'm ignoring what ever you say until your done");
                System.out.println("You are walking through the woods and there is no one around");

                System.out.println("and your phone is dead");

                System.out.println("Out of the corner of your eye you spot him");
                delay.dialogDelay1();

                System.out.println("SHIA LEBOUFF");
                delay.dialogDelay();
                System.out.println("He gets on all fours and breaks into a sprint; hurry he is gaining on you");
                delay.dialogDelay1();
                System.out.println("Running from actual canibal Shia LeBouff");
                delay.dialogDelay1();

                System.out.println("Youve finnally lost him but are completely lost yourself");
                delay.dialogDelay2();
                System.out.println("Keeping in the shroud you are hiding from shia lebouff. You see a cabin. HOPE!!!!");
                delay.dialogDelay3();
                System.out.println("You creep closer to the cabin but waid AHHHH your leg.. its caught in a bear trap");
                delay.dialogDelay3();
                System.out.println("Nawing off your leg \"Quiet\" \"Quiet\"");
                delay.dialogDelay1();
                System.out.println("Limping to the cabin. \"Quiet\" \"Quiet\"");
                delay.dialogDelay1();
                System.out.println("Now your on the doorstep. Sitting inside Shia Lebouff. Barninshing a knife (shia lebouff).Sneaking up behind him.");
                delay.dialogDelay3();
                System.out.println("Your strangling superstart shia lebouff.You get the knife from him.");
                delay.dialogDelay();
                System.out.println("Stab it in his kidneys");
                delay.dialogDelay();
                System.out.println("Safe at last from Shia LeBouff");
                delay.dialogDelay();
                System.out.println("WAIT HE ISNT DEAD SHIA-SUPRIZE");
                delay.dialogDelay();
                System.out.println("Theres a gun to your head and death in his eyes");
                delay.dialogDelay2();
                System.out.println("but you can do tijitsu. You body slam superstar shia lebouff");
                delay.dialogDelay1();
                System.out.println("LEGENDARY FIGHT with SHIA LEBOUFF");
                delay.dialogDelay1();
                System.out.println("NORMAL TUESDAY NIGHT FOR SHIA LEBOUFF");
                delay.dialogDelay1();
                System.out.println("You try to swing an axe at shia lebouff");
                delay.dialogDelay();
                System.out.println("But blood is draining fast from your stump leg");
                delay.dialogDelay1();
                System.out.println("hey parries to left, he parries to the right, hes dodgeing every strike.");
                delay.dialogDelay2();
                System.out.println("You start to swing the axe and catch him in the neck, DECAPITATING SUPERSTAR SHIA LEBOUFF.You have killed Shia Lebouff");
                delay.dialogDelay2();
                System.out.println("Since you have survived you can continue.");
                delay.dialogDelay2();
                System.out.println("You are walking through the Shores of Time  ");
                Merchant.merchant();

            } else if (l.equalsIgnoreCase("Yes")) {

                System.out.println("You are walking through the Shores of Times");
                Merchant.merchant();

            }
        }
    }
}
