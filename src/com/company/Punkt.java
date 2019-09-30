package com.company;

public class Punkt {
    private double x, y;

    public Punkt() {        //default konstruktor som ger punkten ett random värde mellan 1-50
        x = Math.round(Math.random() * (50-1) + 1);
        y = Math.round(Math.random() * (50-1) + 1);
        //System.out.println("I Punkt default");
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    public void printInfo() {
        System.out.printf("Punkt med värdet x: %.2f och y: %.2f%n", this.x, this.y);
    }
}
