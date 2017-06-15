package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht_h12 extends Applet implements ActionListener {

    TextField naamTextField;
    TextField telefoonTextfield;
    Button b;

    String[] namen;
    String[] nummers;
    int index;
    boolean geklikt;
    boolean fout;


    public void init() {
        setSize(600, 350);

        naamTextField = new TextField("", 10);
        telefoonTextfield = new TextField("", 10);
        b = new Button("OK");
        add(naamTextField);
        add(telefoonTextfield);
        add(b);
        b.addActionListener(this);
        namen = new String[10];
        nummers = new String[10];
        index = 0;
        geklikt = false;
        fout = false;
    }

    @Override
    public void paint(Graphics g) {
        if (geklikt) {
            int x = 50;
            int y = 70;

            for (int i = 0; i < nummers.length; i++) {
                g.drawString(namen[i], x, y);
                g.drawString(nummers[i], x + 70, y);
                y += 20;
            }

        }
        if (fout) {
            g.drawString("Voer beide tekstvelden in", 50, 90);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (index < 10) {

            String naam = naamTextField.getText();
            String telefoon = telefoonTextfield.getText();

            if (!naam.equals("") && !telefoon.equals("")) {
                geklikt = true;
                fout = false;
                namen[index] = naam;
                nummers[index] = telefoon;
                index++;
                naamTextField.setText("");
                telefoonTextfield.setText("");
                naamTextField.requestFocus();
            } else {
                fout = true;
                repaint();
            }
        }
        if (index == 10) {
            repaint();
        }
    }
}