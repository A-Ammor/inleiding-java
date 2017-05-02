package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_6 extends Applet {

    public void paint(Graphics g) {
        int x = 100;
        int y = 100;
        int width = 10;
        int height = 10;


        for (int plek = 1; plek < 6; plek++) {
            width += 10;
            height +=10;
            x -= 5;
            y -= 5;
            g.drawOval(x, y, width, height);
        }
    }
}
