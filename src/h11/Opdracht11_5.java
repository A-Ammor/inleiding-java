package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_5 extends Applet {

    public void paint(Graphics g) {
        int x = 60;
        int y = 10;
        int width = 15;
        int height = 15;

        for (int plek = 1; plek < 6; plek++) {
            x += 15;
            y += 14;
            g.drawRect(x + 15, y + plek, width, height);
        }
    }
}
