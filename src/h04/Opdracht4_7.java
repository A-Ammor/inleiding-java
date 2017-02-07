package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRoundRect(60,60,100,100,25,25);
        g.fillRoundRect(80,80,20,20,20,20);
        g.fillRoundRect(120,80,20,20,20,20);
        g.fillRoundRect(80,120,20,20,20,20);
        g.fillRoundRect(120,120,20,20,20,20);

    }
}
