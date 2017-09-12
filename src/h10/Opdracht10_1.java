package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_1 extends Applet {
    TextField tekstvak;
    Label label;
    String cijfer;
    double cijfer1, cijfer2;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new VakListener());
        label = new Label("typ hier uw getal en druk op enter");
        add(tekstvak);
        add(label);
        cijfer = "";
    }

    public void paint(Graphics g) {
        g.drawString(cijfer1 + "", 20, 40);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer2 = Double.parseDouble(tekstvak.getText());
            if ((cijfer2 > cijfer1)) {
                cijfer1 = cijfer2;
                tekstvak.setText(null);
                repaint();
            }
        }
    }
}