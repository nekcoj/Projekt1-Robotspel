package com.company;

import java.util.Scanner;

public class Spel {
    private Spelplan s;
    public Robot[] rVekt;

    public Spel() {
        s = new Spelplan();
        skapaRobot(antRobot());
        flyttaRobot();
    }

    public int antRobot() {
        System.out.println("Hur många robotar vill du skapa?");
        Scanner scan = new Scanner(System.in);
        int antRobot = scan.nextInt();
        return antRobot;
    }

    public void skapaRobot(int antRobot) {
        //skapar robotar. kommer alltid skapa lika många eller fler zebror än geparder.
        rVekt = new Robot[antRobot];
        for (int i = 0; i < rVekt.length; i++) {
            if (i % 2 == 0) {
                rVekt[i] = new Zebra();     //Skapar objekt zebra.
            } else {
                rVekt[i] = new Gepard();    //Skapar objekt gepard.
            }
        }
    }

    public void flyttaRobot() {
        for (int stega = 0; stega < 20; stega++) {
            for (int i = 0; i < rVekt.length; i++) {
                double riktning = Math.random() * (2 - 1) + 1;      //slumpmässigt tal som bestämmer vilket håll roboten ska gå.
                if (Math.round(riktning) == 1) {
                    rVekt[i].startPunkt.setX(Math.round(Math.random() * (10 - 1) + 1));
                } else if (Math.round(riktning) == 2) {
                    rVekt[i].startPunkt.setY(Math.round(Math.random() * (10 - 1) + 1));
                }
            }
            //Test utskrift
            rVekt[1].printInfo();
        }
    }
}


