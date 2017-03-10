package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_1 extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    Button knop;
    Button knopTest;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Typ iets in het tekstvak " +
                "en druk op de knop");
        tekstvak.addActionListener( new KnopListener() );
        tekstvak.addActionListener( new KnopListener2() );
        add(label);
        add(tekstvak);
        s = "";

        knop = new Button();
        knop.setLabel( "Ok" );
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);

        knopTest = new Button();
        knopTest.setLabel( "Reset" );
        KnopListener2 ll = new KnopListener2();
        knopTest.addActionListener( ll );
        add(knopTest);
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 80 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();

        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = "";
            repaint();
        }
    }
}
