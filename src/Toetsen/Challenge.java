package Toetsen;

import java.awt.*;
import java.applet.*;

/**
 * Created by anwar on 19-5-2017.
 */
public class Challenge extends Applet {
    public void paint(Graphics g) {
        int teller;
        int y = 40;

        for (teller = 1; teller < 11  ; teller++){
            y += 20;
            if (teller == 5) {
                g.drawString("we zijn op de helft", 35, y);
            }else {
                g.drawString("Dit is regel: " + teller, 35, y);
            }
        }
    }
}

