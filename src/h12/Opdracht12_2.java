package h12;


import java.awt.*;
import java.applet.*;

public class Opdracht12_2 extends Applet {
    Button[] button;

    public void init() {
        button = new Button [25];

        for (int teller = 0; teller < button.length; teller ++) {
            Button a = new Button("Button");
            add(a);
        }
    }
}
