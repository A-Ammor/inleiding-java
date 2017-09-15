package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by aammo on 13-9-2017.
 */

public class Opdracht14_1 extends Applet {
    Button knop;
    boolean randomize; // kan randomize ook weghalen en dan de formule in actionlistener zetten.
    String[] cijfer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "Konining", "Koning"};
    String[] kleur = {"Klaver", "Ruiten", "Harte", "Schoppen"};
    String kaartKleur = "";
    String kaartCijfer = "";


    public void berekening() {
        kaartKleur = kleur[(int) (Math.random() * kleur.length)];
        kaartCijfer = cijfer[(int) (Math.random() * cijfer.length)];
    }

    public void paint(Graphics g) {
        if (randomize == true) {
            g.drawString("" + kaartKleur + " " + kaartCijfer , 50,60);
        }
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




/*

Andere optie, is precies het zelfde.

public class Opdracht14_1 extends Applet {
    Button knop;
    boolean randomize; // kan randomize ook weghalen en dan de formule in actionlistener zetten.
    String[] cijfer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "Konining", "Koning"};
    String[] kleur = {"Klaver", "Ruiten", "Harte", "Schoppen"};
    String kaartKleur = "";
    String kaartCijfer = "";


    public void berekening() {
        // kaartKleur = kleur[(int) (Math.random() * kleur.length)];
        // kaartCijfer = cijfer[(int) (Math.random() * cijfer.length)];
    }

    private String deelCijfer() {
        int random = new Random().nextInt(cijfer.length);
        String kaart = cijfer[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[cijfer.length];
        int hulpindex = 0;
        cijfer = hulpLijst;
        return kaart;
    }

    private String deelKleur() {
        int random = new Random().nextInt(kleur.length);
        String kaart = kleur[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[kleur.length ];
        int hulpindex = 0;
        return kaart;
    }

    public void paint(Graphics g) {
        if (randomize == true) {
            g.drawString("" + deelKleur() + " " + deelCijfer() , 50,60);
        }
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
            repaint();
        }
    }
}

 */
