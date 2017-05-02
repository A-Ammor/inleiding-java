package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_1 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 1; teller < 11; teller++) {
            y += 20;
            g.drawLine(50, y, 300, y);
            g.drawString("Lijn: " + teller, 305, y);
        }
    }
}
