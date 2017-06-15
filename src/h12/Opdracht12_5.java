package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_5 extends Applet {
    int index;
    boolean gevonden;
    int[] salaris = {5, 7, 23, 12, 4, 33, 43, 7, 32, 80};
    Button b;
    TextField textfield;


    public void init() {
        index = -1;
        setSize(800, 200);
        gevonden = false;

        textfield = new TextField("", 10);
        add(textfield);

        b = new Button("OK");
        add(b);
        b.addActionListener(new KnopListener());
    }

    public void paint(Graphics g) {
        if (index >= 0) {
            if (gevonden) {
                g.drawString("De waarde is gevonden " + "op index " + index, 20, 50);
            } else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
        }

    }

    class KnopListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            int ingevuld = Integer.parseInt(textfield.getText());
            for (int i = 0; i < salaris.length; i++) {
                if (salaris[i] == ingevuld) {
                    index = i;
                    break;
                }
            }
            repaint();
        }


    }
}