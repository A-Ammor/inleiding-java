package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_3 extends Applet {

    public void paint(Graphics g) {
        int num = 0;
        int num2 = 1;
        int teller;
        int y = 0;

        for (teller = 0; teller < 144; teller++) {
            teller = num + num2;
            num = num2;
            num2 = teller;
            y += 20;
            g.drawString("Lijn: " + teller, 30, y);
        }
    }
}
