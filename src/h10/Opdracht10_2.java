package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht10_2 extends Applet {
    TextField tekstvak;
    Label label;
    double cijfer1,cijfer2, cijfer3;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new VakListener());
        label= new Label("typ hier uw getal en druk op enter");
        add(tekstvak);
        add (label);
    }

    public void paint(Graphics g){
        g.drawString("hoogte getal=" + cijfer1,50,60);
        g.drawString("laagste getal=" + cijfer3, 50,80);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer2 = Double.parseDouble(tekstvak.getText());
            if (cijfer3 == 0)
            {
                cijfer3 = cijfer2;
            }
            if ((cijfer2>cijfer1)) {
                cijfer1 = cijfer2;
                tekstvak.setText(null);
                repaint();
            }
            if ((cijfer2<cijfer1) &&(cijfer2<cijfer3)) {
                cijfer3 = cijfer2;
                tekstvak.setText(null);
                repaint();
            }
        }
    }
}