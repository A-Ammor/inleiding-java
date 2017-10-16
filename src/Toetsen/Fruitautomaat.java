package Toetsen;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Random;

public class Fruitautomaat extends Applet {

    int krediet, totaal;
    Button speel, koopPunten;
    private URL pad;

    int randomGetallenInt[] = new int[3];

    Image[] images = new Image[20];
    Image[] imagesSlot = new Image[3];
    boolean gekocht = false;

    public void init() {
        krediet = 10;

        speel = new Button("Speel");
        add(speel);
        speel.addActionListener(new KnopListenerSpeel());
        speel.setEnabled(false);

        koopPunten = new Button("Koop 10 kredietpunten");
        add(koopPunten);
        koopPunten.addActionListener(new KnopListenerKoop());
        koopPunten.setEnabled(false);

        pad = Fruitautomaat.class.getResource("/resources/");
        for (int i = 0; i < images.length; i++) {
            images[i] = getImage(pad, "fruit_" + i + ".jpg");
        }
        krediet();
        setRandomGetallen();
    }

    public void paint(Graphics g) {
        int machine = 95;

        g.drawString("" + krediet, 30, 30);
        if (gekocht == true) {
            getGraphics().drawString("Je hebt " + krediet + " gekocht, veel plezier and Good Luck!", 80, 250);
            gekocht = false;
        } else {
            g.drawString("Je hebt: " + totaal + " punten gewonnen", 80, 250);
        }

        for (int i = 0; i < 3; i++) {
            g.drawImage(imagesSlot[i], machine, 50, 70, 165, this);
            machine += 70;
        }
    }

    public void setRandomGetallen(){
        for (int i = 0; i < randomGetallenInt.length; i++) {
            Random r = new Random();
            randomGetallenInt[i] = r.nextInt(19) + 1;
            imagesSlot[i] = images[randomGetallenInt[i]];
        }
    }

    public void krediet() {
        if (krediet > 0) {
            speel.setEnabled(true);
            koopPunten.setEnabled(false);

        } else {
            speel.setEnabled(false);
            koopPunten.setEnabled(true);
        }
    }


    class KnopListenerSpeel implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            krediet --;
            totaal = 0;

            setRandomGetallen();
            repaint();
            if (randomGetallenInt[0] == randomGetallenInt[1] && randomGetallenInt[1] == randomGetallenInt[2]) {
                krediet += 20;
                totaal += 20;
            } else if (randomGetallenInt[0] == randomGetallenInt[1] || randomGetallenInt[1] == randomGetallenInt[2] || randomGetallenInt[0] == randomGetallenInt [2]) {
                krediet += 4;
                totaal += 4;
            }
            krediet();
        }
    }

    class KnopListenerKoop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gekocht = true;
            krediet += 10;
            totaal = 0;

            krediet();
            repaint();
        }
    }
}
