package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_8 extends Applet {

    public void paint(Graphics g) {
        setSize(1300, 1000);
        int x = 50;
        int y = 40;
        int width = 10;
        int height = 10;


        for (int plek = 1; plek < 100; plek++) {
            width += 10;
            height += 10;
            g.drawOval(x, y, width, height);
        }
    }
}
