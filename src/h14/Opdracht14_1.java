package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aammo on 13-9-2017.
 */

public class Opdracht14_1 extends Applet {
    Button knop;
    boolean randomize; // kan randomize ook weghalen en dan de formule in actionlistener zetten.
    String[] cijfer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "Konining", "Koning"};
    String[] kleur = {"Klaver", "Ruite", "Harte", "Schoppen"};
    String kaartKleur = "";
    String kaartCijfer = "";


    public void paint(Graphics g) {
        if (randomize == true) {
            g.drawString("" + kaartKleur + " " + kaartCijfer , 50,60);
        }
    }

    public void berekening() {
        kaartKleur = kleur[(int) (Math.random() * kleur.length)];
        kaartCijfer = cijfer[(int) (Math.random() * cijfer.length)];
    }

    public void init(){
        button();
    }

    public void button() {
        knop = new Button("Random kaart");
        add(knop);
        knop.addActionListener(new KnopListener());
    }

    class KnopListener implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            randomize = true;
            berekening();
            repaint();
        }
    }
}
