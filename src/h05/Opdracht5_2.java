package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5_2 extends Applet {

    int Valerie;
    int Jeroen;
    int Hans;
    int nulpunt, som_Valerie, som_Jeroen, som_Hans;

    public void init() {
        Valerie = 100;
        Jeroen = 40;
        Hans = 80;

        nulpunt=180;
        som_Valerie = nulpunt - Valerie;
        som_Hans = nulpunt - Hans;
        som_Jeroen = nulpunt - Jeroen;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawString("Valerie", 60, 200);
        g.fillRect(50,som_Valerie, 50, Valerie);
        g.setColor(Color.green);
        g.drawString("Jeroen", 110, 200);
        g.fillRect(100,som_Jeroen,50,Jeroen);
        g.setColor(Color.blue);
        g.drawString("Hans", 160, 200);
        g.fillRect(150,som_Hans,50,Hans);

        g.setColor(Color.black);
        g.drawString("0", 30, 210);
        g.drawString("20", 25, 160);
        g.drawString("40", 25, 140);
        g.drawString("60", 25, 120);
        g.drawString("80", 25, 100);
        g.drawString("100", 18, 80);
        g.drawString("120", 17, 60);
        g.drawLine(40,180,40,40);


    }
}

