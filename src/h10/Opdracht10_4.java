package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht10_4 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Label label1;
    Label label2;

    String tekst, s, dagen, jaar;
    int maand, jaars, schrikkeljaar, schrikkeljaarfalse;

    public void init(){
        Listen v1 = new Listen();
        label1 = new Label("type hier uw maand");
        tekstvak1 = new TextField("",20);
        tekstvak1.addActionListener(v1);
        add(label1);
        add(tekstvak1);

        label2 = new Label("type hier uw jaar");
        tekstvak2 = new TextField("",20);
        tekstvak2.addActionListener(v1);
        add(label2);
        add(tekstvak2);
    }

    class Listen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            jaar = tekstvak2.getText();
            maand = Integer.parseInt(s);
            jaars = Integer.parseInt(jaar);
            schrikkeljaar = jaars%4;
            schrikkeljaarfalse = jaars%400;
            switch (maand)
            {
                case 1:
                    tekst = "Januari";
                    dagen = "31";
                    break;

                case 2:
                    tekst = "Februari ";
                    if (schrikkeljaar ==0 &&!(schrikkeljaarfalse ==0)) {
                        dagen = "29";
                    }
                    else {
                        dagen = "28";
                    }
                    break;

                case 3:
                    tekst = "Maart ";
                    dagen = "31";
                    break;

                case 4:
                    tekst = "April";
                    dagen = "30";
                    break;

                case 5:
                    tekst = "Mei ";
                    dagen = "31";
                    break;

                case 6:
                    tekst = "Juni ";
                    dagen = "30";
                    break;

                case 7:
                    tekst = "Juli ";
                    dagen = "31";
                    break;

                case 8:
                    tekst = "Augustus ";
                    dagen = "31";
                    break;

                case 9:
                    tekst = "September ";
                    dagen = "30";
                    break;

                case 10:
                    tekst = "Oktober ";
                    dagen = "31";
                    break;

                case 11:
                    tekst = "November ";
                    dagen = "30";
                    break;

                case 12:
                    tekst = "December ";
                    dagen = "31";
                    break;

                default:
                    tekst = "Kies een nummer tussen 1 tot en met 12";
                    break;
            }
            repaint();
        }
    }
    public void paint (Graphics g) {
        g.drawString("de maand heet: " + tekst,50,120);
        g.drawString("de maand heeft " + dagen + " dagen",50,140);
    }
}
