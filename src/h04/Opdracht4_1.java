package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawPolygon(new int[] {50, 70, 90,}, new int[]{100, 20, 100}, 3);
    }
}