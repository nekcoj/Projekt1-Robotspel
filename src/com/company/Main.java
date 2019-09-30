package com.company;

public class Main {
    public static void main(String[] args) {
        boolean continueGame = true;        //boolean för att avgöra om det finns zebror kvar och spelet ska köras igen.
        Spel s = new Spel();                //skapar spelet
        s.skapaRobot(s.antRobot());         //skapar robotvektor och robotar i vektorn med plats för av användaren angivet antal robotar
        while (continueGame) {              //medans continueGame = true dvs om några zebror lever så körs spelet igen.
            s.flyttaRobot();                //anropar metoden flyttaRobot() som hanterar robotarnas förflyttning på planen.
            continueGame = s.levandeZebra();// anropar metoden levandeZebra() för att kolla om det finns levande Zebror kvar i vektorn.
            for (int i = 0; i < s.rVekt.length; i++) {
                if (i % 2 != 0) {
                    s.rVekt[i].setHungrig();        //geparderna blir hungriga efter varje avslutad runda.
                }
            }
            if(continueGame){ System.out.printf("%nNy omgång!%n%n");}
        }
    }
}