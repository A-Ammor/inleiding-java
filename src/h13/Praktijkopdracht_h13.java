package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aammo on 13-9-2017.
 */

public class Praktijkopdracht_h13 extends Applet {

    int count;
    int x = 80;
    int x1 = 53;
    int y1 = 45;
    int y = 120;
    int buttonPresses = 0;
    Button bomen;
    boolean bomenButton = false;

    public void berekening(Graphics g) {
        while (count < 10) {
            boom(g);
            count++;
            x += 90;
            x1 += 90;
            if (count == 5) {
                y = 300;
                x = 80;
                x1 = 53;
                y1 = 250;
            } else if (count == 10) {
                y = 480;
                x = 80;
                x1 = 53;
                y1 = 440;
            }
        }
    }

    public void position() {
        count = 0;
        x = 80;
        x1 = 53;
        y1 = 45;
        y = 120;
    }

    public void button() {
        bomen = new Button("Bomen");
        add(bomen);
        bomen.addActionListener(new KnopListener());
    }

    public void init() {
        setSize(800, 900);
        button();
    }

    public void paint(Graphics g) {
        if (bomenButton == true) {
            berekening(g);
            g.drawString("Je hebt de knop " + buttonPresses + " keer ingedrukt, telkens genereert dit nieuwe bomen! ", 75, 450);

        }
    }

    public void boom(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(x, y, 25, 120);
        g.setColor(Color.green);
        g.fillRoundRect(x1, y1, 80, 80, 80, 80);
        g.setColor(Color.black);
    }

    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            position();
            bomenButton = true;
            repaint();
            buttonPresses++;
        }
    }
}
