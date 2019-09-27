package com.company;

public class Zebra extends Robot {

    public Zebra() { //defaultkonstruktor
        System.out.println("I Zebra default");

    }

    @Override
    public void printInfo() {
        System.out.println("Zebra med:");
        startPunkt.printInfo();
    }
}
