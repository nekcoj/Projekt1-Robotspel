package com.company;

public class Gepard extends Robot {
    private boolean hungry;

    public Gepard() {   //defaultkonstruktor
        hungry = true;
        System.out.println("I Gepard default");
    }

    @Override
    public void printInfo() {
        System.out.println("Gepard med:");
        startPunkt.printInfo();
    }
}
