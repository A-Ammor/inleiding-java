package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht_h08 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Button plus;
    Button min;
    Button keer;
    Button delen;
    double ansplus;
    double andmin;
    double anskeer;
    double ansdelen;
    double minuitkomst1;
    double minuitkomst2;
    double plusuitkomst1;
    double plusuitkomst2;
    double keeruitkomst1;
    double keeruitkomst2;
    double delenuitkomst1;
    double delenuitkomst2;


    public void init() {
        setSize(500, 300);
        tekstvak1 = new TextField("", 20);
        add(tekstvak1);

        tekstvak2 = new TextField("", 20);
        add(tekstvak2);

        plus = new Button();
        plus.setLabel("+");
        KnopListenerplus aa = new KnopListenerplus();
        plus.addActionListener(aa);
        add(plus);
        plus.setBounds(140, 50, 20, 20);
        setLayout(null);{
            repaint();
        }

        min = new Button();
        min.setLabel("-");
        KnopListenermin ab = new KnopListenermin();
        min.addActionListener(ab);
        add(min);
        min.setBounds(170, 50, 20, 20);
        setLayout(null);{
            repaint();
        }

        keer = new Button();
        keer.setLabel("*");
        KnopListenerkeer ac = new KnopListenerkeer();
        keer.addActionListener(ac);
        add(keer);
        keer.setBounds(200, 50, 20, 20);
        setLayout(null);{
            repaint();
        }

        delen = new Button();
        delen.setLabel("/");
        KnopListenerdelen ad = new KnopListenerdelen();
        delen.addActionListener(ad);
        add(delen);
        delen.setBounds(230, 50, 20, 20);
        setLayout(null);{
            repaint();
        }
    }


    public void paint(Graphics g) {
    }
    class KnopListenerplus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            plusuitkomst1 = Double.parseDouble(tekstvak1.getText());
            plusuitkomst2 = Double.parseDouble(tekstvak2.getText());
            ansplus = plusuitkomst1 + plusuitkomst2;
            tekstvak1.setText("" + ansplus);
            tekstvak2.setText("");
            repaint();
        }
    }
    class KnopListenermin implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            minuitkomst1 = Double.parseDouble(tekstvak1.getText());
            minuitkomst2 = Double.parseDouble(tekstvak2.getText());
            andmin = minuitkomst1 - minuitkomst2;
            tekstvak1.setText("" + andmin);
            repaint();
        }
    }
    class KnopListenerkeer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            keeruitkomst1 = Double.parseDouble(tekstvak1.getText());
            keeruitkomst2 = Double.parseDouble(tekstvak2.getText());
            anskeer = keeruitkomst1 * keeruitkomst2;
            tekstvak1.setText("" + anskeer);
            repaint();
        }
    }

    class KnopListenerdelen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            delenuitkomst1 = Double.parseDouble(tekstvak1.getText());
            delenuitkomst2 = Double.parseDouble(tekstvak2.getText());
            ansdelen = delenuitkomst1 / delenuitkomst2;
            tekstvak1.setText("" + ansdelen);
            repaint();
        }
    }
}