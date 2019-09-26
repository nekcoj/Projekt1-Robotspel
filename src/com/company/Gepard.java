package com.company;

public class Gepard extends Robot {


    public Gepard() {   //defaultkonstruktor
        System.out.println("I Gepard default");
    }

    @Override
    public void printInfo() {
        System.out.println("Gepard med:");
        startPunkt.printInfo();
    }
}
