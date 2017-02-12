package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by anwar on 12-2-2017.
 */

public class Praktijkopdracht_h06 extends Applet {
    double uitkomst, cijfer1, cijfer2, cijfer3, alleCijfers;
    int gemiddelde;
    //andere double gemaakt omdat ik dat makkelijker vond.
    double uitkomstDouble, antwoordDouble;


    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        alleCijfers = 3;
        uitkomstDouble = gemiddelde;

        // uitkomst double is dat het van int naar double gaat en antwoord double is dat het antwoord met een komma is
        uitkomst = (cijfer1 + cijfer2 + cijfer3) / alleCijfers * 10;
        gemiddelde = (int) uitkomst;
        uitkomstDouble = gemiddelde;
        antwoordDouble = uitkomstDouble / 10;

    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + antwoordDouble + " easy", 20, 20);
    }
}