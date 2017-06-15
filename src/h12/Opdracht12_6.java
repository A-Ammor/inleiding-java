package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anwar on 9-6-2017.
 */
public class Opdracht12_6 extends Applet implements ActionListener {
    int[] nummers = {2, 7, 2, 30, 12, 41, 3, 4, 2, 40, 30, 21, 43, 12};

    TextField tekstField;
    Button button;
    int aantalKeer;
    boolean gevonden;
    boolean nietGevonden;

    public void init() {
        tekstField = new TextField("", 10);
        button = new Button("Klik!");
        add(tekstField);
        add(button);
        button.addActionListener(this);
    }


    public void paint(Graphics g) {
        int x = 50;
        int y = 70;

        if (gevonden == true) {
            g.drawString("De waarde is gevonden en het komt " + aantalKeer + " keer voor", x, y);
        } else if (nietGevonden == true) {
            g.drawString("De waarde is niet gevonden", x, y);
        } else {
            g.drawString("Voer een waarde in", x, y);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int invoervak = Integer.parseInt(tekstField.getText());

        for (int i = 0; i < nummers.length; i++) {
            if (nummers[i] == invoervak) {
                aantalKeer++;
                gevonden = true;
                tekstField.setText("");
            } else {
                nietGevonden = true;
            }
            repaint();
        }
    }
}

