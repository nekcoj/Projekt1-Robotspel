package com.company;

public class Robot {
    protected Punkt startPunkt;

    public Robot() { //konstruktor
        startPunkt = new Punkt();
        System.out.println("I Punkts default");
    }

    public void printInfo() {
        System.out.println("Robot har: ");
        startPunkt.printInfo();
    }
}
