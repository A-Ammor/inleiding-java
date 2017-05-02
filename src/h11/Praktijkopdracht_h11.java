package h11;


import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht_h11 extends Applet {
    int x, y, getal;
    int tafel;
    TextField tekstvak;
    Label label;

    public void init() {
        setSize(500, 500);
        tafel = 0;
        label = new Label("typ hier uw getal en druk op enter");
        tekstvak = new TextField(2);
        Listen1 l1 = new Listen1();
        tekstvak.addActionListener(l1);
        add (label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        x = 50;
        y = 50;
        if (tafel > 0) {
            for (getal = 0; getal < 10; ) {
                y = y + 20;
                getal++;
                g.drawString(getal + " x " + tafel + " = " + tafel * getal, x, y);
            }
        }
    }

    class Listen1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel=(Integer.parseInt(tekstvak.getText()));
            repaint();
        }
    }
}