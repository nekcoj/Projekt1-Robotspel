package com.company;

import java.util.Scanner;

public class Spel {

    private Robot[] rVekt;

    public void antRobotar(){
        System.out.println("Hur många robotar vill du skapa?");
        Scanner scan = new Scanner(System.in);
        int antRobotar = scan.nextInt();
        rVekt = new Robot[antRobotar];
    }
}
