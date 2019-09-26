package com.company;

import java.util.Scanner;

public class Spel {

    public Spel() {
    }

    private Robot[] rVekt;

    public void antRobot() {
        System.out.println("Hur många robotar vill du skapa?");
        Scanner scan = new Scanner(System.in);
        int antRobot = scan.nextInt();
        rVekt = new Robot[antRobot];
        skapaRobot();
    }

    public void skapaRobot() {
        for (int i = 0; i < rVekt.length; i++) {
            if (i % 2 == 0) {
                rVekt[i] = new Gepard();
            } else {
                rVekt[i] = new Zebra();
            }
        }
    }
}

