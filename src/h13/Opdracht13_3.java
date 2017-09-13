package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

/**
 * Created by anwar on 8-9-2017.
 */
public class Opdracht13_3 extends Applet {
    int startX = 15;
    int startY = 10;
    int width = 50;
    int height = 20;
    int spacing = 2;
    Button baksteen;
    boolean baksteenButton = false;

    int startXBlok = 800;
    int startYBlok = 10;
    int widthBlok = 60;
    int heightBlok = 30;
    int spacingBlok = 2;
    Button betonblok;
    boolean betonblokButton = false;

    public void init() {
        button();
    }

    public void paint(Graphics g) {
        if (baksteenButton == true) {
            bakstenen(g);
            betonblokButton = false;
        }

        if (betonblokButton == true) {
            betonblokken(g);
            baksteenButton = false;
        }
    }

    public void button() {
        baksteen = new Button("Baksteen");
        add(baksteen);
        baksteen.addActionListener(new KnopListener());

        betonblok = new Button("Betonblok");
        add(betonblok);
        betonblok.addActionListener(new KnopListener1());
    }

    public void bakstenen(Graphics g) {
        for (int i = 0; i < 13; i++) {
            int y = startY + (i * (height + spacing));
            for (int col = 0; col < 7; col++) {
                int x = startX + (col * (width + spacing));
                g.setColor(Color.RED);
                g.fillRect(x, y, width, height);
            }
        }
    }

    public void betonblokken(Graphics g) {
        for (int i = 0; i < 9; i++) {
            int y = startYBlok + (i * (heightBlok + spacingBlok));
            for (int col = 0; col < 7; col++) {
                int x = startXBlok + (col * (widthBlok + spacingBlok));
                g.setColor(Color.gray);
                g.fillRect(x, y, widthBlok, heightBlok);

            }
        }
    }

    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            baksteenButton = true;
            if (baksteenButton == true) {
                betonblokButton = false;
            }
            repaint();
        }
    }

    class KnopListener1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            betonblokButton = true;
            if (betonblokButton == true) {
                baksteenButton = false;

            }
            repaint();
        }
    }
}

