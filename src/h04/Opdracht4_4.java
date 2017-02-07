package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawString("Valerie", 60, 200);
        g.fillRect(50,140, 50, 40);
        g.setColor(Color.green);
        g.drawString("Jeroen", 110, 200);
        g.fillRect(100,80,50,100);
        g.setColor(Color.blue);
        g.drawString("Hans", 160, 200);
        g.fillRect(150,100,50,80);

        g.setColor(Color.black);
        g.drawString("0", 30, 180);
        g.drawString("20", 25, 160);
        g.drawString("40", 25, 140);
        g.drawString("60", 25, 120);
        g.drawString("80", 25, 100);
        g.drawString("100", 18, 80);
        g.drawString("120", 17, 60);
        g.drawLine(40,180,40,40);


    }
}
