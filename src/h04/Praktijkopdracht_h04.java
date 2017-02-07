package h04;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht_h04 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        //Eerste kolom

        // Lijn
        g.drawLine(20,20,120,20);
        g.drawString("Lijn", 60, 35);

        // Rechthoek
        g.drawRect(20,50,100,50);
        g.drawString("Rechthoek", 40, 115);

        //Afgeronde rechthoek
        g.drawRoundRect(20,120,100,50,30,30);
        g.drawString("Afgeronde rechthoek", 20, 185);

        //Tweede kolom

        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(160,50,100,50);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal", 130, 115);
        //Gevulde ovaal
        g.setColor(Color.black);
        g.drawOval(160,50,100,50);
        g.setColor(Color.magenta);
        g.fillOval(160,120,100,50);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 175, 185);


        //Derde kolom

        //Taartpunt met ovaal eromheen. begint bij 0 en hoek is 45 graden.
        g.setColor(Color.magenta);
        g.fillArc(330,50,100,45,0,45);
        g.setColor(Color.black);
        g.drawOval(330,50,100,45);
        g.drawString("Taartpunt met ovaal eromheen", 300, 115);

        //Cirkel
        g.drawRoundRect(350,120,50,50,50,50);
        g.drawString("Cirkel", 360, 185);

    }
}
