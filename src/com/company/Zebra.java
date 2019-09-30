package com.company;

public class Zebra extends Robot implements RobotInterface{

    public boolean isAlive;

    public Zebra() { //defaultkonstruktor
        isAlive = true;
        System.out.println("I Zebra default");

    }

    public boolean getStatus(){ //returnerar status true or false om zebran lever eller inte
        return isAlive;
    }

    @Override
    public void setDead(){      //en metod som vi kallar på när geparden äter upp zebran.
        this.isAlive = false;
        //"Zebra kyrkogård"
        this.startPunkt.setX(-200);
        this.startPunkt.setY(-200);
    }

    //används till test utskrift för att kolla position samt status på objektet.
    @Override
    public void printInfo() {
        System.out.println("Zebra med:");
        startPunkt.printInfo();
        System.out.println("Status (lever?): " + getStatus());
    }
}
