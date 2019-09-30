package com.company;

public class Robot implements RobotInterface{
    protected Punkt startPunkt;

    public Robot() { //konstruktor
        startPunkt = new Punkt();
        //System.out.println("I Robot default");
    }

    public void setFull(){} //endast till för att vi ska kunna använda Gepard-klassens motsvarighet.

    public void setDead(){} //endast till för att vi ska kunna använda Zebra-klassens motsvarighet

    //endast till för att vi ska kunna använda Gepard-klassens motsvarighet.
    public boolean getHungrig(){
        return true;
    }

    //endast till för att vi ska kunna använda Zebra- & Gepard-klassens motsvarighet
    public boolean getStatus(){
        return true;
    }

    public void setHungrig(){} //endast till för att vi ska kunna använda Gepard-klassens motsvarighet.


    public void printInfo() {
        System.out.println("Robot har: ");
        startPunkt.printInfo();
    }
}
