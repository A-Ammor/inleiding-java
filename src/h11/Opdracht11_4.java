package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_4 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int tafelVan;
        int maxNum;
        int Totaal;

        tafelVan = 3;   //<---- Typ hier de tafel dat je wilt weten (ik kon ook een textfield doen)
        maxNum = 10; //Hierdoor gaat de getal naar de max van de tafel hieronder voor meer info
        Totaal = tafelVan * maxNum; //Met totaal bedoel ik dat als je de tafel van 3 doet, dat het max 30 is en tafel van 4 max 40 etc

        for (teller = 0; teller <= Totaal; teller += tafelVan) {
            y += 20;
            g.drawString("Tafel van " + tafelVan + ":    " + teller, 30, y);
        }
    }
}
