package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_3 extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 1;
        b = 1;
        uitkomst = a+b;
    }

    public void paint(Graphics g) {
        //bij de uitleg stond er iets met -- en toen ging er iets eraf, dus met veel keer proberen kwam er dit uit
        //Hopelijk is het goed. waarschijnlijk zijn er meer manieren.
        uitkomst--;
        uitkomst--;
        uitkomst--;
        g.drawString("Positieve waarden word nu een negatief getal: " + uitkomst, 20, 20);
    }
}
