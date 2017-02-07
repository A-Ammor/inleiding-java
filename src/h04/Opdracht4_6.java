package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRect(40,40,40,100);
        g.fillRect(55,140,10,100);
        g.setColor(Color.red);
        g.fillRoundRect(48,47,25,25,25,25);
        g.setColor(Color.orange);
        g.fillRoundRect(48,77,25,25,25,25);
        g.setColor(Color.green);
        g.fillRoundRect(48,107,25,25,25,25);
    }
}
