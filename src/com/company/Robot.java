package com.company;

public class Robot {
    protected Punkt startPunkt;

    public Robot() { //konstruktor
        startPunkt = new Punkt();
        //System.out.println("I Robot default");
    }

    public void setFull(){}

    public void setDead(){}

    public boolean getHungrig(){
        return true;
    }

    public boolean getStatus(){
        return true;
    }

    public void setHungrig(){}


    public void printInfo() {
        System.out.println("Robot har: ");
        startPunkt.printInfo();
    }
}
