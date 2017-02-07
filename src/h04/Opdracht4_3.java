package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(5,30,20,10);
        g.setColor(Color.black);
        setBackground(Color.black);
        g.setColor(Color.red);
        g.fillRect(20,40, 150, 30);
        g.setColor(Color.white);
        g.fillRect(20,70,150,30);
        g.setColor(Color.blue);
        g.fillRect(20,100,150,30);
        g.setColor(Color.white);
        g.fillRect(10,40,10,200);


    }
}