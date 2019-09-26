package com.company;

public class Punkt {
    private int x, y;

    public Punkt() {
        x = 0;
        y = 0;
    }

    public Punkt(Punkt p) {
        x = getX();
        y = getY();
    }

    public void setX(int x) {
        if (x > 0) {
            this.x = x;
        } else {
            x = 0;
        }
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        if (y > 0) {
            this.y = y;
        } else {
            y = 0;
        }
    }

    public int getY() {
        return y;
    }
}
