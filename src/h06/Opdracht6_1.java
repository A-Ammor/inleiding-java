package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_1 extends Applet {
    double a, b, uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        //die Euro bij ali was een test gemaakt door (Anwar).
        g.drawString("Jan krijgt: €" + uitkomst, 20, 20);
        g.drawString("Ali krijgt: €" + uitkomst, 20, 40);
        g.drawString("Jeannette krijgt: €" + uitkomst, 20, 60);
        g.drawString("Anwar krijgt " + uitkomst + " Euro", 20, 80);
    }
}