package com.company;

public class Zebra extends Robot implements RobotInterface{

    public boolean isAlive;

    public Zebra() { //defaultkonstruktor
        isAlive = true;
        System.out.println("I Zebra default");

    }

    public boolean getStatus(){
        return isAlive;
    }

    @Override
    public void setDead(){
        this.isAlive = false;
        System.out.println("En Zebra dog!");
        this.startPunkt.setX(-200);
        this.startPunkt.setY(-200);     //om vi hade visat zebran grafiskt så hade vi slutat visa zebran här.
    }

    @Override
    public void printInfo() {
        System.out.println("Zebra med:");
        startPunkt.printInfo();
        System.out.println("Status (lever?): " + getStatus());
    }
}
