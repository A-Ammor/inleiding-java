package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(60, 80, 120, 80);
        g.drawRect(120, 100, 30, 20);
        g.drawRect(70, 120,20,40);
        g.drawPolygon(new int[] {60, 120, 180,}, new int[]{80, 20, 80}, 3);


    }
}