package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_7 extends Applet {

    public void paint(Graphics g) {
        setSize(600,550);
        int x = 300;
        int y = 250;
        int width = 10;
        int height = 10;


        for (int plek = 1; plek < 50; plek++) {
            width += 10;
            height +=10;
            x -= 5;
            y -= 5;
            g.drawOval(x, y, width, height);
        }
    }
}
