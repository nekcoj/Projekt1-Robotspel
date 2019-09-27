package com.company;

public class Punkt {
    private double x, y;

    public Punkt() {
        x = getX();
        y = getY();
    }

    public Punkt(int h, int w){
        this.x += h;
        this.y += w;
        System.out.println("I punkt int, int");
    }

    public void setX(double x) {//metod för att flytta objektet längs x-axeln
        double xRest = x;
        for(int i = 0; i < x; i++){
            xRest--;
            if(this.x < 390){
                this.x++;
            } else{
                setY(xRest);                //om x blir 400 skickas restvärdet vidare till y-axeln
            }
        }
    }

    public double getX() {
        x = Math.random() * (390 - 1) + 1;
        return Math.round(x);
    }

    public void setY(double y) {
        double yRest = y;
        for(int i = 0; i < y; i++){
            yRest--;
            if(this.y < 390){
                this.y++;
            } else{
                setX2(yRest);
            }
        }
    }

    public void setX2(double x) {
        /*double x2 = this.x - x;
        if (this.y > x2 && this.x > 0) {
            for (int i = (int) x; i > 0; i--) {
                this.x--;
            }
        } else {
            setY2(x);
        }*/
        double xRest = x;
        for(int i = (int)x; i > 0; i--){
            xRest--;
            if(this.x > 0){
                this.x--;
            } else {
                setY2(xRest);
            }
        }
    }

    public void setY2(double y) {
        /*double y2 = this.y - y;
        if (this.y > y2 && this.y > 0) {
            for (int i = (int) y; i > 0; i--) {
                this.y--;
            }
        } else {
            setX(y);
        }*/
        double yRest = y;
        for(int i = (int)y; i > 0; i--){
            yRest--;
            if(this.y > 0){
                this.y--;
            } else {
                setX(yRest);
            }
        }
    }

    public double getY() {
        y = Math.random() * (390 - 1) + 1;
        return Math.round(y);
    }

    public void printInfo() {
        System.out.printf("Punkt med värdet x: %.2f och y: %.2f%n", this.x, this.y);
    }
}
