package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht5_1 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    //zie hieronder voor uitleg
    int eerste;
    int tweede;
    int derde;
    // zie hieronder voor uitleg
    int boven;
    int onder;

    public void init() {
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;
        // hieronder bedoel ik mee met welke kolom hij hoort.
        eerste = 20;
        tweede = 250;
        derde = 480;
        // hiermee bedoel ik welke lijn hij komt
        onder = 200;
        boven = 50;

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        //Eerste kolom

        // Lijn
        g.drawLine(eerste,20,120,20);

        // Rechthoek
        // Eerste kolom, bovenaan
        g.drawRect(eerste,boven,breedte,hoogte);

        //Afgeronde rechthoek
        // Eerste kolom, onderaan
        g.drawRoundRect(eerste,onder,breedte,hoogte,30,30);

        //Tweede kolom

        //Gevulde rechthoek met ovaal
        //Tweede kolom, bovenaan
        g.setColor(opvulkleur);
        g.fillRect(tweede,boven,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(tweede,boven,breedte,hoogte);

        //Gevulde ovaal
        // Tweede kolom, onderaan

        g.setColor(opvulkleur);
        g.fillOval(tweede,onder,breedte,hoogte);

        //Derde kolom

        //Taartpunt met ovaal eromheen. begint bij 0 en hoek is 45 graden.
        // Derde kolom, onderaan
        g.setColor(opvulkleur);
        g.fillArc(derde,boven,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawOval(derde,boven,breedte,hoogte);

        //Cirkel
        // Derde kolom, bovenaan
        g.drawRoundRect(derde,onder,hoogte,hoogte,hoogte,hoogte);

    }
}