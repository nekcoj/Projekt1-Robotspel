package com.company;

public class Punkt {
    private double x, y;

    public Punkt() {
        x = Math.round(Math.random() * (50-1) + 1);
        y = Math.round(Math.random() * (50-1) + 1);
        //System.out.println("I Punkt default");
    }

    /*public Punkt(int h, int w){     //endast till för att "illustrera" att roboten är en kvadrat.
        this.x += h;
        this.y += w;
        //System.out.println("I punkt int, int");
    }*/

    public void setX(double x) {        //metod för att flytta objektet längs x-axeln
        /*double xRest = x;
        for(int i = 0; i < x; i++){
            xRest--;
            if(this.x < 50){
                this.x++;
            } else{
                setY(xRest);                //om x blir 400 skickas restvärdet vidare till y-axeln
            }
        }*/
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        /*double yRest = y;
        for(int i = 0; i < y; i++){
            yRest--;
            if(this.y < 400){
                this.y++;
            } else{
                setX2(yRest);
            }
        }*/
        this.y = y;
    }

    /*public void setX2(double x) {
        double xRest = x;
        for(int i = (int)x; i > 0; i--){
            xRest--;
            if(this.x > 0){
                this.x--;
            } else {
                setY2(xRest);
            }
        }
    }*/

    /*public void setY2(double y) {
        double yRest = y;
        for(int i = (int)y; i > 0; i--){
            yRest--;
            if(this.y > 0){
                this.y--;
            } else {
                setX(yRest);
            }
        }
    }*/

    public double getY() {
        return this.y;
    }

    public void printInfo() {
        System.out.printf("Punkt med värdet x: %.2f och y: %.2f%n", this.x, this.y);
    }
}
