package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by aammo on 13-9-2017.
 */
public class Opdracht14_2 extends Applet {

    String[] cijfer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "Boer", "Konining", "Koning"};
    String[] kleur = {"Klaver", "Ruiten", "Harten", "Schoppen"};
    Button knop;
    boolean randomize;
    String[] deck = new String[52];
    int speler1 = 200;
    int speler2 = 400;
    int speler3 = 600;
    int speler4 = 800;
    int speler1y = 100;
    int speler2y = 100;
    int speler3y = 100;
    int speler4y = 100;


    // vergeet niet geluid erbij te doen
    // 2 for loops?
    // button
    // 4 spelers dingen 1 speler.length for loop en al die andere der onder zetten

    public void init() {
        setSize(1400, 1000);

        button();
    }

    public void button() {
        knop = new Button("Random kaart");
        add(knop);
        knop.addActionListener(new KnopListener());
    }

    private String kleurKaart() {
        int random = new Random().nextInt(kleur.length);
        String kaart = kleur[random];

        String[] hulpLijst = new String[kleur.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < kleur.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = kleur[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    private String cijferKaart() {
        int random = new Random().nextInt(cijfer.length);
        String kaart = cijfer[random];

        String[] hulpLijst = new String[cijfer.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < cijfer.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = cijfer[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    public void paint(Graphics g) {
        if (randomize == true) {
            berekening();
        }

    }

    public void berekening() {
        for (int i = 0; i < 13; i++) {
            getGraphics().drawString("" + kleurKaart() + " " + cijferKaart(), speler1, speler1y);

            speler1y += 20;
        }
        for (int i = 0; i < 13; i++) {
            getGraphics().drawString("" + kleurKaart() + " " + cijferKaart(), speler2, speler2y);

            speler2y += 20;
        }
        for (int i = 0; i < 13; i++) {
            getGraphics().drawString("" + kleurKaart() + " " + cijferKaart(), speler3, speler3y);

            speler3y += 20;
        }
        for (int i = 0; i < 13; i++) {
            getGraphics().drawString("" + kleurKaart() + " " + cijferKaart(), speler4, speler4y);

            speler4y += 20;
        }
        speler1y = 100;
        speler2y = 100;
        speler3y = 100;
        speler4y =100;

    }


    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            randomize = true;
            repaint();


        }
    }

}
