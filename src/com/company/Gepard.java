package com.company;

public class Gepard extends Robot implements RobotInterface {
    private boolean hungrig;

    public Gepard() {   //defaultkonstruktor
        hungrig = true;
        System.out.println("I Gepard default");
    }
    @Override
    public void setFull(){
        hungrig = false;
        System.out.println("Geparden är mätt");
    }
    @Override
    public void setHungrig(){
        hungrig = true;
    }
    @Override
    public boolean getStatus(){
        return this.hungrig;
    }

    @Override
    public void printInfo() {
        System.out.println("Gepard med:");
        startPunkt.printInfo();
        System.out.println("Status (hungrig?): " + getStatus());
    }
}
