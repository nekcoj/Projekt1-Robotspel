package com.company;


import javax.swing.*;
import java.awt.*;

public class Spelplan extends JFrame {
    //private JFrame spelplan = new JFrame("Robotar");    //skapar en spelplan (fönster)
    //public JPanel plan = new JPanel();                     //skapar en panel i fönstret



    public Spelplan() { //defaultkonstruktor
        setTitle("Robotar");
        setBounds(10,10,400,400);
        centrera(this);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel spelplan = new JPanel();
        this.add(spelplan);

        /*spelplan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        spelplan.setSize(400, 400);         //bestämmer storleken på fönstret
        spelplan.setLocationRelativeTo(null);
        plan.setLayout(new GridLayout(20, 20, 2, 2));
        //^bestämmer hur stor en panel ska vara och tjockleken på bordern.

        for (int i = 0; i < 400; i++) {     //loop som skapar paneler(rutor) i panelen plan.
            JPanel plan2 = new JPanel();
            //plan2.setBackground(Color.GREEN);        //bestämmer backgrundsfärgen på rutan vi skapar
            plan2.setBorder(BorderFactory.createLineBorder(Color.BLACK));   //bestämmer färgen på rutbordern
            plan.add(plan2);    //lägger in rutan i panelen plan
        }
        spelplan.setContentPane(plan);  //lägger in panelen plan med innehåll i fönstret spelplan
        spelplan.setVisible(true);  //gör så att fönstret blir synligt
*/

    }
    public void centrera(Window w){                 //metod för att centrera fönstret
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        setLocation((d.width - w.getWidth()) / 2,   (d.height - w.getHeight()) / 2);
    }
}