package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht8_2 extends Applet {
    Button knopTest;
    int aantalMannen;
    int mannen;
    int vrouwen;
    int mannanleerlingen;
    int vrouwenleerlingen;
    int clickedall;

    public void init() {

        knopTest = new Button();
        knopTest.setLabel( "Mannen" );
        ManKnopListener ll = new ManKnopListener();
        knopTest.addActionListener( ll );
        add(knopTest);

        knopTest = new Button();
        knopTest.setLabel( "Vrouwen" );
        VrouwKnopListener dd = new VrouwKnopListener();
        knopTest.addActionListener( dd );
        add(knopTest);

        knopTest = new Button();
        knopTest.setLabel( "potentiële vrouwelijke leerlingen" );
        ManLeerlingListener ff = new ManLeerlingListener();
        knopTest.addActionListener( ff );
        add(knopTest);

        knopTest = new Button();
        knopTest.setLabel( "potentiële mannelijke leerlingen" );
        VrouwLeerlingListener gg = new VrouwLeerlingListener();
        knopTest.addActionListener( gg );
        add(knopTest);
    }

    public void paint(Graphics g) {
        clickedall = aantalMannen + mannen + vrouwen + mannanleerlingen + vrouwenleerlingen;
        g.drawString("Aantal Mannen " + mannen, 10, 80);
        g.drawString("Aantal Vrouwen " + vrouwen, 10, 100);
        g.drawString("Aantal potentiële vrouwen " + mannanleerlingen, 10, 120);
        g.drawString("Aantal potentiële mannen " + vrouwenleerlingen, 10, 140);
        g.drawString("Totaal aantal mensen " + clickedall, 10, 160);
    }

    class ManKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen++;
            repaint();
        }
    }
    class VrouwKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwen++;
            repaint();
        }
    }

    class ManLeerlingListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannanleerlingen++;
            repaint();
        }
    }

    class VrouwLeerlingListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwenleerlingen++;
            repaint();
        }
    }

}
