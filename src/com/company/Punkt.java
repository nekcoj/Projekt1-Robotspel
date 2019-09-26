package com.company;

public class Punkt {
    private double x, y;

    public Punkt() {
        x = getX();
        y = getY();
    }

    /*public Punkt(Punkt p) {
        x = getX();
        y = getY();
    }*/

    public void setX(double x) {
        if (x > 5) {
            this.x += x;
        } else {
            this.x -= x;
        }
    }

    public double getX() {
        x = Math.random() * (400 - 1) + 1;
        return Math.round(x);
    }

    public void setY(double y) {
        if (y > 5) {
            this.y += y;
        } else {
            this.y -= y;
        }
    }

    public double getY() {
        y = Math.random() * (400 - 1) + 1;
        return Math.round(y);
    }

    public void printInfo() {
        System.out.printf("Punkt med värdet x: %.2f och y: %.2f%n", this.x, this.y);
    }
}
