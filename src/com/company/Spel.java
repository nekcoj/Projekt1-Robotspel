package com.company;

import java.util.Scanner;

public class Spel implements SpelInterface {
    protected Spelplan s;
    public Robot[] rVekt;

    public Spel() {

        //JFrame s = new Spelplan();
        //s.setVisible(true);
        //skapaRobot(antRobot());
        //flyttaRobot();

    }

    //metod som kallas på för att användaren ska mata in antal robotar som ska finnas i "spelet".
    public int antRobot() {
        System.out.println("Hur många robotar vill du skapa?");
        Scanner scan = new Scanner(System.in);
        int antRobot = scan.nextInt();
        return antRobot;
    }

    //metod som skapar robotar. kommer alltid skapa lika många eller fler zebror än geparder.
    public void skapaRobot(int antRobot) {
        rVekt = new Robot[antRobot];
        for (int i = 0; i < rVekt.length; i++) {
            if (i % 2 == 0) {
                rVekt[i] = new Zebra();     //Skapar objekt zebra.
            } else {
                rVekt[i] = new Gepard();    //Skapar objekt gepard.
            }
        }
    }

    //metod som flyttar robotarna om vissa parametrar uppfylls.(om geparden är hungrig, om zebran lever).
    public void flyttaRobot() {
        for (int stega = 0; stega < 5; stega++) {
            for (int i = 0; i < rVekt.length; i++) {
                if (rVekt[i].getStatus()) {
                    double riktning = Math.round(Math.random() * (4 - 1) + 1);      //slumpmässigt tal som bestämmer vilket håll roboten ska gå.
                    switch ((int) riktning) {
                        case 1:         //adderar till x koordinat
                            rVekt[i].startPunkt.setX(rVekt[i].startPunkt.getX() + (Math.round(Math.random() * (10 - 1) + 1)));
                            if (rVekt[i].startPunkt.getX() > 50 && rVekt[i].getStatus()) {
                                rVekt[i].startPunkt.setX(50);
                                double restSteg = rVekt[i].startPunkt.getX() - 50;
                                rVekt[i].startPunkt.setY(restSteg);
                            }
                            kollaPosition();
                            break;
                        case 2:         //adderar till y koordinat
                            rVekt[i].startPunkt.setY(rVekt[i].startPunkt.getY() + (Math.round(Math.random() * (10 - 1) + 1)));
                            if (rVekt[i].startPunkt.getY() > 50 && rVekt[i].getStatus()) {
                                rVekt[i].startPunkt.setY(50);
                                double restSteg = rVekt[i].startPunkt.getY() - 50;
                                rVekt[i].startPunkt.setX(rVekt[i].startPunkt.getX() - restSteg);
                            }
                            kollaPosition();
                            break;
                        case 3:         //subtraherar x koordinat
                            rVekt[i].startPunkt.setX(rVekt[i].startPunkt.getX() - (Math.round(Math.random() * (10 - 1) + 1)));
                            if (rVekt[i].startPunkt.getX() < 0 && rVekt[i].getStatus()) {
                                rVekt[i].startPunkt.setX(0);
                                double restSteg = Math.abs(rVekt[i].startPunkt.getX());
                                rVekt[i].startPunkt.setY(rVekt[i].startPunkt.getY() - restSteg);
                            }
                            kollaPosition();
                            break;
                        case 4:         //subtraherar y koordinat
                            rVekt[i].startPunkt.setY(rVekt[i].startPunkt.getY() - (Math.round(Math.random() * (10 - 1) + 1)));
                            if (rVekt[i].startPunkt.getY() < 0 && rVekt[i].getStatus()) {
                                rVekt[i].startPunkt.setY(0);
                                double restSteg = Math.abs(rVekt[i].startPunkt.getY());
                                rVekt[i].startPunkt.setY(restSteg);
                            }
                            kollaPosition();
                            break;
                        default:
                            break;

                    }
                }
            }
            //Test utskrift
            test();

        }
    }

    public void kollaPosition() {           //metod som jämför zebrors och geparders position
        for (int i = 0; i < rVekt.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < rVekt.length; j++) {
                    if (j % 2 != 0) {
                        //om zebrans x-pos = gepardens x-pos && zebrans y-pos = gepardens y-pos && geparden är hungrig.
                        if (rVekt[j].startPunkt.getX() == rVekt[i].startPunkt.getX() && rVekt[j].startPunkt.getY() == rVekt[i].startPunkt.getY()
                                && rVekt[j].getHungrig()) {
                            System.out.print("Zebra på plats " + i + " dog ");
                            rVekt[i].startPunkt.printInfo();
                            rVekt[i].setDead();
                            System.out.println("och skickas till Zebra kyrkogården. ");
                                    System.out.println("Gepard på plats " + j + " är mätt");
                            rVekt[j].setFull();
                            rVekt[j].startPunkt.printInfo();

                            //övertydlig information ovan så man ser på vilken punkt zebran dog.
                        }
                    }
                }
            }
        }
    }

    public void test() {         //test metod som skriver ut information om objekten
        for (int i = 0; i < rVekt.length; i++) {
            rVekt[i].printInfo();
        }
    }

    public boolean levandeZebra() {          //metod som kollar om det fortfarande finns zebror som lever och returnerar true/false.
        int levandeZebra = 0;
        for (int i = 0; i < rVekt.length; i++) {
            if (i % 2 == 0) {
                if (rVekt[i].getStatus()) {
                    levandeZebra++;
                }
            }
        }
        if (levandeZebra > 0) {
            return true;
        } else {
            return false;
        }
    }
}
