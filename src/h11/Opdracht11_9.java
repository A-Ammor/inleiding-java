package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_9 extends Applet {

    public void paint(Graphics g) {

        int rij;   // rij nummer, van 0 tot 7
        int kolom;   // kolom nummer, van 0 tot 7
        int x, y;   // Links boven hoek van vierkant


        setSize(500, 500);
        g.drawRect(0,0,200,200);
        for (rij = 0; rij < 8; rij++) {
            for (kolom = 0; kolom < 8; kolom++) {
                x = kolom * 25;
                y = rij * 25;
                if ((rij % 2) == (kolom % 2))
                    g.setColor(Color.white);
                else
                    g.setColor(Color.black);
                g.fillRect(x, y, 25, 25);
            }
        }
    }
}
