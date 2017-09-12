package h02;

import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet

public class Opdracht2_1 extends Applet {

    public void init() {
        setBackground(Color.blue);

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("Justin", 50, 60);

    }
}


