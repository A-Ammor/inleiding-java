package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_2 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        teller = 20;
        while (teller >= 10) {
            y += 20;
            g.drawString("Lijn: " + teller, 30, y);
            teller--;
        }
    }
}
