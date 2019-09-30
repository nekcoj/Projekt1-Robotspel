package com.company;

public class Main implements SpelInterface {
    public static void main(String[] args) {
        boolean continueGame = true;
        Spel s = new Spel();
        s.skapaRobot(s.antRobot());
        while (continueGame) {
            s.flyttaRobot();
            continueGame = s.levandeZebra();
            for (int i = 0; i < s.rVekt.length; i++) {
                if (i % 2 != 0) {
                    s.rVekt[i].setHungrig();
                }
            }
            if(continueGame){ System.out.printf("%nNy omgång!%n%n");}
        }
    }
}