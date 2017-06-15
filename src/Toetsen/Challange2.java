package Toetsen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by anwar on 13-6-2017.
 */

public class Challange2 extends Applet implements ActionListener {
    TextField invoervak;
    Button button;
    boolean geklikt;
    String woorden;
    String[] woordenArray;

    public void init() {
        setSize(600, 350);
        invoervak = new TextField("", 20);
        button = new Button("Sorteren");

        add(invoervak);
        add(button);
        button.addActionListener(this);

        geklikt = false;
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 70;

        if (geklikt == true) {
            for (int i = 0; i < woordenArray.length; i++) {
                g.drawString(woordenArray[i], x, y);
                y += 20;
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (!invoervak.equals("")) {
            woorden = invoervak.getText();
            woordenArray = woorden.split(" ");
            Arrays.sort(woordenArray);
            geklikt = true;
        }
        repaint();
    }
}