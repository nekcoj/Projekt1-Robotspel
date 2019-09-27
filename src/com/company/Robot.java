package com.company;

public class Robot {
    protected Punkt startPunkt, slutPunkt;

    public Robot() { //konstruktor
        startPunkt = new Punkt();
        slutPunkt = new Punkt(10,10);
        System.out.println("I Punkts default");
    }

    public void printInfo() {
        System.out.println("Robot har: ");
        startPunkt.printInfo();
    }
}
