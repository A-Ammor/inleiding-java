package h13;
import java.applet.*;
import java.awt.*;

/**
 * Created by anwar on 16-6-2017.
 */

public class Opdracht13_1 extends Applet {

    public void paint(Graphics g) {
        tekenDriehoek(g);
    }

    void tekenDriehoek(Graphics g) {
        g.drawPolygon(new int[] {100, 200, 300}, new int[] {180, 20, 180}, 3);
    }
}

