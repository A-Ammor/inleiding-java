package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_2 extends Applet {
    int uur, dag, jaar, secondenInEenMinuut, uitkomstdag, uitkomstuur, uitkomstjaar;


    public void init() {
        //Jaar heeft 365 dagen en in 1 dag zit 24 uur.
        uur = 1;
        dag = 24;
        jaar = 24 * 365;
        secondenInEenMinuut= 60;
        uitkomstuur = (uur * secondenInEenMinuut * secondenInEenMinuut);
        uitkomstdag = (dag * secondenInEenMinuut * secondenInEenMinuut);
        uitkomstjaar = (jaar * secondenInEenMinuut);
    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een uur: " + uitkomstuur, 20, 20);
        g.drawString("Seconden in een dag: " + uitkomstdag, 20, 40);
        g.drawString("Seconden in een jaar: " + uitkomstjaar, 20, 60);
    }
}