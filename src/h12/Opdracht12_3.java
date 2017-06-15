package h12;

/**
 * Created by anwar on 6-6-2017.
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht12_3 extends Applet {
    TextField[] textfield;
    int[] getallen;
    Button b;


    public void init() {
        setSize(800, 200);
        textfield = new TextField[5];
        getallen = new int[5];


        for (int i = 0; i < textfield.length; i++) {
            textfield[i]= new TextField("", 10);
            add(textfield[i]);
        }

        b = new Button("klik op mij");
        add(b);
        b.addActionListener(new KnopListener());
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            for (int i = 0; i < textfield.length; i++) {
                getallen[i] = Integer.parseInt(textfield[i].getText());
            }

            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length; i++) {
                textfield[i].setText(String.valueOf(getallen[i]));
            }
        }
    }
}




