package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Spel extends JPanel {
    protected Spelplan s;
    public Robot[] rVekt;

    public Spel() {
        JFrame s = new Spelplan();
        s.setVisible(true);
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
                double riktning = Math.random() * (4 - 1) + 1;      //slumpmässigt tal som bestämmer vilket håll roboten ska gå.
                switch ((int) riktning) {
                    case 1:
                        rVekt[i].startPunkt.setX(Math.random() * (20 - 10) + 10);  //adderar till x co-ordinat
                        break;
                    case 2:
                        rVekt[i].startPunkt.setY(Math.random() * (20 - 10) + 10); //adderar till y co-ordinat
                        break;
                    case 3:
                        rVekt[i].startPunkt.setX2(Math.random() * (20 - 10) + 10); //subtraherar x co-ordinat
                        break;
                    case 4:
                        rVekt[i].startPunkt.setY2(Math.random() * (20 - 10) + 10); //subtraherar y co-ordinat
                        break;
                    default:
                        break;

                }
            }
            //Test utskrift
            rVekt[1].printInfo();

        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.fillRect(0,0, 400,400);

        g.setColor(Color.RED);
        g.fillRect(5,5,10,10);


    }
}


