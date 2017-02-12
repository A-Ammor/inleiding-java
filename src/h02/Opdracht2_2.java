package h02;


import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet

public class Opdracht2_2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Anwar", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Ammor", 50, 80 );

    }

}
