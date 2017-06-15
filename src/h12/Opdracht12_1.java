package h12;

import java.awt.*;
import java.applet.*;

public class Opdracht12_1 extends Applet {
    int[] salaris = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int som = 0;
    double average;

    public void init() {


        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 1 + teller;
            som = som + salaris[teller];

        }
         average = som / salaris.length ;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
            g.drawString("" + average, 80, 40);
        }
    }
}
