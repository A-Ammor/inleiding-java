package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst, dagen, schrikkeljaar;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Typ het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("de maand heet: " + tekst,50,120);
        g.drawString("de maand heeft: " + dagen + " dagen",50,140);
        g.drawString("de schrikkeljaar heeft: " + schrikkeljaar + " dagen",50,160);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Januari";
                    dagen = "31 dagen";
                    break;

                case 2:
                    tekst = "Februari";
                    schrikkeljaar = "29";
                    dagen = "28";
                    break;

                case 3:
                    tekst = "Maart";
                    dagen = "31";
                    break;

                case 4:
                    tekst = "April";
                    dagen = "30";
                    break;

                case 5:
                    tekst = "Mei";
                    dagen = "31";
                    break;

                case 6:
                    tekst = "Juni";
                    dagen = "30";
                    break;

                case 7:
                    tekst = "Juli";
                    dagen =  "31";
                    break;

                case 8:
                    tekst = "Augustus";
                    dagen = "31";
                    break;

                case 9:
                    tekst = "September";
                    dagen = "30";
                    break;

                case 10:
                    tekst = "Oktober";
                    dagen = "31";
                    break;

                case 11:
                    tekst = "November";
                    dagen = "30";
                    break;

                case 12:
                    tekst = "December";
                    dagen  = "31 ";
                    break;

                default:
                    tekst = "Kies een nummer tussen 1 tot en met 12";
                    break;
            }
            repaint();
        }
    }
}