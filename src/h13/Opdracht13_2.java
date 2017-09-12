package h13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by anwar on 7-9-2017.
 */
public class Opdracht13_2 extends Applet {
    int startX = 15;
    int startY = 10;
    int width = 50;
    int height = 20;
    int spacing = 2;

    public void paint (Graphics g) {
        muur(g);
    }

    public void muur (Graphics g) {
        for (int i = 0; i < 13; i++) {
            int y = startY + (i * (height + spacing));
            for (int col = 0; col < 7; col++) {
                int x = startX + (col * (width + spacing));
                g.setColor(Color.RED);
                g.fillRect(x, y, width, height);
            }
        }
    }
}

