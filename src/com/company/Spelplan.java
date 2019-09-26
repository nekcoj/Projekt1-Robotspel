package com.company;


import javax.swing.*;
import java.awt.*;

public class Spelplan {
    private JFrame spelplan = new JFrame("Robotar");    //skapar en spelplan (fönster)
    public JPanel plan = new JPanel();                     //skapar en panel i fönstret

    public Spelplan() { //defaultkonstruktor
        spelplan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        spelplan.setSize(1024, 768);         //bestämmer storleken på fönstret
        plan.setLayout(new GridLayout(20, 20, 2, 2));
        //^bestämmer hur stor en panel ska vara och tjockleken på bordern.
        for (int i = 0; i < 400/*ändra denna till 400 för att få 400 (20 * 20) rutor*/; i++) {     //loop som skapar paneler(rutor) i panelen plan.
            JPanel plan2 = new JPanel();
            //plan2.setBackground(Color.GREEN);        //bestämmer backgrundsfärgen på rutan vi skapar
            plan2.setBorder(BorderFactory.createLineBorder(Color.BLACK));   //bestämmer färgen på rutbordern
            plan.add(plan2);    //lägger in rutan i panelen plan
        }
        spelplan.setContentPane(plan);  //lägger in panelen plan med innehåll i fönstret spelplan
        spelplan.setVisible(true);  //gör så att fönstret blir synligt
    }

}
