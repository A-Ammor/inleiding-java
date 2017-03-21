package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_5 extends Applet{
    double gem1, gem2, newcijfer, cijfer;
    Button knop1;
    Button knop2;
    TextField vak1;

    public void init() {
        setSize(400,200);
        vak1 = new TextField("",10);
        knop2 = new Button("reset");
        gem1 = 0;
        newcijfer = 0;
        cijfer = 0;
        Listen1 nc = new Listen1(); //Add a new number
        Listen2 re = new Listen2(); //Reset
        knop1 = new Button("Voeg een cijfer toe.");
        knop1.addActionListener(nc);
        knop2.addActionListener(re);
        add(vak1);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {

        if(gem1<0.01)
        {
            g.drawString("",100,100);
        }

        else if(gem2<5.5)
        {
            g.drawString("U bent gezakt.",100,100);
        }

        if(gem2>10.1)
        {
            g.drawString("Voer correcte cijfers in.",100,200);
        }

        else if(gem2>5.45 && gem2<10.1)
        {
            g.drawString("U bent geslaagd.",100,100);
        }


        g.drawString("uw gemiddelde is: " + (String.format("%.2f", Double.valueOf(gem2))), 100, 150);
    }

    class Listen1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            newcijfer = Double.parseDouble(vak1.getText());
            gem1++;
            cijfer = cijfer + newcijfer;
            gem2 = cijfer/gem1;
            repaint();
        }
    }

    class Listen2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            newcijfer = 0;
            gem1 = 0;
            gem2 = 0;
            cijfer = 0;
            repaint();
        }
    }
}