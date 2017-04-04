package Toetsen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toets1 extends Applet {
    private int invoer, tijdInCanada, tijdInChina, tijdInAustralie, tijdInBrazilie;
    private Label Label;
    private TextField tekstvak;
    private Button button;
    private ActionListener e;
    private boolean click;

    public void init() {
        setSize(400, 300);
        Label = new Label("Voer een uur in: ");
        add(Label);

        tekstvak = new TextField("", 10);
        add(tekstvak);

        button = new Button("Toon tijden");
        Listener e = new Listener();
        button.addActionListener(e);
        button.addActionListener(new KnopListener());
        add(button);
    }


    public void paint(Graphics g) {
        if (click) {
            g.drawString("Tijd in Canada: " + tijdInCanada + ":00 uur", 100, 100);
            g.drawString("Tijd in Australie: " + tijdInAustralie + ":00 uur", 100, 120);
            g.drawString("Tijd in Brazilie: " + tijdInBrazilie + ":00 uur", 100, 140);
            g.drawString("Tijd in China: " + tijdInChina + ":00 uur", 100, 160);
        }
        if (invoer > 24) {
            g.drawString("voer geldige invoer in", 100, 180);
        }
    }


    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
            invoer = Integer.parseInt(tekstvak.getText());
            tijdInCanada = invoer - 6;
            if (invoer >= 0 && invoer <= 24) {
                getGraphics().drawString("", 70, 140);
            }
            if (tijdInCanada < 0) {
                tijdInCanada = tijdInCanada + 24;
            }
            if (tijdInCanada > 24) {
                tijdInCanada = tijdInCanada - 24;
            }

            tijdInChina = invoer + 8;
            if (invoer >= 0 && invoer <= 24) {
                getGraphics().drawString("", 70, 140);
            }
            if (tijdInChina > 24) {
                tijdInChina = tijdInChina - 24;
            }
            if (tijdInChina < 0) {
                tijdInChina = tijdInChina + 24;
            }

            tijdInBrazilie = invoer - 3;
            if (invoer >= 0 && invoer <= 24) {
                getGraphics().drawString("", 70, 140);
            }
            if (tijdInBrazilie > 24) {
                tijdInBrazilie = tijdInBrazilie - 24;
            }
            if (tijdInBrazilie < 0) {
                tijdInBrazilie = tijdInBrazilie + 24;
            }

            tijdInAustralie = invoer + 9;
            if (tijdInAustralie > 24) {
                tijdInAustralie = tijdInAustralie - 24;
            }
            if (tijdInAustralie < 0) {
                tijdInAustralie = tijdInAustralie + 24;
            }
            if (invoer > 24) {
                getGraphics().drawString("voer geldig invoer", 70, 100);
            }
        }

        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (!click) {
                    click = true;
                }
            }

        }

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!click) {
                click = true;
            }
        }
    }
}


